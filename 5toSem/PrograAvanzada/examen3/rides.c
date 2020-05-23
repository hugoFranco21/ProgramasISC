/*-------------------------------------------------------------

*

* Programación avanzada: Examen 3

* Fecha: 19-Nov-2019

* Autor:
		- Hugo Franco A01654856
*

*------------------------------------------------------------*/
#include "header.h"
#include <time.h>

int main(int argc, char* argv[]) {
		int amount = 0, semid, i, pid;
	key_t key;

	if (argc != 2) {
		printf("usage: %s [number_of_rides]\n", argv[0]);
		return -1;
	}
	amount = atoi(argv[1]);
	if(amount < 1){
		printf("Number of rides must be a positive integer\n");
		return -2;
	}
	if ( (key = ftok("/dev/null", 69)) == (key_t) -1 ) {
		perror(argv[0]);
		return -2;
	}

	if ( (semid = semget(key, 6, 0666))  < 0 ) {
		perror(argv[0]);
		return -3;
	}
	printf("Ride accepting passengers!\n");
	sem_signal(semid, RIDES, amount);
	while(1){
		sem_wait(semid, RIDESSEM, 1);
		sem_wait(semid, MUTEX, 1);
		printf("Ride departing!\n");
		sem_wait(semid, RIDES, 1);
		sem_wait(semid, RIDESSEM, 1);
		for(i = 0; i < semctl(semid, PASSENGERSON, GETVAL, 0); i++){
			printf("Passenger getting off\n");
		}
		if(semctl(semid, RIDES, GETVAL, 0) == 0){
			printf("The ride has closed. Come back tomorrow\n");
			sem_wait(semid, ENDPROG, 1);
			sem_signal(semid, MUTEX, 1);
			break;
		}
		sem_signal(semid, MUTEX, 1);
	}
	return 0;
}
