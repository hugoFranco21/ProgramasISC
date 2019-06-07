#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>
#include <time.h>
#define SIZE 50

void encriptador(char arg[SIZE], int x);
void desencripta(char arg[SIZE], int x);

/*La funcion main es un menu, en el cual se le dice al usuario que este
programa sirve para encriptar o desencriptar un mensaje. Tiene un 
switch desde el cual se mete a un caso en el que corre una funcion que tiene
de argumento un string, en este caso, el mensaje*/
int main(void){
	char mensaje [SIZE];
	int opc;
	srand(time(NULL));
	int r = rand() % 10;
	do{
		printf("Este programa recibe un mensaje y lo encripta, o desencripta, para que solo el que tenga la llave de desencriptacion pueda leerlo\n");
		printf("1. Encriptar\n");
		printf("2. Desencriptar\n");
		printf("3. Salir\n");
		scanf(" %d", &opc);
		switch(opc){
			case 1:
				while(getchar() != '\n');
				printf("Ingrese el mensaje\n");
				fgets(mensaje,SIZE,stdin);
				mensaje[strlen(mensaje)-1] = '\0';
				encriptador(mensaje, r + 48);
			break;
			
			case 2:
				while(getchar() != '\n');
				printf("Ingrese el mensaje\n");
				fgets(mensaje,SIZE,stdin);
				mensaje[strlen(mensaje)-1] = '\0';
				desencripta(mensaje, r + 48);
			break;
			
			case 3: 
			break;
			
			default:
				printf("La opcion ingresada es incorrecta\n");
		}
	} while(opc != 3);
}

/*Esta funcion recibe el mensaje de manera que la quiso decir el usuario
y lo imprime, junto al mensaje ya encriptado, el algoritmo de encriptacion
por diferentes razones, no me pudo quedar tan complejo como tenia pensado
pero aun asi funciona bien. Cuando tiene letra se desplaza 3 espacios*
en la tabal ascii y si es espacio se usa un caracter aleatorio*/
void encriptador(char arg[SIZE], int x){
	char sal[SIZE];
	int i = 0;
	char xx = x;
	while(arg[i] != '\0'){
		if(arg[i] == ' '){
			sal[i] = xx;
		} else{
		sal[i] = arg[i] + 3;
		}
		i++;
	}
	sal[i] = '\0';
	printf("Entrada:\n");
	puts(arg);
	printf("Salida:\n");
	puts(sal);
	printf("\n");
}

/*Esat funcion recibe un mensaje encriptado (se recomiendda que 
se ocupe a salida de la funcion anterior), y lo desencripta,
que unicamente es el reverso de la funcion de encriptacion*/
void desencripta(char arg[SIZE], int x){
	char sal[SIZE];
	int i = 0;
	char xx = x;
	while(arg[i] != '\0'){
		if(arg[i] == xx){
			sal[i] = ' ';
		} else{
		sal[i] = arg[i] - 3;
		}
		i++;
	}
	sal[i] = '\0';
	printf("Entrada:\n");
	puts(arg);
	printf("Salida:\n");
	puts(sal);
	printf("\n");
}