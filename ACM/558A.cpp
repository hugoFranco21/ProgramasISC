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
	bool regr = false;
	int n, aux1, aux2, manz = 0, count = 0, izq = 0, der = 0, j = 0;
	cin >> n;
	unordered_map<int,int> mapa;
	vi pos(100), neg(100);
	for(int i = 0; i < n; i++){
		cin >> aux1 >> aux2;
		mapa[aux1] = aux2;
		if(aux1 < 0){
			neg[izq] = aux1;
			izq++;
		} else{
			pos[der] = aux1;
			der++;
		}
	}
	sort(pos.begin(), pos.end());
	sort(neg.begin(), neg.end());
	//cout << "izq  " << izq << endl;
	//cout << "der " << der << endl;
	if(der > izq){
		while(izq >= 1){
			manz += mapa[neg[izq - 1]];
			manz += mapa[pos[100 - der]];
			j++;izq--; der--;
		}
		manz += mapa[pos[100 - der]];
	} else if(izq > der){
		while(der > 0){
			manz += mapa[neg[izq-(1+j)]];
			manz += mapa[pos[100 - der]];
			j++; der--;
		}
		manz += mapa[neg[izq - (1+j)]];
	} else{
		while(izq >= 1){
			manz += mapa[neg[izq - 1]];
			//cout << "mapa negativo " << mapa[neg[izq - 1]] << endl;
			//cout << "sumar neg " << endl;
			//cout << "manz " << manz << endl;
			manz += mapa[pos[100 - der]];
			//cout << "mapa positivo " << mapa[pos[100 - der]] << endl;
			//cout << "sumar pos" << endl;
			//cout << "manz " << manz << endl;
			j++; izq--; der--;
		}
	}
	cout << manz;
	return 0;
}