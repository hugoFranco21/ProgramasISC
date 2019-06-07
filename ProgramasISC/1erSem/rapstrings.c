#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define size 300

void secure(char arg[size]){
	int estado, i = 0, acu = 0;
	while(arg[i] != '\0' && acu != 1){
		if(arg[i] < 48 && arg[i] != 32){
			acu = 1;
		}
		if (arg[i] > 57 && arg[i] < 65){
			acu = 1;
		}
		if(arg[i] > 90 && arg[i] < 97){
			acu = 1;
		}
		if (arg[i] > 122){
			acu = 1;
		}
	i++;
	printf("%d\n", i);
	}
	if(acu != 0){
		estado = 0;
	} else{
		estado = 1;
	}
	printf("%d", estado);
}

int main(void){
	char cad[size];
	fgets(cad, size, stdin);
	cad[strlen(cad)-1] = '\0';
	secure(cad);
	return 0;
}