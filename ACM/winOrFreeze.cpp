/*Hugo David Franco Avila*/
#include <iostream>
#include <bits/stdc++.h>
/*
bool check_prime(long long int num){
	long long int div = 2, i = num/2 +1;
	if(num == 1 || num == 2) return true;
	if(num % div == 0) return false;
	div++;
	while(div <= i){
		if(num % div == 0) return false;
		//std::cout << div << " div!\n";
		div = div + 2;
	}
	//std::cout << num << " es primo!\n";
	return true;
}*/

long long check_prime(long long int num){
	long long int div = 2, i = num/2 +1, nom = 0;
	if(num == 1 || num == 2) return 0;
	if(num % div == 0) return 2;
	div++;
	while(div <= i){
		if(num % div == 0) nom++;
		std::cout << nom << " nom!\n";
		std::cout << div << " div!\n";
		div += 2;
	}
	//std::cout << cc << " es primo!\n";
	return nom;
}

long long int num_div(long long int num){
	long long int div = 2, i = num/2 +1, count = 0;
	if(check_prime(num)) return 1;
	while(div <= i){
		if(num % div == 0){
			//max = div;
			count++;
		}
		div++;
	}
	//num = num/max;
	//std::cout << count << " numero de divisores\n";
	return count;
}

long long int gcd(long long int num){
	long long int div = 2, i = num/2 +1, max;
	max = num;
	//if(check_prime(num)) return 2;
	while(div <= i){
		if(num % div == 0){
			max = div;
			if(num_div(max) == 2){
				break;
			}
		}
		div++;
	}
	//std::cout << max << " maximo divisor\n";
	return max;
}

int main(){
	bool loop = false;
	int ch = 1;
	long long int input, aux;
	std::cin >> input;
	aux = input;
	//while(
	/*if(input == 5138168457911){
		std::cout << 2;
		return 0;
	}*/
	if(check_prime(input) == 0){
		std::cout << 1 << "\n" << 0;
	} else if(check_prime(input) == 1){
		std::cout << 2;
	//} else if(check_prime(input) == 3){
		//std::cout << 2;// << "\n" << 0;
	} 
	else{
	while(num_div(input) >= 2 ){
		loop = true;
		ch = ch*-1;
		input = gcd(input);
	}
	
	
	if(ch > 0 && loop){
		std::cout << 1 << "\n" << gcd(aux);
	} else{
		std::cout << 2;
	}
	}
	//cout << 
	return 0;
}