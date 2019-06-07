/*Hugo David Franco Avila*/
#include <iostream>
#include <bits/stdc++.h>

using namespace std;

void imprime_vector(vector<int> &r){
	for(int i = 0; i < r.size(); i++){
		cout << r[i] << endl;
	}
}

void swap(vector<int> &v, int i, int j) {
	int aux = v[i];
	v[i] = v[j];
	v[j] = aux;
}

vector<int> shellSort(vector<int> &source) {
	vector<int> v(source);
	int gap = v.size() / 2;

	while (gap > 0) {
		for (int i = gap; i < v.size(); i++) {
			for (int j = i; j >= gap && v[j] < v[j - gap]; j -= gap) {
				swap(v, j, j - gap);
			}
		}
		gap /= 2;
	}
	return v;
}

int cuenta_unicos(vector<int>&r, int n){
	int count = 0;;
	bool flag = false;
	vector<int> v, aux, ord, dif;
	vector<int>:: iterator it, it1;//, it1;
	v.push_back(r[n]);
	//cout<<"vector enviado a la funcion"<<endl;
	//imprime_vector(r);
	//cout << "vector auxiliar v = "<<endl;
	//imprime_vector(v);
	if(n == r.size() - 1) return 1;
	for(it = (r.begin() + n + 1); it != r.end(); it++){
		aux.push_back(*it);
	}
	ord = shellSort(aux);
	aux.clear();
	//imprime_vector(ord);
	for(it = (ord.begin()); it != ord.end(); it++){
		if(*it != v[0]){
			dif.push_back(*it);
		}
				//count++;
	}
	for(it = 
	ord.clear();/* else if(*it == v[i]){
				//flag = true;
				count--;
			}/* else if(*it == v[i]){
				flag = true;
			}*/
	
		//
		/*if(!flag) 
			v.push_back(*it);*/
		//v.sort();
	//cout << "vec dif original de n= " << n<< endl;
	//imprime_vector(dif);
	//cout << "tamano dif"<<dif.size()<<endl;
	//imprime_vector(dif);
	//it1 = dif.begin() + 1;
	for(it = dif.begin(), it1 = dif.begin() + 1, count = 1; it1 != dif.end(); it++, it1++, count++){
		while(*it == *it1){
		//if(*it == *it1){
			//cout << *it << " " << *it1 << endl;
			//*it = *it - 1;
			*it1 = *it + 1;
			dif.erase(dif.begin() + count);
			//count = count + 1;
			if(dif.size() == 1) break;
			
		}
		if(dif.size() == 1) break;
	}
	//funcion arreglada
	/*for(it = dif.begin(); it != dif.end() - 1 && dif.size() > 1; it++){
		for(it1 = dif.begin() + 1; it1 != dif.end(); it1++){
			if(*it == *it1){
			//cout << *it << " " << *it1 << endl;
				dif.erase(dif.begin() + count);
				//it = dif.begin();
				//it1 = dif.begin();
			}
			if(dif.size() == 1) break;
		}
		if(dif.size() == 1) break;
		
	}*/
	//cout << "vector dif para n= "<< n << endl;
	//imprime_vector(dif);
	/*for(it = dif.begin(); it != dif.end(); it++){
		v.push_back(*it);
	}*/
	//return count;
	//cout << "regresa para n = " << n << " " << v.size() <<endl;
	return dif.size()+1;
}

int main(){
	vector<int> a, l, s;
	vector<int>::iterator it;
	int n, m, ina, aux = 0;
	cin >> n>>m;
	for(int i = 0; i < n; i++){
		cin >> ina;
		a.push_back(ina);
	}
	for(int i = 0; i < m; i++){
		cin >> ina;
		l.push_back(ina);
	}
	//imprime_vector(l);
	for(int i = 0; i < l.size(); i++){
		s.push_back(cuenta_unicos(a, l[i] - 1));
	}
	//cout<<"inicio vector"<<endl;
	imprime_vector(s);
	return 0;
}