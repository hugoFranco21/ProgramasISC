#include <stdlib.h>
#include <stdio.h>
#include <math.h>

void inicializa_arreglo(int arre[10]);
void imprime_arreglo(int arre[10]);
void captura_arreglo(int arre[10]);
int cuenta_impares(int arre[10]);
void sustituye_arreglo(int arre[10], int x, int y);
void invierte_arreglo(int arre[10]);

/*La funcion main despliega un menu que le da al usuario
6 funciones diferentes y una opcion para salir del loop.
Las opciones estan en un ciclo do-while, y se seleccionan por 
medio de un switch, en cada opcion se llama a la funcion
correspondiente.*/
int main(void){
	int opc, i, tot, m, n;
	int arr[10];
	do{
		printf("MENU DE OPCIONES\n");
		printf("1. Inicializa arreglo\n");
		printf("2. Captura arreglo\n");
		printf("3. Imprime arreglo\n");
		printf("4. Elementos impares en el arreglo\n");
		printf("5. Sustituye arreglo\n");
		printf("6. Invierte arreglo\n");
		printf("7. Salir\n");
		printf("Opcion: \n");
		scanf("%d",&opc);
		switch(opc){
			case 1:
				inicializa_arreglo(arr);
				imprime_arreglo(arr);
			break;
			case 2:
				captura_arreglo(arr);
				imprime_arreglo(arr);
			break;
			case 3:
				imprime_arreglo(arr); 
			break;
			case 4:
				captura_arreglo(arr);
				tot = cuenta_impares(arr);
				printf("%d\n\n", tot);
			break;
			case 5:
				captura_arreglo(arr);
				scanf("%d", &m);
				scanf("%d", &n);
				sustituye_arreglo(arr, m, n);
				imprime_arreglo(arr);
			break;
			case 6:
				captura_arreglo(arr);
				invierte_arreglo(arr);
				imprime_arreglo(arr);
			break;
			case 7:
			break;
			default:
				printf("La opcion introducida es incorrecta\n\n");
		}
	} while(opc != 7);
	return  0;
}

/*Esta funcion con un ciclo for, le asigna a cada posicion
del vector un valor de 0.*/
void inicializa_arreglo(int arre[10]){
	int i;
	for(i = 0; i < 10; i++){
		arre[i] = 0;
	}
}

/*Esta funcion es llamada varias veces por la funcion principal.
Esto es porque es la que ocupo para poder desplegar el arreglo
en la consola.*/
void imprime_arreglo(int arre[10]){
	int i;
	for(i = 0; i < 10; i++){
		printf("%d ", arre[i]);
	}
	printf("\n\n");
}

/*Esta funcion realiza la captura de datos para cada posicion 
del vector, se selecciona la posicion con un for.*/
void captura_arreglo(int arre[10]){
	int i;
	for(i = 0; i < 10; i++){
		scanf("%d", &arre[i]);
	}
}

/*Esta es la unica funcion que espero que me regrese algun valor,
en este caso es un acumulador que se va a incrementar cada 
que la funcion modulo del dato del vector con el 2 sea diferente
de 0.*/
int cuenta_impares(int arre[10]){
	int i;
	int j = 0;
	for(i = 0; i < 10; i++){
		if (arre[i] % 2 != 0)
			j++;
	}
	return j;
}

/* Esta funcion fue muy sencilla, unicamente analiza si el dato 
dentro del vector es igual al valor de x, y si lo es, sustituye
x con el valor ingresado de y. Gracias al for puede revisar en todo
el vector.*/
void sustituye_arreglo(int arre[10], int x, int y){
	int i;
	for(i = 0; i < 10; i++){
		if (arre[i] == x)
			arre[i] = y;
	}
}

/*En esta funcion, hago el uso de dos variables temporales, en las 
que guardo el dato de los vectores para que no se pierdan, y despues
los escribo en la posicion opuesta, el ciclo for nadamas hace
esto 5 veces ya que si no e regresaria al vector inicial.*/
void invierte_arreglo(int arre[10]){
	int i;
	int j = 9;
	int temp, temp2;
	for(i = 0; i < 5; i++, j--){
		temp2 = arre[i];
		temp = arre[j];
		arre[j] = temp2;
		arre[i] = temp;
	}
}