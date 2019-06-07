#include <bits/stdc++.h>

using namespace std;

int main(){
    int t, n;
	cin >> t;
	vector<string> v(t);
	string s;
	for(int i = 0; i < t; i++){
		cin >> n;
		cin >> s;
		for(int j = 0; j < s.size(); j++){
			if(s[j] == 'S'){
				s[j] = 'E';
			} else{
				s[j] = 'S';
			}
		}
		v[i] = s;
	}
	for(int i = 0; i < t; i++){
		cout << "Case #" << i+1 << ": " << v[i] << endl;
	}
	return 0;
}