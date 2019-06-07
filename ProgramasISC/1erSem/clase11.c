#include <stdlib.h>
#include <stdio.h>
#include <string.h>

int longitud(char str[100]);
int repite_caracter(char str[100], char let);
void to_upper(char str[100]);

int main(void){
	int lon, opc;
	char arr[100];
	char o;
	//do{
		printf("Que quiere hacer?\n");
		printf("1. Numero de caracteres validos\n");
		printf("2. Cuantas veces se repite el caracter\n");
		printf("3. Reemplace un caracter\n");
		printf("4.Invierte la cadena\n");
		printf("5. Cuantos caracteres tiene la cadena?\n");
		printf("6. La cadena es un palindromo\n");
		printf("7. Salir\n");
		//scanf("%d",&opc);
		printf("Introduzca la cadena\n");
		gets(arr);
		printf("\n");
		//switch (opc){
				lon = longitud(arr);
				printf("El numero de caracteres validos es %d\n\n", lon);
			//break;
			//case 2:
				scanf("%c",&o);
				printf("El caracter %c se repite %d veces\n", o, repite_caracter(arr, o));
				to_upper(arr);
				
			//break;
			//case 3:
			//break;
			//case 4:
			//break;
			//case 5:
			//break;
			//case 6:
			//break;
			//case 7:
			//break;
			//default:
			//printf("El numero de opcion es incorrecto\n\n");
		//} 
	//}while (opc != 7);
	return 0;
}

int longitud(char str[100]){
	int i = 0;
	while(str[i] != '\0'){
		i++;
	}
	return i;
}

int repite_caracter(char str[100], char let){
	int i = 0;
	int j = 0;
	while(str[i] != '\0'){
		if(str[i] == let)
			j++;
	i++;
	}
	return j;
}

void to_upper(char str[100]){
	int i = 0;
	while(str[i] != '\0'){
		if (str[i] >= 97 && str[i] <= 122){
			str[i] = str[i] - 32;
		}
	}
}

