/*Hugo David Franco Avila*/
#include <iostream>
#include <bits/stdc++.h>

using namespace std;

vector<int> seP(int x, int y, int z){
	int aux = x;
	bool flag = true;
	vector<int> v;
	/*while(true){
		v.push_back(y);
		aux -= y;
		if(aux == z){
			v.push_back(z);
			return v;
		}
		if(aux == y){
			v.push_back(y);
			return v;
		}
		if(aux == 0) return v;
		if(aux < 0) break;
		//v.push_back(y);
	}
	v.clear();
	aux = x;
	vector<int> vec;
	while(true){
		v.push_back(z);
		aux -= z;
		if(aux == z){
			v.push_back(z);
			return v;
		}
		if(aux == y){
			v.push_back(y);
			return v;
		}
		if(aux == 0) return v;
		if(aux < 0) break;
		
	}
	v.clear();*/
	while(flag){
		if(aux % y == 0 && aux != y){
			v.push_back(y);
			aux -= y;
		} else if(aux % z == 0 && aux != z){
			v.push_back(z);
			aux -= z;
		} else if(aux == y){
			v.push_back(y);
			aux = 0;
			flag = false;
		} else if(aux == z){
			v.push_back(z);
			aux = 0;
			flag = false;
		} else{
			v.push_back(y);
			aux -= y;
		}	
		if(aux < 0){
			v.clear();
			break;
		}
	}
	return v;
}

int main(){
	int n, p, q, j = 0;
	vector <int> v;
	string s, sub;
	cin >> n >> p >> q;
	cin >> s;
	v = seP(n, p, q);
	if(v.empty()){
		cout << -1;
	} else{
		cout << v.size() << endl;
		for(int i = 0; j < v.size(); i = i + v[j], j++){
			//cout << "i vale" << i << endl;
			//cout << "v[i] vale " << v[i] << endl;
			cout << s.substr(i, v[j]) << endl;
		}
	}
	
	
	return 0;
}