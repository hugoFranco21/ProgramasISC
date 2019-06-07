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

ll pares(ll n){
	return (n*(n-1))/2;
}

int main() {
	ll n, m, minimo, maximo, aux, aux2, nteam, tam;
	cin >> n >> m;
	/*if(m == 1){
		cout << (n*(n-1))/2 << " " << (n*(n-1))/2;
		return 0;
	}*/
	maximo = n - m + 1;
	maximo = pares(maximo);
	//while(true){
	if(n % m == 0){
		minimo = n/m;
		minimo = m*(pares(minimo));
	} else{
		aux = n%m;
		tam = n/m;
		aux2 = aux*(pares(tam + 1));
		minimo = aux2 + (m - aux)*(pares(tam));
	}
	//}
	cout << minimo << " " << maximo;
	return 0;
}