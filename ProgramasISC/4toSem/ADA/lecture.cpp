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
	int n, m, i = 0;
	string prof, al, salida = "", aux;
	cin >> n >> m;
	unordered_map<string, int> mp;
	vector<string> v(m);
	for(i = 0; i < m; i++){
		cin >> prof >> al;
		mp[prof] = i;
		mp[al] = i;
		v[i] = (prof.size() <= al.size()) ? prof : al;
	}
	i = 0;
	while(i < n){
		cin >> al;
		
		salida += v[mp[al]];
		if(i != n - 1) salida += " ";
		i++;
	}
	cout << salida;
	return 0;
}