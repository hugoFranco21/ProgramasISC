/*Hugo David Franco Avila*/
#include <iostream>
#include <bits/stdc++.h>

using namespace std;

/*long long func(long long *n, long long *m){
	if(*n == 0 || *m == 0) return 0;
	if(*n >= 2**m){
		*n = *n % 2**m;
		if(*m >= 2**n) *m = *m % (*m - 2**n);
	} else if(*m >= 2**n){
		*m = *m % (*m - 2**n);
		*n = *n % (*n -2**m);
	}
	return 0;
}*/

int main(){
	long long int i, j;
	cin >> i;
	cin >> j;
	/*a = &i;
	b = &j;*/
	/*cout << "i es igual " << i << endl;
	cout << "j es igual " << j << endl;*/
	while(i != 0 && j != 0){
		/*cout << "i es igual " << i << endl;
		cout << "j es igual " << j << endl;*/
		if(i >= 2*j){
			i = i % (2*j);
		} else if(j >= 2*i){
			j = j % (2*i);
		}
		//if(j == 0) break;
		else{
			break;
		}
		/*cout << "j es igual " << j << endl;
		cout << "i es igual " << i << endl;
		cout << "j es igual " << j << endl;*/
	}
	//}
	cout << i << " " << j;
	return 0;
}