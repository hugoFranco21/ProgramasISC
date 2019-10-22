/*
	Hugo David Franco Avila
	15 / oct / 2019
	A01654856
	Segundo Examen Parcial
*/
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <string.h>
#include <fcntl.h>
#include <signal.h>
#include <sys/utsname.h>
#include <time.h>

int main(int argc, char *argv[]){
	int fif;
	if(argc < 3 || argc > 3){
		fprintf(stderr, "usage: %s pid pipe_name\n", argv[0]);
		return -1;
	}
	int pid, N, i;
	pid = atoi(argv[1]);
	if(pid <= 1){
		fprintf(stderr, "%s: must be greater than 1\n", argv[0]);
		return -2;
	}
	if((fif = open(argv[2], O_WRONLY)) < 0){
		fprintf(stderr, "%s: file not found\n", argv[2]);
		return -3;
	}
	srand(1234);
	N = (rand() % 100) + 1;
	int *buff;
	buff = malloc(N*sizeof(int));
	for(i = 0; i < N; i++){
		buff[i] = (rand() % 10000) + 1;
	}
	/*for(i = 0; i < N; i++){
		printf("%i ", buff[i]);
	}*/
	write(fif, buff, N*sizeof(int));
	close(fif);
	kill(pid, SIGUSR1);
	free(buff);
	return 0;
}
