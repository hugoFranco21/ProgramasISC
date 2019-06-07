/*Hugo David Franco Avila*/
#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int main(){
	int n, lect;
	vector<int> v;
	cin >> n;
	for(int i = 0; i < n; i++){
		cin >> lect;
		v.push_back(lect);
	}
	if(n % 2 != 0 && v[0] %2 != 0 && v[v.size() -1]%2 != 0){
		cout << "Yes";
	} else{
		cout << "No";
	}
	
}