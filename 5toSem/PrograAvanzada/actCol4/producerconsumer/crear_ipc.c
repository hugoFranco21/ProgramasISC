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

int main(int argc, char* argv[]) {
	int size = 0, semid, i;
	unsigned short final_values[7];
	key_t key;
	
	if (argc != 1) {
		printf("usage: %s\n", argv[0]);
		return -1;
	}
	
	if ( (key = ftok("/dev/null", 69)) == (key_t) -1 ) {
		perror(argv[0]);
		return -2;
	}
	
	if ( (semid = semget(key, 7, 0666 | IPC_CREAT))  < 0 ) {
		perror(argv[0]);
		return -3;
	}
	
	semctl(semid, ELVES, SETVAL, 0);
	semctl(semid, REINDEER, SETVAL, 0);
	semctl(semid, SANTASEM, SETVAL, 0);
	semctl(semid, REINDEERSEM, SETVAL, 0);
	semctl(semid, ELFTEX, SETVAL, 1);
	semctl(semid, MUTEX, SETVAL, 1);
	semctl(semid, ELFSEM, SETVAL, 0);
	
	semctl(semid, 0, GETALL, final_values);
	printf("values: ");
	for (i = 0; i < 7; i++) {
		printf("%3i", final_values[i]);
	}
	printf("\n");
	return 0;
}
