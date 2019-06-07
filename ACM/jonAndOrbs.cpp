/*Hugo David Franco Avila*/
#include <iostream>
#include <bits/stdc++.h>
#define eps 1e-7
using namespace std;

const int NUM = 1004;
double de[NUM];
int res[NUM];

int main(){
	int k, q, d = 1;
	cin >> k >> q;
	de[0] = 1;
	for(int n = 1; d <= 1000; n++){
		for(int x = k; x > 0; x--){
			de[x] = (x * de[x] + (k - x + 1) * de[x - 1]) / k;
		}
		while(d <= 1000 && 2000 * de[k] >= (d - eps)){
			res[d] = n;
			d++;
		}
		de[0] = 0;
	}
	while(q--){
		int x;
		cin >> x;
		cout << res[x] << endl;
	}
	return 0;
}