#include<bits/stdc++.h>

typedef long long int ll;

using namespace std;

int main(){
	ifstream entrada("input.txt");
	ofstream salida;
    salida.open("output.txt", ios::out);
	int n, k;
	int acum = 0;
	entrada >> n >> k;
	int *arr = new int[n];
	for(int i = 0; i < n; i++){
		entrada >> arr[i];
		if(arr[i] >= k*3){
			acum += arr[i] - k*3;
		} else {
			acum += arr[i] % k; 
		}
	}
	salida << acum;
	delete[] arr;
	return 0;
}