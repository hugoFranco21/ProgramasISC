/*Hugo David Franco Avila*/
#include <iostream>
#include <bits/stdc++.h>

using namespace std;

string s;

char ult_letra(string sz){
	//cout<<"ult letra de s es " << sz[sz.size()-1]<<endl;
	return sz[sz.size()-1];
}

string pass(string sz){
	string res;
	int i = 0;
	for(int i = 0;true; i++){
		res += sz[i];
		if(sz[i] == ult_letra(sz)) break;
	}
	//cout <<res<<endl;
	return res;
}

inline string isPassword(string sz){
	int j = 0, ind, i;
	string pref, ob, suf, aux, sn;
	pref = sz;
	size_t found, fsuf;
	//if(sz[0] != sz[sz.size() -1]) return "Just a legend";
	for(i = sz.size() - 2; i > 0; i--){
		pref.resize(i);
		//cout << "pref actual " << pref << endl;
		sn = sz.substr(1, sz.size() - 2);
		//cout << "sn actual para encontrar ob " << sn <<endl;
		found = sn.find(pref);
		if(found!=string::npos){
			sn = sz.substr(2, sz.size());
			//cout << "substring para encontrar suf " << sn <<endl;
			if(sn == pref) return pref;
			fsuf = sn.find(pref, found + 1);
			if(fsuf!=string::npos && pref[pref.size() - 1] == sn[sn.size() - 1]) return pref;
		} //else{
			//return "Just a legend";
		//}
	}
	return "Just a legend";
}


int main(){
	string sub;
	cin >> s;
	sub = pass(s);
	cout << isPassword(s) << endl;
	return 0;
}