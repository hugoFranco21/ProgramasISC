#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>
#define SIZE 50

int main(void){
	char arg[SIZE];
	char sal[SIZE];
	int temp[SIZE];
	int i = 0, j = 0;
	fgets(arg,SIZE,stdin);
	arg[strlen(arg)-1] = '\0';
	while(arg[i] != '\0'){
		//for(j = 0; j <= 26; j++){
		j = 0;
		while(temp[i] != j){
			if(arg[i] == 65 + j || arg[i] == 97 + j){
				temp[i] = j;
				printf("%d\n", temp[i]);
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
	printf("Fin rutina uno\n");
	while(arg[i] != '\0'){
		sal[i] = temp[i] + 97;
		i++;
	}
	sal[strlen(sal)-1] = '\0';
	printf("Entrada:\n");
	puts(arg);
	printf("Salida:\n");
	puts(sal);
}