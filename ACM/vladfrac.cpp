/*Hugo David Franco Avila*/
#include <iostream>
#include <bits/stdc++.h>

int main(){
	int input, x, y, z;
	float left;
	scanf("%d", &input);
	left = 2.0/input;
	if(input < 2){
		std::cout << -1;
	} else{
		x = input;
		y = x + 1;
		z = x*y;
		std::cout << x << " " << y << " " << z;
	}
	return 0;
}