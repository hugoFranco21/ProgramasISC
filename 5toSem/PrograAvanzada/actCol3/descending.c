#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <unistd.h>
#include <sys/wait.h>

void levelFork(int actual, int level){
	int i, j, niv, pid, ppid;
	if(actual < level){
		for(i = 0; i < actual; i++){
			fork();
			pid = getpid(); ppid = getppid();
			for(j = 0; j < actual; j++){
				printf("\t");
			}
			printf("PPID = %i PID = %i NIVEL = %i\n", pid, ppid, actual);
			niv = actual + 1;
			levelFork(niv, level);
		}
		wait(NULL);
	} else {
		for(i = 0; i < level; i++){
			fork();
			pid = getpid(); ppid = getppid();
			sleep(1);
			wait(NULL);
			for(j = 0; j < level; j++){
				printf("\t");
			}
			printf("PPID = %i PID = %i NIVEL = %i\n", ppid, pid, level);
		}
	}
}

int main(char argc, char *argv[]){
	int pid, num, result, rid, i;
	if(argc != 2){
		fprintf(stderr, "usage: descending number\n");
		return -2;
	}
	num = atoi(argv[1]);
	if(num < 1){
		fprintf(stderr, "descending: the parameter must be a positive integer\n");
		return -3;
	}
	printf("PPID = %i PID = %i NIVEL = 0\n", getppid(), getpid());
	levelFork(1, num);
	return 0;
}
