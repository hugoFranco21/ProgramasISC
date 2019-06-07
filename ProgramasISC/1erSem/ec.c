#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>
#define SIZE 50

int main(void){
	char arg[SIZE];
	char sal[SIZE];
	int temp[SIZE];
	int i = 0, j = 0;
	for(i = 0; i < 8; i++){
		temp[i] = i;
		sal[i] = temp[i] + 97;
	}
	sal[8] = '\0';
	puts(sal);
	return 0;
}