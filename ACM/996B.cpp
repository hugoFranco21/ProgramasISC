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
	int n, j = 0, res;
	ll min = 1e10;
	int aux;
	cin >> n;
	vii v(n);
	for(int i = 0; i < n; i++){
		cin >> aux;
		v[i].first = aux;
		j = v[i].first/n;
		while(v[i].first/((i+1)+(j*n)) > 0){
			j++;
		}
		v[i].second = (i+1) + j*n;
		if(v[i].second < min){
			min = v[i].second;
			res = i + 1;
		}
		//cout << "fila " << i+1 << " = " << v[i].second << endl;
	}
	cout << res;
	return 0;
}