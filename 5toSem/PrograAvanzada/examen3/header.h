/*-------------------------------------------------------------

*

* Programación avanzada: Examen 3

* Fecha: 19-Nov-2019

* Autor:
		- Hugo Franco A01654856
*

*------------------------------------------------------------*/

#ifndef HEADER_H
#define HEADER_H

#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/ipc.h>
#include <sys/sem.h>

#define MUTEX 	0
#define PASSENGERS	1
#define PASSENGERSON	2
#define RIDES	3
#define RIDESSEM	4
#define ENDPROG 5

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

#endif
