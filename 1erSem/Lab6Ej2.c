#include <stdlib.h>
#include <stdio.h>
#include <math.h>

void instrucciones();
float serie1(int n);
float serie2(int r);
float serie3(int s);
float potencia (int m, int q);
void infos1();
void infos2();
void infos3();

//Mi funcion main es un menu, en el cual seleciono la opcion
//con un switch, el cual va a llamar a las funciones definidas
//abajo.
//Esta funcion se repite hasta que le meto un 8 que es la opcion
//de salir
void main(){
	int opc;
	float x1, x2, x3, x4, ser11, ser12, ser13, ser14, y1, y2, y3, y4, ser21, ser22, ser23, ser24, z1, z2, z3, z4, ser31, ser32, ser33, ser34;
	do{
		printf("Seleccione la serie que desea evaluar:\n");
		printf("1. Reciprocos de los numeros triangulares\n");
		printf("2. Reciprocos de las potencias de 2\n");
		printf("3. Reciprocos de las potencias de 2 con el signo alternado\n");
		printf("4. Instrucciones al usuario\n");
		printf("5. Como funciona la primera serie (reciprocos numeros triangulares)?\n");
		printf("6. Como funciona la segunda serie (reciprocos de potencias de dos)?\n");
		printf("7. Como funciona la tercera serie (reciprocos de potencias de dos con signo alternado)?\n");		
		printf("8. Salir\n");
		printf("Opcion: ");
		scanf("%d", &opc);
		system("pause");
		system("cls");
			switch(opc){
				case 1:
				printf("Esta serie en el infinito converge a 2, intente ingresar un valor\n");
				system("pause");
				system("cls");
				printf("Escriba el numero de terminos que desea ocupar\n");
				scanf("%f",&x1);
				printf("Escriba el numero de terminos que desea ocupar\n");
				scanf("%f",&x2);
				printf("Escriba el numero de terminos que desea ocupar\n");
				scanf("%f",&x3);
				printf("Escriba el numero de terminos que desea ocupar\n");
				scanf("%f",&x4);
				ser11 = serie1(x1);
				ser12 = serie1(x2);
				ser13 = serie1(x3);
				ser14 = serie1(x4);
				system("pause");
				system("cls");
				printf("Input:\n%d\n%0.0f\n", opc, x1);
				printf("Output:\n%0.3f\n\n", ser11);
				printf("Input:\n%d\n%0.0f\n", opc, x2);
				printf("Output:\n%0.3f\n\n", ser12);
				printf("Input:\n%d\n%0.0f\n", opc, x3);
				printf("Output:\n%0.3f\n\n", ser13);
				printf("Input:\n%d\n%0.0f\n", opc, x4);
				printf("Output:\n%0.3f\n\n", ser14);
				printf("Converge en 2?\n");
				system("pause");
				system("cls");			
			break;
			
			case 2:
				printf("Esta serie en el infinito converge a 2, intente ingresar un valor\n");
				system("pause");
				system("cls");
				printf("Escriba el numero de terminos que desea ocupar\n");
				scanf("%f",&y1);
				printf("Escriba el numero de terminos que desea ocupar\n");
				scanf("%f",&y2);
				printf("Escriba el numero de terminos que desea ocupar\n");
				scanf("%f",&y3);
				printf("Escriba el numero de terminos que desea ocupar\n");
				scanf("%f",&y4);
				ser21 = serie2(y1);
				ser22 = serie2(y2);
				ser23 = serie2(y3);
				ser24 = serie2(y4);
				system("pause");
				system("cls");
				printf("Input:\n%d\n%0.0f\n", opc, y1);
				printf("Output:\n%0.3f\n\n", ser21);
				printf("Input:\n%d\n%0.0f\n", opc, y2);
				printf("Output:\n%0.3f\n\n", ser22);
				printf("Input:\n%d\n%0.0f\n", opc, y3);
				printf("Output:\n%0.3f\n\n", ser23);
				printf("Input:\n%d\n%0.0f\n", opc, y4);
				printf("Output:\n%0.3f\n\n", ser24);
				printf("Converge en 2?\n");
				system("pause");
				system("cls");
			break;
			
			case 3:
				printf("Esta serie en el infinito converge a 2/3, o 0.666666..., intente ingresar un valor\n");
				system("pause");
				system("cls");
				printf("Escriba el numero de terminos que desea ocupar\n");
				scanf("%f",&z1);
				printf("Escriba el numero de terminos que desea ocupar\n");
				scanf("%f",&z2);
				printf("Escriba el numero de terminos que desea ocupar\n");
				scanf("%f",&z3);
				printf("Escriba el numero de terminos que desea ocupar\n");
				scanf("%f",&z4);
				ser31 = serie3(z1);
				ser32 = serie3(z2);
				ser33 = serie3(z3);
				ser34 = serie3(z4);
				system("pause");
				system("cls");
				printf("Input:\n%d\n%0.0f\n", opc, z1);
				printf("Output:\n%0.3f\n\n", ser31);
				printf("Input:\n%d\n%0.0f\n", opc, z2);
				printf("Output:\n%0.3f\n\n", ser32);
				printf("Input:\n%d\n%0.0f\n", opc, z3);
				printf("Output:\n%0.3f\n\n", ser33);
				printf("Input:\n%d\n%0.0f\n", opc, z4);
				printf("Output:\n%0.3f\n\n", ser34);
				printf("Converge en 2/3 (0.6666...)?\n");
				system("pause");
				system("cls");
			break;
			
			case 4:
				instrucciones();
				system("pause");
				system("cls");
			break;
			
			case 5:
				infos1();
				system("pause");
				system("cls");
			break;
			
			case 6:
				infos2();
				system("pause");
				system("cls");
			break;
			
			case 7:
				infos3();
				system("pause");
				system("cls");
			break;
			
			case 8:
				printf("Esta saliendo del programa\n");
				system("pause");
				system("cls");
			break;
			
			default:
				printf("El numero de opcion elegido es incorrecto\n");
				system("pause");
				system("cls");
		}	
	} while(opc != 8);		
}

//Esta funcion es del tipo void porque no espero que regrese un
//valor. Con esta funcion le indico al usuario la mejor manera
//de ocupar el programa.
void instrucciones(){
	printf("El objetivo de este programa es probar la convergencia de 3 series matematicas\n");
	printf("Para esto, se le pedira al usuario que ingrese 4 casos para las respectivas series.\n");
	printf("Se recomienda que empiece con valores menores a 10, y despues vaya utilizando valores mayores, para observar como converge la serie en el infinito\n");	
}

//En esta funcion, le digo al programa que tenga una variable i 
//en la que va a mantener un contador, que incremento en el ciclo
//while dentro de la funcion. Esta variable i, cuando alcance el 
//valor de la n introducida por el usuario, va a hacer que la funcion
//termine y se regrese sum. Sum es donde voy guardando el valor
//total de la sumatoria.

float serie1(int n){
	int i = 1;
	float t, den, term, sum; 
	sum = 0;
	if (n == 0){
		return 0;
	} else {
		do{
		t = i*(i+1);
		den = t/2;
		term = 1/den;
		sum = sum + term;
		i = i + 1;		
		} while(i<=n);
	return sum;
	}
}

//En esta funcion, utilizo un ciclo for para incrementar mi 
//variable i, que es a la que elevo el 2, y vuelvo a guardar la 
//suma en una variable sum que se va incrementando cada ciclo for,
//y es la que se regresa a la variable main
float serie2(int r){
	float sum = 0;
	float den, t;
	for(int i = 0; i<=r ; i++){
		den = potencia(2,i);
		t = 1/den;
		sum = sum + t;
	}
	return sum;
}

//Esta funcion es practicamente igual a la anterior, la unica
//diferencia es que agrego una variable en la que voy modificando 
//el signo del termino que voy sumando
float serie3(int s){
	float sum = 0;
	float den, t, f;
	int p = -1;
	int pp = -1;
	int i;
	for(i = 0; i<=s ; i++){
		p = p*pp;
		den = potencia(2,i);
		t = 1/den;
		f = p * t;
		sum = sum + f;
	}
	return sum;
}

//Esta potencia la tome del programa pasado, y la uso para elevar
//numeros de manera mas sencilla. Funciona con multiplicaciones
//seguidas del mismo numero, y para los casos especiales de 
//0 y 1, los tengo definidos aparte.
float potencia (int m, int q){
	float res1, a1;
	a1 = m;
	int i;
	if (q == 0){
		a1 = 1;
	} else if (q == 1){
		a1 = a1;
	} else {
		for (i = 2;i<=q;i++)
		{
		a1 = m*a1;
		}
	}
	return a1;
}

//En esta funcion solo imprimo informacion de como opera la primera 
//funcion
void infos1(){
	printf("Esta serie esta compuesta por la suma de n terminos que son iguales al reciproco de los numeros triangulares\n");
	printf("Los numeros triangulares se hallan con la siguiente formula: n*(n+1)\n");
	printf("Esta serie, cuando el numero de terminos n = infinito, es igual a 2\n");
}

//En esta funcion solo imprimo informacion de como opera la segunda 
//funcion
void infos2(){
	printf("Esta serie esta compuesta por la suma de n terminos que son iguales al reciproco de las potencias de 2\n");
	printf("Los potencias de 2, se hallan con la siguiente formula: 2^n\n");
	printf("Esta serie, cuando el numero de terminos n = infinito, es igual a 2\n");
}

//En esta funcion solo imprimo informacion de como opera la tercera 
//funcion
void infos3(){
	printf("Esta serie esta compuesta por la suma de n terminos que son iguales al reciproco de las potencias de dos con signo alternado\n");
	printf("Las potencias de 2 se hallan con la siguiente formula: 2^n.\n");
	printf("En esta serie, a diferencia de la serie 2, los terminos que estan en posicion impar tienen signo positivo, y los de posicion par tienen signo negativo.\n");
	printf("Esta serie, cuando el numero de terminos n = infinito, es igual a 2/3, o 0.66666...\n");
}
