#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define SIZE 100

void recibe_archivo(char arc[SIZE]);
float primer_lugar(float m[5]);
float ultimo_lugar(float m[5]);
void ROT_13(char c);

/*La funcion main es un menu, en el cual se presentan 3 opciones al 
usuario, las primeras dos trabajan de una manera similar. Con un apuntador
abren un archivo desde el cual se van a leer datos. En cada caso del 
switch llaman a una funcion para pedir el nombre del archivo.*/ 
int main(void){
	int i = 0, j = 0, k, n = 0;
	float p[5], mayo;
	char opc, archivo[SIZE], pl[5][SIZE], mensaje[SIZE], cf;
	FILE *pf;
	do{
		printf("menu\n");
		printf("1) primer_lugar\n");
		printf("2) ultimo_lugar\n");
		printf("3) mensaje_secreto\n");
		printf("4) salir\n");
		scanf(" %c", &opc);
		i = 0; j = 0; k = 0;
		switch(opc){
			case '1':
				while(getchar()!='\n');
				recibe_archivo(archivo);
				pf = fopen(archivo, "r");
				if(pf == NULL){
					printf("Error");
					exit(-1);
				}
				while(!feof(pf)){
					fscanf(pf, "%*s %s %*s %f", pl[i], &p[i]);
					i++;
				}
				fclose(pf);
				while(j < i){
					if(primer_lugar(p) == p[j]){
						k = j;
					}
					j++;
				}
				puts(pl[k]);
			break;
			
			case '2':
				while(getchar()!='\n');
				recibe_archivo(archivo);
				pf = fopen(archivo, "r");
				if(pf == NULL){
					printf("Error");
					exit(-1);
				}
				while(!feof(pf)){
					fscanf(pf, "%*s %s %*s %f", pl[i], &p[i]);
					i++;
				}
				fclose(pf);
				while(j < i){
					if(ultimo_lugar(p) == p[j]){
						k = j;
					}
					j++;
				}
				puts(pl[k]);
			break;
			
			case '3':
				while(getchar() != '\n');
				recibe_archivo(archivo);
				pf = fopen(archivo, "r");
				if(pf == NULL){
					printf("ERROR\n");
					exit(-1);
				}
				fscanf(pf, "%c", &cf);
				while(!feof(pf)){
					ROT_13(cf);
					fscanf(pf, "%c", &cf);
				} 
				printf("\n");
				fclose(pf);
			break;
			
			case '4':
			break;
		}
	} while(opc != '4');
	return 0;
}

/*Esta funcion lee un string desde la consola y lo asigna a un arreglo de
caracteres*/
void recibe_archivo(char arc[SIZE]){
	fgets(arc,SIZE,stdin);
	arc[strlen(arc)-1] = '\0';
}

/*Esta funcion analiza un array de numeros float, y los compara para ver
cual es el mas alto entre ellos, con el resultado puedo ver quien es
el jugador con la mayor puntuacion*/
float primer_lugar(float m[5]){
	int i = 0;
	float may = m[0];
	for(i = 0; i < 5; i++){
		if( may < m[i])
			may = m[i];
	}
	return may;
}	

/*Esta funcion es exactamente igual a la anterior, la unica diferencia
es que en esta, va a regresar el numero mas pequeno del array*/
float ultimo_lugar(float m[5]){
	int i = 0;
	float may = m[0];
	for(i = 0; i < 5; i++){
		if( may > m[i])
			may = m[i];
	}
	return may;
}	

/*Esta funcion recibe el input del fscanf en main, y hace la respectiva
conversion del caracter usando el estandar rot-13*/
void ROT_13(char c){
		if(( c >= 65 && c <= 77) || (c >= 97 && c <= 109)){
			c = c + 13;
		} else if ((c >= 78 && c<= 90) || (c >= 110 && c <= 122)){
			c = c - 13;
		} else if(c == 32){
			c = c;
		} else{
			c = c;
		}
		printf("%c", c);
}

