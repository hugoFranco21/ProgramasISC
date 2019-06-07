/*Hugo David Franco Avila*/
#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int main(){
	int n, x0, y0, aux, auy, i = 0, j = 0;
	//int coord[n][n];
	cin >> n, x0, y0;
	set<int, int> coord;
	for(i = 0; i < n; i++){
		cin >> aux, auy;
		coord.insert(aux,auy);
	}
	
	return 0;
}