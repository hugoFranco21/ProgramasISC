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

int main(int argc, char* argv[]) {
		int amount = 0, semid, i, pid;
	key_t key;
	
	if (argc != 1) {
		printf("usage: %s\n", argv[0]);
		return -1;
	}
	if ( (key = ftok("/dev/null", 69)) == (key_t) -1 ) {
		perror(argv[0]);
		return -2;
	}
	
	if ( (semid = semget(key, 7, 0666))  < 0 ) {
		perror(argv[0]);
		return -3;
	}
	printf("Santa initialized...\n");
	while(1){
		sem_wait(semid, SANTASEM, 1);
		sem_wait(semid, MUTEX, 1);
		if(semctl(semid, REINDEER, GETVAL, 0) >= 9){
			printf("Sleigh ready!\n");
			sem_signal(semid, REINDEERSEM, 9);
			sem_wait(semid, REINDEER, 9);
		} else if(semctl(semid, ELVES, GETVAL, 0) >= 3){
			printf("Helping elves...\n");
			sem_signal(semid, ELFSEM, 3);
			//sem_wait(semid, ELVES, 1);
		}
		sem_signal(semid, MUTEX, 1);
	}
	return 0;
}
