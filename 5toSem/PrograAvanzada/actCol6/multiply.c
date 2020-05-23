#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <pthread.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <string.h>

int main(int argc, char* argv[]) {

	int numth, numa, numb, i, j;
	FILE *fa, *fb;

	//Validacion args
	if (argc == 7) {
		if (strcmp(argv[1], "-a") == 0) {
			if(strcmp(argv[3], "-b") == 0){
				if(strcmp(argv[5], "-t") == 0){
					//Do nothing
				} else {
					printf("%s: expected -t, found %s\n", argv[0], argv[5]);
					return -5;
				}
			} else {
				printf("%s: expected -b, found %s\n", argv[0], argv[3]);
				return -4;
			}
		} else {
			printf("%s: expected -a, found %s\n", argv[0], argv[1]);
			return -3;
		}
	} else {
		printf("usage: %s [-a] [file_matA] [-b] [file_matB] [-t] [number_of_threads]\n", argv[0]);
		return -2;
	}
	fa = fopen(argv[2], "r");
	if(fa == 0){
		printf("%s is not a valid file for Matrix A, it does not exist\n", argv[2]);
		return -6;
	}
	fb = fopen(argv[4], "r");
	if(fb == 0){
		printf("%s is not a valid file for Matrix B, it does not exist\n", argv[4]);
		return -7;
	}
	numth = atoi(argv[6]);
	if(numth < 1){
		printf("Number of threads must be greater or equal to 1\n");
		return -8;
	}
	fscanf(fa, "%i", &numa);
	fscanf(fb, "%i", &numb);
	if(numa != numb){
		printf("Matrixes do not have the same dimensions\n");
		return -9;
	}

	//Alocacion de memoria dinamica
	float **matA = (float **)malloc(numa * sizeof(float *));
  for (i=0; i<numa; i++)
  	matA[i] = (float *)malloc(numa * sizeof(float));
	float **matB = (float **)malloc(numb * sizeof(float *));
	for (i=0; i<numb; i++)
		matB[i] = (float *)malloc(numb * sizeof(float));

	//Leer datos y guardarlos en la matriz
	for(i = 0; i < numa; i++){
		for(j = 0; j < numb; j++){
			fscanf(fa, "%f", &matA[i][j]);
		}
	}
	for(i = 0; i < numa; i++){
		for(j = 0; j < numb; j++){
			fscanf(fb, "%f", &matB[i][j]);
		}
	}

	//Para imprimir el contenido de las matrices
	/*for(i = 0; i < numa; i++){
		for(j = 0; j < numb; j++){
			printf("%f ", matA[i][j]);
		}
		printf("\n");
	}
	for(i = 0; i < numa; i++){
		for(j = 0; j < numb; j++){
			printf("%f ", matB[i][j]);
		}
		printf("\n");
	}*/

	//Liberacion de memoria dinamica
	for(int i = 0; i < numa; i++){
		free(matA[i]);
		free(matB[i]);
	}
	free(matA);
	free(matB);

	//Cerrar archivos
	fclose(fa);
	fclose(fb);
	return 0;
}
