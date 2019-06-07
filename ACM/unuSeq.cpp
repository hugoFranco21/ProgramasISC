/*Hugo David Franco Avila*/
#include <iostream>
#include <bits/stdc++.h>
#define MOD 1e9+7

using namespace std;

int main(){
	long long x, y;
	cin >> x >> y;
	if(y % x != 0){
		cout << 0;
	} else{
		cout << y/x % MOD;
	}
	return 0;
}