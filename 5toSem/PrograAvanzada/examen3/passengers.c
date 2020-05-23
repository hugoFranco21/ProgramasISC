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

void passCode(char* program, int C) {
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
		sem_wait(semid, MUTEX, 1);
		if(semctl(semid, ENDPROG, GETVAL, 0) == 0){
			break;
		}
		sem_wait(semid, PASSENGERS, 1);

		sem_signal(semid, PASSENGERSON, 1);
		sem_signal(semid, MUTEX, 1);
		printf("Passenger arrived!\n");
		sem_wait(semid, MUTEX, 1);
		if(semctl(semid, PASSENGERSON, GETVAL, 0) == C){
			sem_signal(semid, RIDESSEM, 1);
			sem_signal(semid, PASSENGERS, semctl(semid, PASSENGERSON, GETVAL, 0));
		} else {

		}
		sem_signal(semid, MUTEX, 1);

		sleep((rand() % 10) + 1);
	}
}

int main(int argc, char* argv[]) {
	int N = 0, semid, i, pid, C = 0;
	key_t key;

	if (argc != 3) {
		printf("usage: %s [total_passengers] [passenger_per_cart]\n", argv[0]);
		return -1;
	}
	N = atoi(argv[1]);
	C = atoi(argv[2]);
	//printf("amount %i\n", amount);

	if(N < 1 || C < 1){
		printf("Program must receive positive integers!\n");
		return -2;
	}
	if(N <= C){
		printf("Total number of passengers must be greater than number of passengers per cart!\n");
		return -3;
	}
	//semctl(semid, PASSENGERSON, GETVAL, 0)
	for (i = 0; i < N; i++) {
		if ( (pid = fork()) < 0 ) {
			perror("fork");
			return -1;
		} else if (pid == 0) {
			passCode(argv[0], C);
		} else {
			//Do nothing
		}
	}
	return 0;
}
