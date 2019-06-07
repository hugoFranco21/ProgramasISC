#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define RENGLONES_MAX 3
#define COLUMNAS_MAX 3

void inicia_matriz(int matx[RENGLONES_MAX][COLUMNAS_MAX]);
void inicia_matriz_inversa(int matx[RENGLONES_MAX][COLUMNAS_MAX]);
void inicia_matriz_identidad(int matx[RENGLONES_MAX][COLUMNAS_MAX]);
void imprime_matriz(int matx[RENGLONES_MAX][COLUMNAS_MAX]);
int cuenta_positivos(int matx[RENGLONES_MAX][COLUMNAS_MAX]);
int suma_diagonal(int matx[RENGLONES_MAX][COLUMNAS_MAX]);
int mayor(int matx[RENGLONES_MAX][COLUMNAS_MAX]);

/*La funcion main es un menu, desde el cual el usuario puede elegir
una funcion para ser ejecutada por el programa, esto a traves de un 
switch. Se encuentra dentor de un ciclo do-while por lo que 
se ejecutara una vez y se seguira ejecutando hasta que el usuario
elija salir*/
int main(void){
	int matA[RENGLONES_MAX][COLUMNAS_MAX];
	char opc;
	do{
		printf("MENU DE OPCIONES\n");
		printf("1. Llena matriz.\n");
		printf("2. llena matriz inversa.\n");
		printf("3. llena matriz identidad\n");
		printf("4. Imprime matriz.\n");
		printf("5. Cuenta positivos en la matriz.\n");
		printf("6. Suma Diagonal.\n");
		printf("7. Mayor\n");
		printf("8. Salir\n");
		printf("Opcion: ");
		scanf(" %c", &opc);
		printf("\n");
		switch (opc){
			case '1':
				inicia_matriz(matA);
			break;
			
			case '2':
				inicia_matriz_inversa(matA);
			break;
			
			case '3':
				inicia_matriz_identidad(matA);
			break;
			
			case '4':
				imprime_matriz(matA);
			break;
			
			case '5':
				printf("%d\n", cuenta_positivos(matA));
			break;
			
			case '6':
				printf("%d\n", suma_diagonal(matA));
			break;
			
			case '7':
				printf("%d\n", mayor(matA));
			break;
			
			case '8':
			break;
			
			default:
				printf("La opcion ingresada es incorrecta\n\n");
		}
		
	} while(opc != '8');
	return 0;
}

/*Esta funcion llena con numeros sucesivos empezando por el 1 los espacios
de la matriz. Con ciclos for se elije el renglon y la columna, y con
un acumulador se va asignado el valor que debe ir en cada espacio*/
void inicia_matriz(int matx[RENGLONES_MAX][COLUMNAS_MAX]){
	int i, j, num = 0;
	for(i = 0; i < RENGLONES_MAX; i++){
		for(j = 0; j < COLUMNAS_MAX; j++){
			num = num + 1;
			matx[i][j] = num; 
		}
	}
}
	
/*Esta funcion imprime cada valor dentro de la matriz en forma de
cuadricula. Selecciona el renglon y la columna con el ciclo for,
y cada que termina un renglon, deja un espacio para empezar el
siguiente*/
void imprime_matriz(int matx[RENGLONES_MAX][COLUMNAS_MAX]){
	int i, j;
	for(i = 0; i < RENGLONES_MAX; i++){
		for(j = 0; j < COLUMNAS_MAX; j++){
			printf("%d ", matx[i][j]);
		}
		printf("\n");
	}
}

/*Esta funcion es exactamente igual a la de inicia_matriz, lo unico que hice
diferente es que en esta, no empiezo a sumarle 1 desde 0 para que mi primer
numero sea 1, le empiezo a sumar desde -5, para que mi primer
numero sea -4*/
void inicia_matriz_inversa(int matx[RENGLONES_MAX][COLUMNAS_MAX]){
	int i, j, num = -5;
	for(i = 0; i < RENGLONES_MAX; i++){
		for(j = 0; j < COLUMNAS_MAX; j++){
			num = num + 1;
			matx[i][j] = num; 
		}
	}
}

/*En esta funcion ocupo ciclos for para seleccionar el espacio de la 
matriz, y si i y j son iguales, se le asigna un 1 a ese espacio, y a todos
los demas un 0, por lo que va a desplegar 1 en la diagonal y 0 en 
los demas espacios*/
void inicia_matriz_identidad(int matx[RENGLONES_MAX][COLUMNAS_MAX]){
	int i, j;
	for(i = 0; i < RENGLONES_MAX; i++){
		for(j = 0; j < COLUMNAS_MAX; j++){
			if( i == j ){
				matx[i][j] = 1;
			} else{
				matx[i][j] = 0;
			}			
		}
	}
}

/*Esta funcion ocupa un ciclo for para sleccionar la localidad dentro
de la matriz, y para cada numero mayor o igual a 0, le va sumando 1 a 
un acumulador, que es lo que regreso al final de la funcion*/
int cuenta_positivos(int matx[RENGLONES_MAX][COLUMNAS_MAX]){
	int i, j, acu = 0;
	for(i = 0; i < RENGLONES_MAX; i++){
		for(j = 0; j < COLUMNAS_MAX; j++){
			if (matx[i][j] >= 0){
				acu += 1;
			}
		}
	}
	return acu;
}

/*Esta funcion usa un ciclo for para seleccionar el espacio dentro de
la matriz, y ocupando algo similar a la funcion de identidad, es decir
usando if en el que comparo el valor de i y j, unicamente voy
sumando esos valores y escribiendolos en una variable suma, que es la que
regreso al final de la funcion*/
int suma_diagonal(int matx[RENGLONES_MAX][COLUMNAS_MAX]){
	int i, j, suma = 0;
	for(i = 0; i < RENGLONES_MAX; i++){
		for(j = 0; j < COLUMNAS_MAX; j++){
			if (i == j){
				suma = suma + matx[i][j];
			}
		}
	}
	return suma;
}

/*Esta funcion utiliza un ciclo for para seleccionar la locacion del
espacio que se quiere checar dentro de la matriz. A una variable mayor
le asigno el valor de la localidad 0,0 para que pueda comparar ese valor
con los demas dentro de la matriz, y si encuentra un valor mayor al que 
tiene, lo escribe a si mismo. Al final de la funcion lo que regreso es esa
variable may.*/
int mayor(int matx[RENGLONES_MAX][COLUMNAS_MAX]){
	int i, j, may;
	may = matx[0][0];
	for(i = 0; i < RENGLONES_MAX; i++){
		for(j = 0; j < COLUMNAS_MAX; j++){
			if (may < matx[i][j]){
				may = matx[i][j];
			}
		}
	}
	return may;
}
