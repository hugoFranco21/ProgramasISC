#include <stdlib.h>
#include <stdio.h>
#include <math.h>

int main(void){
	int a1[15];
	a1[5] = 35;
	a1[9] = a1[6] + a1[13];
	a1[8] = (3 * a1[4]) - 57;
	for(int i = 0 ; i < 15 ; i++){
		printf("%d ", a1 [i]);
		if (i == 4 || i == 9 || i == 14){
			printf("\n");
		}
	}
	return 0;
}