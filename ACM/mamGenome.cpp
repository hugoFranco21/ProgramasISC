/*Hugo David Franco Avila*/
#include <iostream>
#include <bits/stdc++.h>

using namespace std;

string rellena(string s){
	int num = s.size()/4, numA = 0, numG = 0, numC = 0, numT = 0, nums = 0;
	for(int i = 0; i < s.size(); i++){
		if(s[i] == 'A') numA++;
		if(s[i] == 'G') numG++;
		if(s[i] == 'C') numC++;
		if(s[i] == 'T') numT++;
		if(s[i] == '?') nums++;
	}
	if(numA > num || numG > num || numC > num || numT > num) return "===";
	for(int i = 0; i < s.size() && nums > 0; i++){
		if(s[i] == '?' && numA < num){
			s[i] = 'A';
			numA++;
			nums--;
		}
		if(s[i] == '?' && numG < num){
			s[i] = 'G';
			numG++;
			nums--;
		}
		if(s[i] == '?' && numC < num){
			s[i] = 'C';
			numC++;
			nums--;
		}
		if(s[i] == '?' && numT < num){
			s[i] = 'T';
			numT++;
			nums--;
		}
	}
	return s;
	
}

int main(){
	//char in;
	int n;
	string sz;
	cin >> n;
	cin >> sz;
	if(n % 4 != 0){
		//cout<< "Primera condicion" << endl;
		cout << "===" << endl;
	} else{
		cout << rellena(sz) << endl;
	}
	
	return 0;
}