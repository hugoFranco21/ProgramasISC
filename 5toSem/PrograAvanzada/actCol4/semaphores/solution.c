/*-------------------------------------------------------------

*

* Programación avanzada: Manejo de semáforos.

* Fecha: 25-Oct-2019

* Autor: 
		- Hugo Franco A01654856
		- Daniel Elias A01208905
*

*------------------------------------------------------------*/

#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/ipc.h>
#include <sys/sem.h>
#include <time.h>

#define	PRODUCER 	0
#define CONSUMER	1
#define	OCCUPIED	2
#define FREESPACE	3

int sem_wait(int semid, int sem_num, unsigned int val) {
	struct sembuf op;
	
	op.sem_num = sem_num;
	op.sem_op = -val;
	op.sem_flg = 0;
	return semop(semid, &op, 1);
}

int sem_signal(int semid, int sem_num, unsigned int val) {
	struct sembuf op;
	
	op.sem_num = sem_num;
	op.sem_op = val;
	op.sem_flg = 0;
	return semop(semid, &op, 1);
}

void a_producer(char* program) {
	int semid, i, k;
	key_t key;
	
	if ( (key = ftok("/dev/null", 69)) == (key_t) -1 ) {
		perror(program);
		exit(-1);
	}
	
	if ( (semid = semget(key, 4, 0666))  < 0 ) {
		perror(program);
		exit(-1);
	}
	
	srand(12345);
	k = 10;
	while (k-- > 0) {
		printf("Producer %i trying to access the buffer.\n", getpid());
		sem_wait(semid, PRODUCER, 1);
		printf("Producer %i accessing the buffer.\n", getpid());
		
		i = (rand() % 5) + 1;
		printf("Producer %i trying to put %i product(s) - free space = %i.\n", getpid(), i, semctl(semid, FREESPACE, GETVAL, 0));
		sem_wait(semid, FREESPACE, i);
		printf("Producer %i put their products.\n", getpid());
		sem_signal(semid, OCCUPIED, i);
		
		sem_signal(semid, PRODUCER, 1);
		printf("Producer %i is going to sleep.\n", getpid());
		
		sleep((rand() % 10) + 1);
	}
	exit(0);
}

void a_consumer(char* program) {
	int semid, i, k;
	key_t key;
	
	if ( (key = ftok("/dev/null", 69)) == (key_t) -1 ) {
		perror(program);
		exit(-1);
	}
	
	if ( (semid = semget(key, 4, 0666))  < 0 ) {
		perror(program);
		exit(-1);
	}
	
	srand(12345);
	k = 10;
	while (k-- > 0) {
		printf("Consumer %i trying to access the buffer.\n", getpid());
		sem_wait(semid, CONSUMER, 1);
		printf("Consumer %i accessing the buffer.\n", getpid());
		
		i = (rand() % 5) + 1;
		printf("Consumer %i trying to get %i product(s) - occupied space = %i\n", getpid(), i, semctl(semid, OCCUPIED, GETVAL, 0));
		sem_wait(semid, OCCUPIED, i);
		printf("Consumer %i took their products.\n", getpid());
		sem_signal(semid, FREESPACE, i);
		
		sem_signal(semid, CONSUMER, 1);
		printf("Consumer %i is going to sleep.\n", getpid());
		
		sleep((rand() % 10) + 1);
	}
	exit(0);
}

int main(int argc, char* argv[]) {
	int amount = 0, semid, i, pid;
	key_t key;
	
	if (argc != 2) {
		printf("usage: %s buffer_size\n", argv[0]);
		return -2;
	}
	unsigned short final_values[4];
	amount = atoi(argv[1]);
	if (amount < 1) {
		printf("%s: The amount must be a positive number greater than zero.\n", argv[0]);
		return -3;
	}
	//final_values=
	if ( (key = ftok("/dev/null", 69)) == (key_t) -1 ) {
		perror(argv[0]);
		return -1;
	}
	
	if ( (semid = semget(key, 4, 0666 | IPC_CREAT))  < 0 ) {
		perror(argv[0]);
		return -1;
	}
	
	semctl(semid, PRODUCER, SETVAL, 1);
	semctl(semid, CONSUMER, SETVAL, 1);
	semctl(semid, OCCUPIED, SETVAL, 0);
	semctl(semid, FREESPACE, SETVAL, size);
	
	semctl(semid, 0, GETALL, final_values);
	printf("values: ");
	for (i = 0; i < 4; i++) {
		printf("%3i", final_values[i]);
	}
	printf("\n");
	for (i = 0; i < amount; i++) {
		if ( (pid = fork()) < 0 ) {
			perror("fork");
			return -1;
		} else if (pid == 0) {
			a_consumer(argv[0]);
		} else {
			a_producer(argv[0]);
		}
	}
	return 0;
}
