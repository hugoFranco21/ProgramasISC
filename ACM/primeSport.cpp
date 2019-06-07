/*Hugo David Franco Avila*/
#include <iostream>
#include <bits/stdc++.h>

using namespace std;

vector<int> SieveOfEratosthenes(int n) { 
	vector<int> v;
    bool prime[n+1]; 
    memset(prime, true, sizeof(prime)); 
    for (int p=2; p*p<=n; p++){ 
        if (prime[p] == true){ 
            for (int i=p*2; i<=n; i += p) 
                prime[i] = false; 
        } 
    } 
    for (int p=2; p<=n; p++){
        if (prime[p]){ 
			v.push_back(p);
		}
	}
	return v;
} 

void imprime_vector(vector<int> &r){
	for(int i = 0; i < r.size(); i++){
		cout << r[i] << endl;
	}
}

int main(){
	int x2;
	int primo, x1 = 0, x0 = 0, primo2, primo1 = 0, max1 = 0, max0 = 0;
	int i, rangox1;
	vector<int> z, fp2, rang1, rang0, y;
	vector<int>::iterator it, it1;
	cin >> x2;
	z = SieveOfEratosthenes(x2);
	//imprime_vector(z);
	for(it = z.begin(); it != z.end(); it++){
		if(x2 % *it == 0){
			primo2 = *it;
			//fp2.push_back(*it);
		}
	}
	cout << primo2 <<endl;
	for(i = x2 - primo2 +1; i <= x2; i++){
		rang1.push_back(i);
	}
	//imprime_vector(rang1);
	y = SieveOfEratosthenes(primo2 - 1);
	for(it = y.begin(); it != y.end(); it++){
		for(i = 0; i < rang1.size() - 1; i++){
			cout<< "rang1["<< i<<"] es "<<rang1[i]<<". It es " <<*it<<" .El mod es "<<rang1[i] % *it<<endl;
			if(rang1[i] % *it == 0){
				primo1 = *it;
				cout << "primo1 vale " <<primo1<<endl;
			}
		}
	}
	cout<<primo1<<endl;
	i = 1;
	while(primo2 > x1){
		x1 = primo1*i;
		i++;
	}
	cout << x1<<endl;
	for(i = x1 - primo1 + 1; i <=x1; i++){
		rang0.push_back(i);
	}
	imprime_vector(rang0);
	cout << rang0[0];
	return 0;
}