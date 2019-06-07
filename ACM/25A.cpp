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
	int n, par = 0, non = 0, indp, indn;
	cin >> n;
	vi v(n);
	for(int i = 0; i < n; i++){
		cin >> v[i];
		if(v[i] % 2 == 0){
			par++;
			indp = i;
		} else{
			non++;
			indn = i;
		}
	}
	if(par > non){
		cout << indn + 1;
	} else{
		cout << indp + 1;
	}
	return 0;
}