/*Hugo David Franco Avila*/
#include <iostream>
#include <bits/stdc++.h>

using namespace std;
//int n[2][10000];
void imprime_vector(vector<int> &r){
	for(int i = 0; i < r.size(); i++){
		cout << r[i] << endl;
	}
}

int cuenta_unicos(vector<int>&r, int n){
	int count = 1, x, i, j = 0;
	vector<int> aux(r.size() - n);
	//vector<bool> v;
	//vector<int>::iterator it;//, it1;
	//v.push_back(r[n]);
	//y = r[n];
	//cout<<"vector enviado a la funcion"<<endl;
	//imprime_vector(r);
	//cout << "vector auxiliar v = "<<endl;
	//imprime_vector(v);
	if(n == r.size() - 1) return 1;
	for(i = n; i < r.size(); i++, j++){
		aux[j] = r[i];
	}
	//ord = shellSort(aux);
	sort(aux.begin(), aux.end());
	//aux.clear();
	//imprime_vector(aux);
	//y = aux[0];
	x = aux[0];
	/*
	for(it = aux.begin(); it != aux.end(); it++){
		if(*it != x && *it != y){
			//dif.push_back(*it);
			x = *it;
			count++;
		}
				//count++;
	}
	//cout<< "count vale " << count<<endl;*/
	for(i = 0; i < aux.size(); i++){
		if(aux[i] != x ){//&& aux[i]){// != aux[0]){
			//dif.push_back(*it);
			
			x = aux[i];
			//v.push_back(true);
			count++;
		}
				//count++;
	}
	aux.clear();
	return count;
	//return v.size();
}

int main(){

	//vector<int>::iterator it;
	int n, m, ina, aux = 0;
	cin >> n>>m;
	vector<int> a(n), l(m), s;
	for(int i = 0; i < n; i++){
		cin >> ina;
		a[i] = ina;
	}
	for(int i = 0; i < m; i++){
		cin >> ina;
		cout << cuenta_unicos(a,ina - 1)<<"\n";
	}

	return 0;
}