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
	int n, m, k, aux, fedor, count = 0, mask, act = 0;
	cin >> n >> m >> k;
	vi v(m+1);
	for(int i = 0; i < m+1; i++){
		cin >> aux;
		v[i] = aux;
	}
	fedor = v[m];
	//cout << "fedor vale " << fedor << endl;
	for(int i = 0; i < m; i++){
		mask = v[i]^fedor;
		//cout << "la mascara de v[i] con fedor es " << mask << endl;
		act = 0;
		while(mask > 0){
			aux = mask & 1;
			if(aux == 1) act++;
			if(act > k){
				count--;
				break;
			}
			mask>>=1;
		}
		count++;
	}
	cout << count;
	return 0;
}