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
	int n, aux, count = 0, tam = 0;
	cin >> n;
	vi v(n), auxiliar;
	for(int i = 0; i < n; i++){
		cin >> aux;
		v[i] = aux;
	}
	sort(v.begin(), v.end());
	do{
		tam = 0;
		for(int i = 0; i < v.size(); i++){
			if(v[i] < (i - tam)){
				auxiliar.pb(v[i]);
				tam++;
			}
		}
		sort(auxiliar.begin(), auxiliar.end());
		count++;
		v.resize(auxiliar.size());
		v = auxiliar;
		auxiliar.clear();
		
	} while(tam != 0);
	cout << count;	
	return 0;
}