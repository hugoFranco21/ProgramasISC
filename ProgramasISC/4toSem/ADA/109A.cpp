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
	int n, a, b, i, j;
	bool existe = false;
	cin >> n;
	a = n/4;
	b = n/7;
	for(i = 0; i <= a; i++){
		for(j = 0; j <= b; j++){
			if(i*4 + j*7 == n){
				existe = true;
				break;
			}
		}
		if(existe){
			break;
		}
	}
	if(!existe){
		cout << -1;
	} else{
		for(int k = 0; k < i; k++){
			cout << '4';
		}
		for(int w = 0; w < j; w++){
			cout << '7';
		}
	}
	return 0;
}