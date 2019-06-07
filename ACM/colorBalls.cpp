/*Hugo David Franco Avila*/
#include <iostream>
#include <bits/stdc++.h>
#define MOD 1e9+7
#define MAX 1010

using namespace std;

int main(){
	int r, aux, t = 0;
	int c[MAX][MAX], ans = 1;
	c[0][0] = 1;
	for(int i = 0; i < MAX;i++){
		c[i][0] = 1;
		for(int j = 1; j <= i; j++){
			//c[i][j] = (c[i-1][j] + c[i-1][j-1]) % MOD;
			c[i][j] = fmod(c[i-1][j] + c[i-1][j-1], MOD);
		}
	}
	cin >> r;
	int col[r];
	for(int i = 1; i < r; i++){
		cin >> aux;
		col[i] = aux;
	}
	for(int i = 0; i < r; i++){
		//ans = (ans*c[t+col[i] - 1][col[i]-1]) % MOD;
		ans = fmod(ans*c[t+col[i] - 1][col[i]-1], MOD);
		t = t + col[i];
	}
	cout << t;
	return 0;
}