#include <bits/stdc++.h>

#define INF 1000000000
#define FOR(i, a, b) for(int i=int(a); i<int(b); i++)
#define FORC(cont, it) for(decltype((cont).begin()) it = (cont).begin(); it != (cont).end(); it++)
#define pb push_back

using namespace std;

typedef long long ll;
typedef pair<int, int> ii;
typedef vector<int> vi;
typedef vector<ii> vii;
typedef vector<vi> vvi;

int check_izq(string &s){
	for(int i = 0; i < s.size(); i++){
		if(s[i] == '>'){
			return i;
		}
	}
	return 101;
}

int check_der(string &s){
	int num = 0;
	for(int i = s.size() - 1; i >= 0; i--, num++){
		if(s[i] == '<'){
			return num;
		}
	}
	return 101;
}

int main() {
	ios_base::sync_with_stdio(0);cin.tie(0);
	int t, n;
	string s;
	cin >> t;
	vector<string> v(t);
	for(int i = 0; i < t; i++){
		cin >> n;
		cin >> s;
		v[i] = s; 
	}
	for(int i = 0; i < t; i++){
		if(v[t].size() == 1){
			cout << 0 << endl;
		} else{
			cout << min(check_izq(v[i]),check_der(v[i])) << endl;
		}
	}
	
	return 0;
}