/*
	Hugo David Franco Avila
	15 / oct /2019
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
#include <sys/stat.h>

#define PATH_MAX 256

char name[PATH_MAX];

double calcMed(int *array){
	double media = 0;
	int i, count = 1;
	for(i = 0; i < 100; i++){
		if(array[i] == 0){
			break;
		}
		media += array[i];
		count++;
	}
	return media/count;
}

void handler1(int sig){
	int fd;
	if((fd = open(name, O_RDONLY)) < 0){
		printf("Archivo no existe\n");
	} else {
		int *buff;
		buff = malloc(100*sizeof(int));
		read(fd, buff, 100*sizeof(int));
		double avg;
		avg = calcMed(buff);
		free(buff);
		printf("avg = %f\n", avg);
	}	
}

void handler2(int sig){
		remove(name);
    exit(0);
}

int main(int argc, char *argv[]){
	//char nombre[NAME_MAX];
	if(argc != 2){
		fprintf(stderr, "usage: %s pipe_name\n", argv[0]);
		return -1;
	} else {
		strcpy(name, argv[1]);
	}
	printf("%i\n", getpid());
	mkfifo(argv[1], 0666);
	
	signal(SIGUSR1, handler1);
	signal(SIGUSR2, handler2);
	while(1) {
  	pause();
  }
	remove(argv[1]);
	return 0;
	
}
   


