#include <stdio.h>
#include <stdlib.h>
#include <time.h>

float proba(int x, int y);
void probabilidad(int w[5], int z[5], int a[5]);
void suma_Vec (float A[3], float B [3]);

/*La funcion main es un menu del cual se pueden elegir dos funciones, 
una que calcula una probabilidad utilizando un algoritmo descrito abajo,
y otra que suma dos vectores A y B */
int main(void){
	int opc, i;
	int m[5];
	int n[5];
	int alumnos[5];
	float vectorA[3];
	float vectorB[3];
	float prom;
	srand(time(NULL));
	do{
		printf("Elija una opcion\n");
		printf("1. Probabilidad de que entres en un equipo para la clase de fundamentos\n");
		printf("2. Suma de vectores\n");
		printf("3. Salir\n");
		scanf("%d",&opc);
		switch(opc){
			case 1:
				probabilidad(m, n, alumnos);
			break;
			case 2:
				printf("Introduzca el valor de los componentes del Vector A\n");
				for(i = 0; i < 3; i++){
					scanf("%f", &vectorA[i]);
				}
				printf("A = %0.1f i + (%0.1f) j + (%0.1f)k\n", vectorA[0], vectorA[1], vectorA[2]);
				printf("Introduzca el valor de los componentes del Vector B\n");
				for(i = 0; i < 3; i++){
					scanf("%f", &vectorB[i]);
				}
				printf("B = %0.1f i + (%0.1f) j + (%0.1f)k\n", vectorB[0], vectorB[1], vectorB[2]);
				suma_Vec(vectorA, vectorB);
			break;
			case 3:
			break;
			default:
			printf("El numero introducido es incorrecto\n\n");
		}
	} while (opc != 3);
	return 0;
}

/*Esta funcion arroja un numero que es la probabilidad de que sea aceptado
en un equipo de trabajo, y dependiendo de que dato sea introducido,
le da una ponderacion diferente que sumados da el 100 por ciento.
pr3 es un numero aleatorio del 1 al 100 que representa lo aleatorio
que es encontrar un equipo*/
float proba(int x, int y){
	float pr1, pr2, pr3, pro;
	if(x>=1 && x<=100 && y>=1 && y<=100){
	pr1 = x*0.25;
	pr2 = y*0.55;
	pr3 = (rand() % 100 + 1)*0.20;
	pro = pr1 + pr2 + pr3;
	}
	else {
		pro = 0;
	}
	return pro;
}

/* Esta funcion trabaja en conjunto con la funcion anterior, y con vectores
almacena los datos de 5 estudiantes, y al final imprime la probabilidad de 
cada alumno*/
void probabilidad(int w[5], int z[5], int a[5]){
	int i, j;
	float prob[5];
	printf("El programa le pedira que ingrese el promedio acumulado del semestre y la calificacion de la materia de fundamentos de \n5 alumnos, estas tendran un valor de 0.25 y 0.55 del total, respectivamente.\nEl otro 0.2 es un valor aleatorio asignado del 1 al 100, porque a veces sin importar que tan bueno sea uno, no alcanza equipo, o lo contrario, sin importar que tan malo sea el alumno, alguien lo mete a su equipo.\n");
	for (j = 0; j<5; j++){
		printf("Intoduzca el promedio acumulado del semestre del alumno %d\n", j+1);
		scanf("%d",&w[j]);
		printf("Introduzca la calificacion en fundamentos del alumno %d\n", j+1);
		scanf("%d",&z[j]);
	}
	for(i = 0; i<5; i++){
		prob[i] = proba(w[i],z[i]);
		if (prob[i] != 0){
		printf("Alumno %d, probabilidad de %0.1f por ciento\n", i+1, prob[i]);
		}
		else{
			printf("Hay un error en las calificaciones del alumno %d\n", i+1);
		}
	}
	printf("\n");
}

/*Esta funcion suma vectores componente a componente e imprime el resultado
Ocupo vectores y un ciclo for para seleccionar la localidad*/
void suma_Vec(float A[3], float B[3]){
	float res[3];
	int i;
	for(i = 0; i<3; i ++){
		res[i] = A[i] + B[i];	
	}
	printf("El vector resultante es %0.1f i + (%0.1f) j + (%0.1f) k\n\n", res[0], res[1], res[2]);
}