#include <stdlib.h>
#include <stdio.h>
#include <math.h>
#include <time.h>

int loteria (void);
void banco(void);

/*La funcion main sirve como un menu en el cual se le pregunta
el usuario que opcion desea elegir, con lo que se entra a un
switch en el que se ejecuta las funciones en los diferentes
casos. Hay una opcion que lo saca del loop de repeticion*/
int main (void){
	int lotto[6];
	int opc, i;
	srand(time(NULL));
	
	do{
	printf("Introduzca la opcion que desea ejecutar:\n");
	printf("1. Predictor de los numeros del Melate\n");
	printf("2. Monedero electronico\n");
	printf("3. Salir\n");
	printf("Opcion: ");
	scanf("%d",&opc);
	switch(opc){
		case 1:
			for(i = 0; i <= 5 ; i++){
				lotto[i] = loteria();
			}
			i = 0;
			printf("Los numeros ganadores de la loteria son:\n");
			do{
				printf("%d ", lotto[i]);
				i++;
			} while ( i <= 5); 
			printf("\n\n");
		break;
		case 2:
			banco();
		break;
		case 3:
			printf("Va a salir del programa\n\n");
		break;	
		default:
			printf("La opcion introducida no es correcta\n\n");
	}	
	} while (opc != 3);
	
	return 0;
}

/*Esta funcion devuelve un numero entre el 1 y el 59 que son
entre los que se ubican los numeros del melate*/
int loteria(void){
	return rand()%59+1;
}

void banco(void){
	float sum = 0;
	int i, x;
	int arr[x-1];
	printf("Cuantos articulos va a llevar?\n");
	scanf("%d",&x);
	printf("Introduzca el costo de cada uno\n");
	for(i = 0; i < x; i++){
		scanf("%d", &arr[i]);
		sum += arr[i];
	}
	printf("El total de sus compras es $ %0.2f\n", sum);
	printf("Con IVA sale en $ %0.2f\n", sum*1.16);
	printf("Con esta compra acumula %0.0f puntos\n\n", (sum*1.16)/10);
	
}
	

