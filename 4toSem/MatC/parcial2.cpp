/*
Hugo David Franco Avila A01654856
Daniel Elias Becerra A01208905
Manuel Yafté Gallegos López A01702980
*/

#include <bits/stdc++.h>
#define pb push_back

using namespace std;

void imprime_map(map<char,set<string>> &mapa){
	map<char,set<string>>::iterator it;
	set<string>::iterator itr;
	for(it = mapa.begin(); it != mapa.end(); it++){
		cout << it->first << endl;
		for(itr = it->second.begin();itr != it->second.end(); itr++){
			cout << *itr << " ";
		}
		cout << endl;
	}
}

void CYK(){
    
}

int main(){
    map<char, set<string>> dict;
    set<string> comb;
	string s, aux;
	vector<string> cadenas;
    //while(cin >> s){
	for(int j = 0; j < 4; j++){
		getline(cin, s);
		if(s[0] > 64 && s[0] < 91){
			cout << "s[0] " << s[0] << endl;
			comb.clear();
			for(int i = 3; i < s.length(); i++){
				if(s[i] == 32){
					comb.insert(aux);
				} else{
					aux += s[i];
				}
			}
			comb.insert(aux);
			dict[s[0]] = comb;
		} else{
			cadenas.pb(s);
		}
	}
	imprime_map(dict);
	return 0;
}