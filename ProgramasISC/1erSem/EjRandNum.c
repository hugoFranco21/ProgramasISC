#include <stdlib.h>
#include <stdio.h>
#include <time.h>

int numeros_aleatorios(int r);

void main(){
	int s, h;
	srand(time(NULL));
	printf("Cuantos numeros aleatorios quiere generar?\n");
	scanf("%d", &s);
	printf("\nEntre el 0 y que numero?\n");
	printf("0 y ");
	scanf("%d",&h);
	printf("\n");
	system("pause");
	for(int i=1;i<=s;i++){
		int random = numeros_aleatorios(h);
		printf("Num aleatorio entre 0 y %d : %d \n", h, random);
	};
}

int numeros_aleatorios(int r){
	return rand()%r+1;
}