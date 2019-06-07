#include <stdlib.h>
#include <stdio.h>
#include <math.h>
#include <time.h>

int random(void);
float promedio (int ar[100]);
void var (int ar[100]);

int main(void){
	int i = 0;
	float prom;
	srand(time(NULL));
	int arr[100];
	for (i = 0; i <= 99; i++){
		arr[i] = random();
	}
	for (i = 0; i <= 99; i++){
		printf("%d. %d\n", i+1, arr[i]);
	}
	prom = promedio(arr);
	printf("El promedio de los datos es: %0.1f\n", prom);
	var(arr);
}

int random(void){
	return rand() % 100+1;
}

float promedio (int ar[100]){
	float sum = 0;
	float pro;
	int i = 0;;
	for(i = 0;i < 100; i++){
	sum += ar[i];
	}
	pro = sum/100;
	return pro;
}

void var(int ar[100] ){
	float s, s2, s3;
	float s1 = 0;
	for(int i = 0; i <=99; i++){
		printf("%0.1f\n",s1);
		s1 = 0;
		s1 += ar[i] - promedio(ar);
		s1 = s1*s1;
		s3 += s1;
	}
	s2 = s1/100;
	s = sqrt(s2);
	printf("La varianza es %0.1f\n", s);
}
