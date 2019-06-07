#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>

void inicia_matriz(int matx[3][3]);
void imprime_matriz(int matx[3][3]);
void llena_matriz(int matx[3][3]);
void suma_matriz(int matx[3][3], int maty[3][3]);
void print_matriz(int matx[3][3]);

int main(void){
	int matA[3][3], matB[3][3], matC[3][3];
	inicia_matriz(matA);
	print_matriz(matA);
	return 0;
}

void inicia_matriz(int matx[3][3]){
	int i, j;
	for(i = 0; i < 3; i++){
		for(j = 0; j < 3; j++){
			matx[i][j] = 0;
		}
	}
}

void print_matriz(int matx[3][3]){
	int i, j;
	for(i = 0;i < 3; i++){
		for(j = 0; j < 3; j++){
			printf("%i\t", matx[i][j]);
		}
		printf("\n");
	}
}

void llena_matriz(int matx[3][3]){
	int i, j;
	for(i = 0; i < 3; i++){
		for(j = 0; j < 3; j++){
			rand
		}
	}
}