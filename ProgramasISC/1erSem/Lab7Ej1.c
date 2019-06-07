#include <stdlib.h>
#include <stdio.h>
#include <math.h>

int primo (int n);
float sumatoria (float r);

/*Esta es mi funcion principal, la cual despliega un menu como el
que nos solicitaron, esta dentro de un ciclo do-while para que
se repita si se cumple la condicion que el usuario no le ha dado
salir. 
Con un switch controla ejecucion de las funciones, y hace la 
funcion de captura de datos. */
int main(void){
	char opc;
	int prime, pri;
	float sum, s;
	
	do{
		printf("MENU\n");
		printf("a. Numeros primos\n");
		printf("b. Funcion G\n");
		printf("s. Salir\n");
		printf("Opcion: ");
		scanf(" %c",&opc);
		printf("\n");

		
		switch(opc){
			case 'a':
				scanf("%d",&prime);
				pri = primo(prime);
				if (pri == 2){
					printf ("El cero no es primo\n\n");
				} else{
					printf("%d\n", pri);
				}
			break;
			
			case 'b':
				scanf("%f",&s);
				sum = sumatoria(s);
				printf("%0.1f\n", sum);
			break;
			
			case 's':
			break;
			
			default:
				printf("La opcion introducida no es correcta\n");
		}
	}while (opc != 's');
	return 0;
}

/*Esta funcion pide un valor, y regresa un 1 o un 0, dependiendo
si es primo o no. Especifique un caso especial para el 0 porque
no podria ser siquiera considerado porque no se puede dividir
entre 0.
Use la funcion modulo y un ciclo while para que saliera del ciclo
cuando la funcio modulo valiera 1, y, si i valia 1, significaba
que era un numero primo, por lo que regresaba un 1. 
*/
int primo (int n){
	int valor;
	int i = n-1;
	if (n == 0){
		valor = 2;
	} else if (n == 1){
		valor = 0;
	} else {
		while(n % i != 0){
			i--;
		}
		if (i != 1){
			valor = 0;
		} else{
			valor = 1;
		}
	}
	return valor;
}

/*
	Esta funcion, si el valor introducido era menor al 3, se
	regresaba un 0 porque no entraba al if. Dentro 
	del if, se da el valor correspondiente al termino ingresado
	de la sumatoria, y en sum llevo el resultado acumulado.
*/
float sumatoria(float r){
	float sum = 0;
	float num, den, frac, i;
	if (r >= 3){ 
		for( i = 3; i <= r; i++){
			num = sqrt(i-2);
			den = i*i;
			frac = num / den;
			sum = sum + frac;
		}
	}
	return sum;
}