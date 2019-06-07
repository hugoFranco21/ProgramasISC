#include <iostream>
#include <bits/stdc++.h>

long long int check_prime(long long int num){
	long int div = 2, i = num/2 +1;
	if(num == 1 || num == 2) return num;
	if(num % div == 0) return 0;
	div++;
	while(div <= i){
		if(num % div == 0) return div;
		div = div + 2;
	}
	//std::cout << num << " es primo!\n";
	return num;eyFI E09u-38y7O Q
}

long long int gcd(long long int num){
	long long int div = 2, i = num/2 +1, max;
	max	= num;
	//if(check_prime(num)) return 2;
	while(div <= i){
		if(num % div == 0) max = div;
			//if(num_div(max) == 2){
			//	break;
			//}
		
		div++;
	}
	//num = num/max;
	return max;
}

int main(){
	long long int primo;
	std::cin >> primo;
	std::cout << check_prime(primo);
	return 0;
}

	
