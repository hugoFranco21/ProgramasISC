#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#define MAX 50

int cromosomas_X(char ar[MAX]);
int cromosomas_Y(char ar[MAX]);
void determina(char ar[MAX], int x, int y);
void imprime_limpio(char ar[MAX]);
void limpia_arreglo(char entrada[MAX], char salida[MAX]);

int main(void){
	char arg[MAX],ars[MAX], opc;
	do{
		printf("MENU\n");
		printf("1. Determinar el sexo\n");
		printf("2. Imprimir sin espacios\n");
		printf("3. Copiar arreglo sin espacios\n");
		printf("4. Salir\n");
		printf("Opcion: ");
		scanf(" %c", &opc);
		switch(opc){
			case '1':	
				while(getchar()!='\n');
				fgets(arg,MAX,stdin);
				arg[strlen(arg)-1]='\0';			
				determina(arg, cromosomas_X(arg), cromosomas_Y(arg));
			break;
			
			case '2':
				while(getchar()!='\n');
				fgets(arg,MAX,stdin);
				arg[strlen(arg)-1]='\0';
				imprime_limpio(arg);
			break;
			
			case '3':
				while(getchar()!='\n');
				fgets(arg,MAX,stdin);
				arg[strlen(arg)-1]='\0';
				limpia_arreglo(arg,ars);			
			case '4':
			break;
			
			default:
			printf("La opcion introducida es incorrecta\n");
		}
	} while(opc != '4');
	return 0;
}

int cromosomas_X(char ar[MAX]){
	int i, j = 0;
	for(i = 0; i < MAX; i++){
		if (ar[i] == 'x' || ar[i] == 'X')
			j++;
	}
	return j;
}


int cromosomas_Y(char ar[MAX]){
	int i, j = 0;
	for(i = 0; i < MAX; i++){
		if (ar[i] == 'y' || ar[i] == 'Y')
			j++;
	}
	return j;
}

void determina(char ar[MAX], int x, int y){
	if(x > y){
		printf("\nFemenino\n");
	} else if(y > x){
		printf("\nMasculino\n");
	} else{
		printf("\nIndefinido\n");
	}
}

void imprime_limpio(char ar[MAX]){
	int i = 0;
	do{
		if (ar[i] != ' '){
			printf("%c", ar[i]);
		}
		i++;
	} while(ar[i] != '\0');
	printf("\n");
}

void limpia_arreglo(char entrada[MAX], char salida[MAX]){
	printf("\n");
	int i = 0, j = 0;
	do{
		if(entrada[i] != ' '){
			salida[j] = entrada[i];
			j++;
		}
		i++;
	} while(entrada[i] != '\0');
	salida[j] = '\0';
	puts(salida);
}

