/*-------------------------------------------------------------

*

* Programación avanzada: Examen 3

* Fecha: 19-Nov-2019

* Autor:
		- Hugo Franco A01654856
*

*------------------------------------------------------------*/

#include "header.h"

int main(int argc, char* argv[]) {
	key_t key;
	int semid, i;
	unsigned short values[6];

	if (argc != 1) {
		printf("usage: %s\n", argv[0]);
		return -1;
	}

	if ( (key = ftok("/dev/null", 69)) == (key_t) -1 ) {
		perror(argv[0]);
		return -1;
	}

	if ( (semid = semget(key, 6, 0666 | IPC_CREAT)) < 0 ) {
		perror(argv[0]);
		return -1;
	}

	semctl(semid, MUTEX, SETVAL, 1);
	semctl(semid, PASSENGERS, SETVAL, 0);
	semctl(semid, PASSENGERSON, SETVAL, 0);
	semctl(semid, RIDES, SETVAL, 0);
	semctl(semid, RIDESSEM, SETVAL, 0);
	semctl(semid, ENDPROG, SETVAL, 1);

	semctl(semid, 0, GETALL, values);
	printf("values: ");
	for (i = 0; i < 6; i++) {
		printf("%3i", values[i]);
	}
	printf("\n");
	return 0;
}
