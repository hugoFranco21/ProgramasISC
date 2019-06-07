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

int main() {
	ios_base::sync_with_stdio(0);cin.tie(0);
	string s;
	cin >> s;
	int n = s.size();
	stack<char> pila;
	int contl = 0;
	if(n < 5){
		cout << "NO";
		return 0;
	}
	for(int i = 0; i < n; i++){
		switch(s[i]){
			case 'h':
				if(pila.empty()){
					pila.push('h');
				} 
			break;
			
			case 'e':
				if(!pila.empty()){
					if(pila.top() == 'h'){
						pila.push('e');
					} 
				}
			break;
			
			case 'l':
				if(!pila.empty()){
					if(pila.top() == 'e'){
						pila.push('l');
						contl = 1;
					} else if(pila.top() == 'l' && contl < 2){
						pila.push('l');
						contl = 2;
					} else if(pila.top() == 'l' && contl == 2){
						break;
					}
				}
			break;
			
			case 'o':
				if(!pila.empty()){
					if(pila.top() == 'l' && contl == 2){
						pila.push('o');
					}
				}					
			break;
			
			default:
			break;
		}
		if(pila.size() == 5){
			cout << "YES";
			return 0;
		}
	}
	cout << "NO";
	
	return 0;
}