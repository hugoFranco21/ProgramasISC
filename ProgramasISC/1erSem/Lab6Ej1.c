#include <stdlib.h>
#include <stdio.h>
#include <math.h>

float potencia (int x, int n);
float sumatoria (int S);
float aproximacion_PI (long int N);

//Esta funcion sirve como un menu, en el que el usuario puede
//elegir que funcion realizar, y con un switch elige el caso 
//que desea, y se evaluan las funciones con los valores dados
//por el usuario. 
//Esta en un ciclo while que solo se detiene si la opcion
//indicada es la 4, que es la de salir.
int main(){
	float pot1, aprox1, suma1, r1;
	int opc, x1, n1, q1;
	do{
	printf("FUNCIONES:\n");
	printf("1. Potencia\n");
	printf("2. Evaluar sumatoria\n");
	printf("3. Aproximacion del valor de PI\n");
	printf("4. Salir\n");
	printf("Opcion: ");
	scanf("%d", &opc);
	
	switch(opc)
	{
		case 1:
			printf("Escriba el valor de la base\n");
			scanf("%d", &x1);
			printf("Escriba el valor del exponente\n");
			scanf("%d",&n1);


			pot1 = potencia (x1,n1);


			printf("Input:\n%d\n%d %d\n",opc, x1, n1);
			printf("Output:\n%0.0f\n\n", pot1);

			break;
		
		case 2:
			printf("Escriba el numero de terminos que quiere para la sumatoria\n");
			scanf("%d",&q1);

			suma1 = sumatoria (q1);

			printf("Input:\n%d\n%d\n",opc, q1);
			printf("Output:\n%f\n\n", suma1);

			break;
			
		case 3:
			printf("Escriba el numero de elementos de la serie de Leibniz que quiere utilizar\n");
			scanf("%f", &r1);


			aprox1 = aproximacion_PI(r1);

			printf("Input:\n%d\n%0.0f\n", opc, r1);
			if (aprox1 == 0){
			printf("No se puede usar 0\n\n");
			} else if (aprox1 > 0){
			printf("Output:\n%f\n\n", aprox1);
			} else {
			printf("Debe ingresar un numero natural\n\n");
			}
			
			break;
			
		case 4:
			break;
		
		default:
			printf("El numero de opcion indicado es incorrecto\n");

		}
	} while (opc != 4); 
	return 0;
}

//Como no se si puedo usar la biblioteca math y la instruccion pow(x,y),
//escribi la potencia como una serie de multiplicaciones del mismo numero 
//por si mismo.
//Use un respaldo del numero original para que no se perdiera.
//Los pasos para hallar los valores los escribi con if para tener una mayor
//flexibilidad en mis condiciones 
float potencia (int a, int b){
	float res1, a1;
	a1 = a;
	int i;
	if (b == 0){
		a1 = 1;
	} else if (b == 1){
		a1 = a1;
	} else {
		for (i = 2;i<=b;i++)
		{
		a1 = a*a1;
		}
	}
	return a1;
}

//Para esta funcion, utilice una constante que es del tipo float, que 
//vale 3/4, o 0.75, una variable en la que cuento el numero de terminos 
//que es i, y otra variable en la que llevo el resultado de la suma
//que es lo que regreso a main
float sumatoria(int S){
	float i = 0;
	float sum = 0;
	const float t = 0.75;
	do{
	sum = sum + (sqrt(t*i))/((sqrt(potencia(i,5)) - potencia(i,2))+1);
	i = i + 1;
	} while (i <= S);
	return sum;
}

//Para el algoritmo de esta funcion, primero tenia que ver como se
//comportaba la funcion, como son los numeros impares tome la funcion 2x-1
//que su resultado siempre es un numero impar. Otro desafio fue el 
//alternar el signo, pero vi que era sencillo si creaba dos 
//variable que valieran -1, y multiplicaba una con la otra, pero 
//sobreescribia el valor de una para que el signo fuera alternando de 
//positivo a negativo.
float aproximacion_PI (long int N){
	int i;
	float den, term, sum;
	float ini = 0;
	float b = -1;
	float bb = -1;
	if (N == 0){
		return 0;
	} else {
		for(i = 1;i <= N; i++){
		den = b + 2*i;
		term = 4/den;
		bb = bb * b;
		sum = ini + (bb*term);
		ini = sum;
		}
	return ini;
	}
}