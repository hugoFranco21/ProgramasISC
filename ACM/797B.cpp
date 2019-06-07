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
	int n, aux, odd = 0, min = 99999, max = -99999, res = 0;
	cin >> n;
	vi v(n);
	for(int i = 0; i < n; i++){
		cin >> aux;
		v[i] = aux;
		if(aux > 0) odd += aux;
		if(aux < 0 && aux & 1 == 1 && aux > max){
			max = aux;
			//cout << "max = " << max << endl;
		}
		if(aux > 0 && aux & 1 == 1 && aux < min){
			min = aux;
			//cout << "min = " << min << endl;
		}
		
	}
	//cout << "odd saliendo del ciclo " << odd << endl;
	if(odd % 2 == 0){
		res = ((max*-1) > (min)) ? min : -1*max;
		//cout << "res " << res << endl;
	}
	odd -= res;
	cout << odd;
	return 0;
}