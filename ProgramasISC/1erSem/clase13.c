#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define SIZE 100

int main(void){
	int i = 0, c;
	FILE *pf, *pf1;
	char dir[] = "wubba.txt", cad[SIZE], cad1[SIZE];
	pf = fopen(dir, "r");
	pf1 = fopen(dir, "a");
	if(pf == NULL){
		printf("Error");
		exit(-1);
	}
	fgets(cad1,SIZE,stdin);
	cad1[strlen(cad1)-1] = '\0';
	
	fputs(cad1, pf1);
	fclose(pf1);
	while(fgets(cad,SIZE,pf)){
		fputs(cad, stdout);
	}
	rewind(pf);
	while((c = getc(pf)) != EOF){
		i++;
	}
	fclose(pf);
	printf("\n");
	printf("Numero de caracteres %d",i);
	return 0;
}
