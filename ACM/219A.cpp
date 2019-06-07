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
	int k, max, ind = 0;
	string s, aux="";
	map<char,int> mapa;
	map<char,int>::iterator it;
	cin >> k;
	cin >> s;
	for(int i = 0; i < s.size(); i++){
		mapa[s[i]]++;
	}
	s.clear();
	for(it = mapa.begin(); it != mapa.end(); it++){
		ind = 0;
		if(it->second % k == 0){
			while(ind < it->second / k){
				aux+=it->first;
				ind++;
			}
		} else{
			cout << -1;
			return 0;
		}
	}
	for(int i = 0; i < k; i++){
		s+=aux;
	}
	cout << s;
	return 0;
}