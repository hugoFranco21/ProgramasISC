#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
#define SIZE 100

void recibe_archivo(char ar[SIZE]);
int mas(int a[10]);
int menos(int a[10]);
void nfl(int a[10], int b[10], int c[10], int d[10], int e[10], char o[10][SIZE], char p[10][SIZE], char q[10][SIZE]);
void cifra_men(char ar [SIZE], char arg[SIZE]);
char ROT_13(char c);

/*La funcion main es un menu que le da al usuario la posibilidad
de hacer 2 cosas. En la primera lee un archivo con estadisticas de los 
jugadores de la NFL, y dependiendo del input del usuario, lo despliega.
Y la segunda funcion crea o escribe en un archivo nombrado por el usuario,
y codifica la entrada del usuario*/
int main(void){
	FILE *pf, *pf1;
	int comp[10], att[10], yrd[10], td[10], cep[10], i = 0, j = 0;
	char opc, archivo[SIZE], qbn[10][SIZE], qbl[10][SIZE], team[10][SIZE], mensaje[SIZE], mensaje1[SIZE], regre[SIZE];
	do{
		printf("Que desea hacer?\n");
		printf("a. Informacion sobre los QB's de la NFL\n");
		printf("b. Cifrar un texto\n");
		printf("c. Salir\n");
		scanf(" %c", &opc);
		i = 0;
		switch(opc){
			case 'a':
				pf = fopen("NFLqb.txt","r");
				if(pf == NULL){
					printf("Error");
					exit(-1);
				}
				while(!feof(pf)){
					fscanf(pf, "%s %s %s %d %d %d %d %d", qbn[i], qbl[i], team[i], &comp[i], &att[i], &yrd[i], &td[i], &cep[i]);
					i++;
				}
				fclose(pf);
				nfl(comp, att, yrd, td, cep, qbn, qbl, team);				
			break;
			
			case 'b':
				while(getchar() != '\n');
				printf("Ingrese un nombre de archivo con la terminacion .txt\n");
				recibe_archivo(archivo);
				pf = fopen(archivo, "w");
				if(pf == NULL){
					printf("Error");
					exit(-1);
				}
				printf("Ingrese el texto a cifrar\n");
				cifra_men(mensaje, mensaje1);
				fputs(mensaje, pf);
				fputs("\n", pf);
				fputs(mensaje1, pf);
				fclose(pf);
				printf("Ahora vamos a leer del archivo\n");
				pf1 = fopen(archivo, "r");
				if(pf == NULL){
					printf("Error");
					exit(-1);
				}
				while(fgets(regre, SIZE, pf1)){
					fputs(regre, stdout);
				}
				printf("\n");
				
			break;
			
			case 'c':
			break;
			
			default:
				printf("Opcion incorrecta\n");
		}		
	} while(opc != 'c');
	return 0;
}

/*Esta funcion recibe el nombre de un archivo y lo guarda en un string*/
void recibe_archivo(char ar[SIZE]){
	fgets(ar, SIZE, stdin);
	ar[strlen(ar)-1] = '\0';
}

/*Esta funcion compara unos numeros y regresa el numero mas grande*/
int mas(int a[10]){
	int i = 0, may;
	may = a[0];
	for(i = 0; i < 10; i++){
		if(may < a[i]){
			may = a[i];
		}
	}
	return may;
}

/*Esta funcion compara numeros y regresa el mas pequeno*/
int menos(int a[10]){
	int i = 0, may;
	may = a[0];
	for(i = 0; i < 10; i++){
		if(may > a[i]){
			may = a[i];
		}
	}
	return may;
}

/*Esta funcion despliega un menu con 5 opciones que son las estadisticas que
el usuario desea leer, y mostrara al jugador y su equipo con mas, y con
menos de la respectiva estadistica. Recibe de parametros lo leido
del archivo.*/
void nfl(int y[10], int b[10], int c[10], int d[10], int e[10], char o[10][SIZE], char p[10][SIZE], char q[10][SIZE]){
	char cd;
	int i = 0, j, k;
	printf("Esta opcion va a leer un archivo con datos de los 10 QB's con mas yardas de la NFL y va a dar algunas de sus estadisticas\n");
	printf("Sobre que estadistica desea conocer:\n");
	printf("1. Pases completos\n");
	printf("2. Intentos de pase\n");
	printf("3. Yardas por aire\n");
	printf("4. Touchdowns por aire\n");
	printf("5. Intercepciones\n");
	scanf(" %c", &cd);
	switch(cd){
		case '1': 
			//printf("%d\n", mas(y));
			i = 0;
			while(i < 10){
				if(mas(y) == y[i]){
					j = i;
				}
				i++;
			}
			//printf("%d\n", j);
			//printf("%d\n", menos(y));
			i = 0;
			while(i < 10){
				if(menos(y) == y[i]){
					k = i;
				}
				i++;
			}
			//printf("%d\n", k);
			printf("Jugador con mas pases completos: %s %s del equipo %s, con %d\n", o[j], p[j], q[j], mas(y));
			printf("Jugador con menos pases completos: %s %s del equipo %s, con %d\n", o[k], p[k], q[k], menos(y));
		break;
		
		case '2':
			//printf("%d\n", mas(b));
			i = 0;
			while(i < 10){
				if(mas(b) == b[i]){
					j = i;
				}
				i++;
			}
			//printf("%d\n", j);
			//printf("%d\n", menos(b));
			i = 0;
			while(i < 10){
				if(menos(b) == b[i]){
					k = i;
				}
				i++;
			}
			//printf("%d\n", k);
			printf("Jugador con mas intentos de pase: %s %s del equipo %s, con %d\n", o[j], p[j], q[j], mas(b));
			printf("Jugador con intentos de pase: %s %s del equipo %s, con %d\n", o[k], p[k], q[k], menos(b));
		break;
		
		case '3':
			//printf("%d\n", mas(c));
			i = 0;
			while(i < 10){
				if(mas(c) == c[i]){
					j = i;
				}
				i++;
			}
			//printf("%d\n", j);
			//printf("%d\n", menos(c));
			i = 0;
			while(i < 10){
				if(menos(c) == c[i]){
					k = i;
				}
				i++;
			}
			//printf("%d\n", k);
			printf("Jugador con mas yardas por aire %s %s del equipo %s, con %d\n", o[j], p[j], q[j], mas(c));
			printf("Jugador con menos yardas por aire: %s %s del equipo %s, con %d\n", o[k], p[k], q[k], menos(c));
		break;
		
		case '4':
		
			//printf("%d\n", mas(d));
			i = 0;
			while(i < 10){
				if(mas(d) == d[i]){
					j = i;
				}
				i++;
			}
			i = 0;
			//printf("%d\n", j);
			//printf("%d\n", menos(d));
			while(i < 10){
				if(menos(d) == d[i]){
					k = i;
				}
				i++;
			}
			//printf("%d\n", k);
			printf("Jugador con mas touchdowns: %s %s del equipo %s, con %d\n", o[j], p[j], q[j], mas(d));
			printf("Jugador con menos touchdowns: %s %s del equipo %s, con %d\n", o[k], p[k], q[k], menos(d));
		break;
		
		case '5':
			//printf("%d\n", mas(e));
			i = 0;
			while(i < 10){
				if(mas(e) == e[i]){
					j = i;
				}
				i++;
			}
			//printf("%d\n", j);
			//printf("%d\n", menos(e));
			i = 0;
			while(i < 10){
				if(menos(e) == e[i]){
					k = i;
				}
				i++;
			}
			//printf("%d\n", k);
			printf("Jugador con mas intercepciones: %s %s del equipo %s, con %d\n", o[j], p[j], q[j], mas(e));
			printf("Jugador con menos intercepciones: %s %s del equipo %s, con %d\n", o[k], p[k], q[k], menos(e));
		break;
		
		default:
			printf("La opcion seleccionada es incorrecta");
	}
}

/*Esta funcion recibe un string del usuario y lo saca codificado con el 
uso de ROT 13*/
void cifra_men(char ar[SIZE], char arg[SIZE]){
	int i = 0;
	fgets(ar,SIZE,stdin);
	ar[strlen(ar)-1] = '\0';
	while(ar[i] != '\0'){
		if(ar[i] != '\n'){
			arg[i] = ROT_13(ar[i]);
		}
		i++;
	}
}

/*Esta funcion devuelve un caracter codificado en ROT 13*/
char ROT_13(char c){
		if(( c >= 65 && c <= 77) || (c >= 97 && c <= 109)){
			c = c + 13;
		} else if ((c >= 78 && c<= 90) || (c >= 110 && c <= 122)){
			c = c - 13;
		} else if(c == 32){
			c = c;
		} else{
			c = c;
		}
	return c;
}