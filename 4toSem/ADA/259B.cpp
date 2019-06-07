#include <bits/stdc++.h>

#define INF 1000000000
#define FOR(i, a, b) for(int i=int(a); i<int(b); i++)
#define FORC(cont, it) for(decltype((cont).begin()) it = (cont).begin(); it != (cont).end(); it++)
#define pb push_back
#define nu 3

using namespace std;

typedef long long ll;
typedef pair<int, int> ii;
typedef vector<int> vi;
typedef vector<ii> vii;
typedef vector<vi> vvi;

void imprime(int mat[nu][nu]){
	for(int i = 0; i < nu; i++){
		for(int j = 0; j < nu; j++){
			cout << mat[i][j] << " ";
		}
		cout << endl;
	}
}

int main() {
	ios_base::sync_with_stdio(0);cin.tie(0);
	int aux, matr[nu][nu], total = 0, med;
	for(int i = 0; i < nu; i++){
		for(int j = 0; j < nu; j++){
			cin >> aux;
			matr[i][j] = aux;
			total += aux;
		}
	}
	med = total/2;
	matr[0][0] = med - matr[0][1] - matr[0][2];
	matr[1][1] = med - matr[1][0] - matr[1][2];
	matr[2][2] = med - matr[2][0] - matr[2][1];
	imprime(matr);
	return 0;
}