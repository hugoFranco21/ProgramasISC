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
	int x = 0, y = 0, z = 0, aux1, aux2, aux3, n;
	cin >> n;
	for(int i = 0; i < n; i++){
		cin >> aux1 >> aux2 >> aux3;
		x+=aux1;
		y+=aux2;
		z+=aux3;
	}
	if(x == 0 && y == 0 && z == 0){
		cout << "YES";
	} else{
		cout << "NO";
	}
	return 0;
}