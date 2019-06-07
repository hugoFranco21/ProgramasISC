#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define SIZE 50
#define MAX 10

void recibe_arch(char cad[SIZE]);
char primer_char(char cad[SIZE]);
char segundo_char(char cad[SIZE]);
void imprime_nom(char arg[MAX][SIZE], int o, int p);
void ordenar(int o, int p, int r, char cad[MAX][SIZE], char arch[MAX][SIZE]);


/*Funcion principal main*/
int main(void){
	int i = 0, j = 0, k  = 0, n = 0, acu = 0;// variables enteras a utilizar
	FILE *pf;//apuntador a archivo
	char archivo[SIZE], nombres[MAX][SIZE], nombresor[MAX][SIZE];//declaracion de matrices de caracteres
	recibe_arch(archivo);//Se obtiene el nombre del archivo a abrir de stdin
	pf = fopen(archivo, "r");//direccion del apuntador, abrir en modo read
	//Salida del programa si no se haya el archivo
	if(pf == NULL){
		printf("archivo no encontrado");
		exit(0);
	}
	//Lee y asigna a lugares dentro de la matriz a los jugadores
	//hasta que termine el archivo
	while(!feof(pf)){
		fscanf(pf,"%*s %s %*s %*f", nombres[i]);//Escanea desde el archivo
		i++;//Incremento en el indice de la matriz		
	}
	j = 0;
	ordenar(j, i, k, nombres, nombresor);
	imprime_nom(nombresor, j , i);
	return 0;//fin del programa
}

/*Lee un string de stdin el cual se ocupara como el nombre del archivo
a abrir*/
void recibe_arch(char cad[SIZE]){
	fgets(cad, SIZE, stdin);
	cad[strlen(cad)-1] = '\0';
}

/*Regresa el caracter c, que ocupa la primera posicion en el 
string del nombre*/
char primer_char(char cad[SIZE]){
	int i = 0;
	char c;
	c = cad[i];
	return c;
}

/*Regresa el caracter c, que ocupa la segunda posicion en el 
string del nombre*/
char segundo_char(char cad[SIZE]){
	int i = 1;
	char c;
	c = cad[i];
	return c;
}

void ordenar(int o, int p, int r, char cad[MAX][SIZE], char arch[MAX][SIZE]){
	int n, q;
	while(o < p){
		q = 0; r = 0;//Reiniciar q y r a 0
			while(r < p){
				if(primer_char(cad[o]) > primer_char(cad[r])){
					q += 1;//numero de posiciones que se desplaza 
							 //empezando por el indice 0
					/*Sirve para corregir conflictos si el primer caracter es igual*/
				} else if(primer_char(cad[o]) == primer_char(cad[r])){
					if(segundo_char(cad[o]) > segundo_char(cad[r])){
						q += 1;//Si la segunda letra va despues en 
								//el alfabeto, se agrega una posicion
					} else{
						q = q;//Caso cuando se compara el mismo nombre
					}
				} else{
					q = q;//Cuando la primera letra viene antes en el
								//alfabeto
				}
				r++;//Compara nombres[o] con el siguiente nombre en la matriz
			}
			/*Escribe el nombre en la posicion dada en el ciclo while
			anterior, en otra matriz con las mismas caracteristicas*/
			for(n = 0; cad[o][n] != '\0'; n++){
				arch[q][n] = cad[o][n];
			}
			arch[q][n] = '\0';//Denotar fin correctamente al string
		o++;// Comparar para el siguiente nombre
	}
	o  = 0;//reiniciar j
}

/*Imprime el contenido de la cadena ordenada, ignora espacios nulos,
y caracteres diferentes a los alfanumericos para evitar conflictos 
en la salida de algunos archivos*/
void imprime_nom(char arg[MAX][SIZE], int o, int p){
	while(o < p){
		if(arg[o][0] >= 48 && arg[o][0] <= 57){
			printf("%s\n", arg[o]);
		}
		if (arg[o][0] >= 65 && arg[o][0] < 91){
			printf("%s\n", arg[o]);
		}
		if(arg[o][0] > 96 && arg[o][0] < 123){
			printf("%s\n", arg[o]);
		}
		o++;
	}
}


