#include <stdlib.h>
#include <stdio.h>
#include <math.h>

float aprox_Pi(int n);

void main(){
	float r, aproxi;
	printf("Cuantos terminos desea tomar para la aproximacion?\n");
	scanf("%f", &r);
	aproxi = aprox_Pi(r);
	if(r<=0){
		printf("Tiene que introducir un numero mayor que 0");
	} else {
	printf("El resultado es %0.3f", aproxi);
	}
}

float aprox_Pi(int n){
	float sum = 0;
	float term, ap, aprox, icu;
	if(n == 0){
		return 0;
	} else{
		for(int i=1;i<=n;i++){
			icu = i*i;
			term = 1/icu;
			sum = sum + term;
		}
		ap = sum*6;
		aprox = sqrt(ap);
	return aprox;
	}
}