/*Hugo David Franco Avila*/
#include <iostream>
#include <bits/stdc++.h>
#define inf 10000
using namespace std;

vector<int> may(vector<int> &r){
	vector<int> z;
	int i ,j, k;
	j = 0;
	k = r[0];
	for(i = 0; i < r.size(); i++){
		if(r[i] >= k){
			k = r[i];
			j = i;
		}
	}
	z.push_back(j);
	z.push_back(k);
	return z;
}

bool check_val(vector<int> &r, int n, int m){
	vector<int>:: iterator it1, it2;
	int x = 10000, count = 0, ind;
	//bool flag = false;
	//if(r.size() % 2 != 0) flag = true;
	//it1 = r.begin() + n - 1;
	it2 = r.begin() + n;
	/*cout << *it1 << endl;
	cout << *it2 << endl;*/
	ind = n;
	while(ind >= 0){
		//cout << "valor act iterador" << *it1 << endl;
		if(r[ind] > m){
			return false;
		} else if(x < r[ind]){
			return false;
		}else if(r[ind] < m){
			//cout << "it1 menor a n" << endl;
			//cout << "x antes " << x << endl;
			if(r[ind] == x){
				count++;
				//cout << count << endl;
			}
			x = r[ind];
			//m = r[ind];
			//cout << "x despues " << x << endl;
		}
		ind--;
	}
	x = 10000;
	for(it2; it2 != r.end(); it2++){
		if(*it2 > m){
			return false;
		} else if( x < *it2){
			return false;
		}else if(*it2 < m){
			//cout << x << endl;
			if(*it2 == x){
				count++;
			}
			x = *it2;
			//m = x;
		}
		
	}
	if(count > 0) return false;
	return true;
}

void imprime_vector(vector<int> &r){
	for(int i = 0; i < r.size(); i++){
		cout << r[i] << endl;
	}
}

int main(){
	int inp, n, mayor;
	string res = "NO";
	vector<int> v, p;
	list<int> l;
	list<int>::iterator it;
	cin >> n;
	//cout << n << endl;
	while(n > 0){
		cin >> inp;
		v.push_back(inp);
		n--;
	}
	p = may(v);
	//cout << "primer indice " << p[0] << endl;
	//cout << "valor mayor " << p[1] << endl;
	//imprime_vector(v);
	/*for(it = l.begin(); it != l.end(); it++){
		v.push_back(*it);
	}*/
	//mayor = may(v);
	//cout << "mayor vale " << may << endl;
	//cout << v[v.size()/2] << endl;
	/*if(v.size() % 2 != 0){
		mayor = v[v.size()/2 -1];
	} else{
		mayor = v[v.size()/2];
	}
	cout << "mayor vale " << may << endl;*/
	if(check_val(v, p[0], p[1])){
		res = "YES";
	}
	/*if(p[1] == v[v.size() - 1] && v.size() > 1 && v[0] != v[v.size() -1]){
		res = "NO";
	}*/
	cout << res;
	return 0;
}