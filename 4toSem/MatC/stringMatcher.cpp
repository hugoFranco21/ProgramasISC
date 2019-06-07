#include <iostream>
#include <algorithm>
#include <map>
#include <utility>
#include <string>

using namespace std;

map<pair<int,char>,int> generarDFA(string P, string E){
	map<pair<int,char>,int> mapa;
	int m = P.size();
	int k, j, l, n = 0;
	pair<int, char> llave;
	string p[m+1];
	p[0] = "";
	for(int i = 1; i < m+1; i++){
		p[i] = P.substr(0,i);
		//cout << "substrings " << p[i] << endl;
	}
	
	/*Este funciona NO MODIFICAR*/
	for(int q = 0; q <= m; q++){		
		for(auto c : E){
			n = 0;
			k = q+1;
			//l = k - q;
			cout << "estado " << q << endl;
			cout << "letra " << c << endl;
			
			//k--;
			if(k > m){
				k = m;
				n++;
			}
			cout << "p[" << k << "] actual " << p[k] << endl;
			cout << "substring a checar " << (p[q]+c).substr(n,p[q].size() + 1) << endl;
			do{
				//cout << "p[" << k << "] actual " << p[k] << endl;
				//cout << "substring a checar " << (p[q]+c).substr(n, p[q].size() + 1) << endl;
				if(p[k] == (p[q]+c).substr(n, p[q].size() + 1)){
					//cout << "p[" << k << "] actual " << p[k] << endl;
					//cout << "substring a checar " << (p[q]+c).substr(n, p[q].size() + 1) << endl;
					break;
				}
				k--;
				if(n + 1 < p[q].size() + 1) n++;
				if(k == 0) break;
			}while(p[k] != (p[q]+c).substr(n, p[q].size() + 1)); 
			cout << "fuera p[" << k << "] actual " << p[k] << endl;
			cout << "fuera substring a checar " << (p[q]+c).substr(n, p[q].size() + 1) << endl;
			llave = make_pair(q,c);
			cout << llave.first << " " << llave.second << " = " << k << endl;
			mapa[llave] = k;
		}	
	}
	return mapa;
}	

int matcherDFA(string T, map<pair<int,char>,int> &mapa, int m){
	int n = T.size();
	int q = 0, ans = 0;
	pair<int, char> llave;
	for(int i = 0; i < n; i++){
		llave = make_pair(q,T[i]);
		q = mapa[llave];
		//cout << "estado actual " << q << endl;
		if (q == m) ans++;
	}
	return ans;
}

int main(){
	map<pair<int,char>,int> transiciones;
	string P, E, S;
	cin >> E;
	cin >> P;
	cin >> S;
	transiciones = generarDFA(P,E);
	/*for(map<pair<int,char>,int>::iterator it = transiciones.begin(); it != transiciones.end(); it++){
		cout << it->first.first << " " << it->first.second << " = " << it->second << endl;
	}*/
	cout << matcherDFA(S, transiciones, P.size());
	return 0;
}
