/*-------------------------------------------------------------

*

* Programación avanzada: Manejo de semáforos.

* Fecha: 25-Oct-2019

* Autor: 
		- Hugo Franco A01654856
		- Daniel Elias A01208905
*

*------------------------------------------------------------*/

#include "header.h"
#include <time.h>

void elfCode(char* program) {
	int semid, i, k;
	key_t key;
	
	if ( (key = ftok("/dev/null", 69)) == (key_t) -1 ) {
		perror(program);
		exit(-1);
	}
	
	if ( (semid = semget(key, 6, 0666))  < 0 ) {
		perror(program);
		exit(-1);
	}
	srand(getpid());
	while(1){
		sem_wait(semid, ELFTEX, 1);
		sem_wait(semid, MUTEX, 1);
		sem_signal(semid, ELVES, 1);
		if(semctl(semid, ELVES, GETVAL, 0) == 3){
			sem_signal(semid, SANTASEM, 1);
		} else {
			sem_signal(semid, ELFTEX, 1);
		}
		sem_signal(semid, MUTEX, 1);
		sem_wait(semid, ELFSEM, 1);
		printf("Elf ready to serve Lord Claus!\n");
		sem_wait(semid, MUTEX, 1);
		sem_wait(semid, ELVES, 1);
		if(semctl(semid, ELVES, GETVAL, 0) == 0){
			sem_signal(semid, ELFTEX, 1);
		}
		sem_signal(semid, MUTEX, 1);
		sleep((rand() % 10) + 1);
	}
}

int main(int argc, char* argv[]) {
	int amount = 0, semid, i, pid;
	key_t key;
	
	if (argc != 2) {
		printf("usage: %s amount\n", argv[0]);
		return -1;
	}
	
	amount = atoi(argv[1]);
	//printf("amount %i\n", amount);
	if(amount < 3){
		printf("At least 3 elves are needed to serve Santa!\n");
		return -2;
	}
	
	for (i = 0; i < amount; i++) {
		if ( (pid = fork()) < 0 ) {
			perror("fork");
			return -1;
		} else if (pid == 0) {
			elfCode(argv[0]);
		} else {
			//Do nothing
		}
	}
	return 0;
}
