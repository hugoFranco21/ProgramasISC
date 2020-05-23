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

void renoCode(char* program) {
	int semid, i, k;
	key_t key;
	
	if ( (key = ftok("/dev/null", 69)) == (key_t) -1 ) {
		perror(program);
		exit(-1);
	}
	
	if ( (semid = semget(key, 7, 0666))  < 0 ) {
		perror(program);
		exit(-1);
	}
	srand(getpid());
	while(1){
		sem_wait(semid, MUTEX, 1);
		sem_signal(semid, REINDEER, 1);
		if(semctl(semid, REINDEER, GETVAL, 0) == 9){
			sem_signal(semid, SANTASEM, 1);
		}
		sem_signal(semid, MUTEX, 1);
		sem_wait(semid, REINDEERSEM, 1);
		printf("Reindeer is back from vacation!\n");
		sleep((rand() % 10) + 1);
	}
}

int main(int argc, char* argv[]) {
	int amount = 0, semid, i, pid;
	key_t key;
	
	if (argc != 1) {
		printf("usage: %s\n", argv[0]);
		return -1;
	}
	
	for (i = 0; i < 9; i++) {
		if ( (pid = fork()) < 0 ) {
			perror("fork");
			return -1;
		} else if (pid == 0) {
			renoCode(argv[0]);
		} else {
			//Do nothing
		}
	}
	return 0;
}
