#include<bits/stdc++.h>

typedef long long int ll;

using namespace std;

string getnum(int n, int t);

int main(){
	int n, t;
	cin >> n >> t;
	cout << getnum(n,t) << endl;
	return 0;
}

string getnum(int n,int t){
	if(n == 1 && t == 10){
		return "-1";
	} 
	string s;
	if(t == 10){
		s = "10";
		n--;
	} else {
		s += t + 48;
	}
	n--;
	while(n--){
		s += "0";
	}
	return s;
}