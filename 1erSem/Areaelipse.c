#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

 main() {
 	const float pi=3.1416;
 	float a,b,area;
 	printf("Programa que determina el area de una elipse\n");
 	printf ("Introduzca el valor del eje menor\n");
 	scanf("%f",&a);
 	printf("Introduzca el valor del eje mayor\n");
 	scanf("%f",&b);
 	area=pi*a*b;
 	printf("El area de la elipse es igual a %f\n",area);
 	printf("\n");
 	system("pause");
	return 0;
}
