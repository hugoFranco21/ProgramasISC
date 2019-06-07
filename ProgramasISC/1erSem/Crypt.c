#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>
#define SIZE 50

void encriptador(char arg[SIZE]);

int main(void){
	char mensaje [SIZE];
	printf("Este programa recibe un mensaje y lo encripta para que solo el que tenga la llava de desencriptacion pueda leerlo\n");
	printf("Ingrese el mensaje que desea encriptar\n");
	fgets(mensaje,SIZE,stdin);
	mensaje[strlen(mensaje)-1] = '\0';
	encriptador(mensaje);
}

void encriptador(char arg[SIZE]){
	char sal[SIZE];
	int temp[SIZE];
	int i = 0, j = 0;
	while(arg[i] != '\0'){
		//for(j = 0; j <= 26; j++){
		j = 0;
		while(temp[i] != j){
			if(arg[i] == 65 + j || arg[i] == 97 + j){
				temp[i] = j;
			}
			j++;
		}
		/*if(arg[i] == 65 || arg[i] == 97)
			temp[i] = 0;
		if(arg[i] == 66 || arg[i] == 98)
			temp[i] = 1;
		if(arg[i] == 67 || arg[i] == 98)
			temp[i] = 2;
		if(arg[i] == 68 || arg[i] == 99)
			temp[i] = 3;
		if(arg[i] == 69 || arg[i] == 97)
			temp[i] = ;
		if(arg[i] == 65 || arg[i] == 97)
			temp[i] = 0;
		if(arg[i] == 65 || arg[i] == 97)
			temp[i] = 0;
		if(arg[i] == 65 || arg[i] == 97)
			temp[i] = 0;
		if(arg[i] == 65 || arg[i] == 97)
			temp[i] = 0;
		if(arg[i] == 65 || arg[i] == 97)
			temp[i] = 0;
		if(arg[i] == 65 || arg[i] == 97)
			temp[i] = 0;
		if(arg[i] == 65 || arg[i] == 97)
			temp[i] = 0;
		if(arg[i] == 65 || arg[i] == 97)
			temp[i] = 0;
		if(arg[i] == 65 || arg[i] == 97)
			temp[i] = 0;
		if(arg[i] == 65 || arg[i] == 97)
			temp[i] = 0;
		if(arg[i] == 65 || arg[i] == 97)
			temp[i] = 0;
		if(arg[i] == 65 || arg[i] == 97)
			temp[i] = 0;
		if(arg[i] == 65 || arg[i] == 97)
			temp[i] = 0;
		if(arg[i] == 65 || arg[i] == 97)
			temp[i] = 0;
		if(arg[i] == 65 || arg[i] == 97)
			temp[i] = 0;
		if(arg[i] == 65 || arg[i] == 97)
			temp[i] = 0;
		if(arg[i] == 65 || arg[i] == 97)
			temp[i] = 0;
		if(arg[i] == 65 || arg[i] == 97)
			temp[i] = 0;
		if(arg[i] == 65 || arg[i] == 97)
			temp[i] = 0;
		if(arg[i] == 65 || arg[i] == 97)
			temp[i] = 0;
		if(arg[i] == 65 || arg[i] == 97)
			temp[i] = 0;
		*/
		i++;
	}
	for(i = 0; i < SIZE; i++){
		sal[i] = temp[i] + 97;
	}
	printf("Entrada:\n");
	puts(arg);
	printf("Salida:\n");
	puts(sal);
}