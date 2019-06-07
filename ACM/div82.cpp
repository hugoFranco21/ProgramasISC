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

int div(string s){
	/*//vector<char> n(s.size());
	//vector<char> 
	for(int i = 0; i < s.size(); i++){
		n[i] = s[i];
	}*/
	int aux1, aux2, aux3;
	string::iterator it, it1, it2;
	for(it = s.begin(); it != s.end(); it++){
		aux1 = *it - 48;
		//cout <<"valor aux1"<<endl;
		//cout << aux1<<endl;
		if(aux1 == 0){
			return aux1;
		} else if(aux1 == 8){
			return aux1;
		} else if(s.size() == 1){
			return -1;
		}
	}
	for(it = s.begin(); it != s.end() - 1; it++){
		aux1 = *it - 48;
		for(it1 = it+1; it1!=s.end(); it1++){
			aux2 = *it1 - 48;
			//cout << *it*100 + *it1*10 + *it2 << endl;
			if((aux1*10 + aux2) % 8 == 0) return aux1*10 + aux2;
		}
	}
	for(it = s.begin(); it != s.end() - 2; it++){
		aux1 = *it - 48;
		for(it1 = it+1; it1!=s.end() - 1; it1++){
			aux2 = *it1 - 48;
			for(it2 = it1+1; it2!=s.end(); it2++){
				aux3 = *it2 - 48;
				//cout << *it*100 + *it1*10 + *it2 << endl;
				if((aux1*100 + aux2*10 + aux3) % 8 == 0) return aux1*100 + aux2*10 + aux3;
			}
		}
	}
	//return -1;
	return -1;
}

int main(){
	string num;
	int res;
	cin >> num;
	//cout << num;
	if(div(num) < 0){
		cout << "NO";
	} else{
		cout << "YES" <<endl;
		cout << div(num);
	}
	return 0;
}