/*Hugo David Franco Avila*/
#include <iostream>
#include <bits/stdc++.h>
#define MOD 10000000000
using namespace std;

void imprime_vector(vector<int> &r){
	for(int i = 0; i < r.size(); i++){
		cout << r[i] << endl;
	}
}

int div(long long n){
	long long cop = n;
	long long int i = 1;
	while(n/10 > 0){
		n = n/10;
		i++;
	}
	//cout << i<<endl;
	vector<int> v;
	vector<int>::iterator it, it1, it2;
	long long aux;
	while(i > 0){
		v.push_back(cop%10);
		aux = cop/10;
		cop = aux;
		i--;
	}
	//cout<<"vector v" <<endl;
	if(v.size() > 1)
		reverse(v.begin(), v.end());
	imprime_vector(v);
	//cout << v.size()<<endl;
	for(it = v.begin(); it != v.end(); it++){
		if(*it == 0){
			return 0;
		} else if(*it == 8){
			return 8;
		} else if(v.size() == 1){
			return -1;
		}
	}
	for(it = v.begin(); it != v.end() - 1; it++){
		for(it1 = it+1; it1!=v.end(); it1++){
			//cout << *it*100 + *it1*10 + *it2 << endl;
			if((*it*10 + *it1) % 8 == 0) return (*it*10 + *it1);
		}
	}
	for(it = v.begin(); it != v.end() - 2; it++){
		for(it1 = it+1; it1!=v.end() - 1; it1++){
			for(it2 = it1+1; it2!=v.end(); it2++){
				//cout << *it*100 + *it1*10 + *it2 << endl;
				if((*it*100 + *it1*10 + *it2) % 8 == 0) return (*it*100 + *it1*10 + *it2);
			}
		}
	}
	return -1;
}

int main(){
	string num;
	int res;
	cin >> num;
	cout << num;
	if(div(num) < 0){
		cout << "NO";
	} else{
		cout << "YES\n" << div(num);
	}
	return 0;
}