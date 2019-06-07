#include <iostream>

int sum_rec(int n){
	if(n == 0) return 0;
	return n + sum_rec(n-1);
}

int fibo(int n){
	if(n == 0|| n == 1) return n;
	return fibo(n - 1) + fibo (n - 2);
}

int main(){
	int n, opcion;
	std::cout << "Introduce cuantos numeros quieres\n";
	std::cin >> n;
	std::cin >> opcion;
	switch(opcion){
		case 1:
			std::cout << "Suma \n" << sum_rec(n);
		break;
		
		case 2:
			std::cout << "Fibonacci\n" << fibo(n);
	}
	//std::cout << sum_rec(n);
	return 0;
}