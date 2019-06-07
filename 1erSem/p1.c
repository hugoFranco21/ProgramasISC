#include <stdlib.h>
#include <stdio.h>
#include <math.h>
#include <string.h>


/*void ROT_13(char men[1000]){
	int i = 0;
	while(men[i] != '\0'){
		if(men[i] >= 65 && men[i] <= 77)
			men[i] = men[i] + 13;
		if (men[i] >= 97 && men[i] <= 109)
			men[i] = men[i] + 13;
		if (men[i] >= 78 && men[i] <= 90)
			men[i] = men[i] - 13;
		if (men[i] >= 110 && men[i] <= 122)
			men[i] = men[i] - 13;
		if (men[i] == 32)
			men[i] = men[i];
		i++;
	}
	puts(men);
}

int main(void){
	FILE *pf, *pf1;
	int i = 0, j = 0, k = 0;
	char mensaje[1000];
	/*float p[5];
	char pl[5][SIZE];
	pf = fopen("LOL.txt", "r");
	if(pf == NULL){
		printf("Error");
		exit(-1);
	}
	while(!feof(pf)){
		fscanf(pf, "%*s %s %*s %f", pl[i], &p[i]);
		i++;
	}
	for(j = 0; j < i; j++){
		printf("%s %0.2f\n", pl[j], p[j]);
	}
	fclose(pf);
	pf = fopen("SC2.txt", "r");
	i = 0;
	j = 0;
	if(pf == NULL){
		printf("Error");
		exit(-1);
	}
	while(!feof(pf)){
		fscanf(pf, "%*s %s %*s %f", pl[i], &p[i]);
		i++;
	}
	for(j = 0; j < i; j++){
		printf("%s %0.2f\n", pl[j], p[j]);
	}
	fclose(pf);
	/*mayo = p[j];
	for(j = 0; j <= i; j++){
		if(primer_lugar(p) == p[j]){
			mayo = p[j];
			j = k;
		}
	}
	puts(pl[k]);
	
	//recibe_archivo(archivo);
	pf = fopen("secreto.txt", "r");
	if(pf == NULL){
		printf("ERROR\n");
		exit(-1);
	}
	while(!feof(pf)){
		fgets(mensaje, 1000, pf);
	}
	fclose(pf);
	puts(mensaje);
	ROT_13(mensaje);
	return 0;
}
*/

int main(void){
	long double a = 98657348*812997;
	printf("%lf", a);
	return 0;
}
