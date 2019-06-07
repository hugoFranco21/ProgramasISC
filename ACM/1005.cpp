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

ll fastPow(ll a, ll b) {
    ll ret=1;
    while(b>0) {
        if(b&1) ret=ret*a;
        a=a*a;
        b>>=1;
    }
    return ret;
}

int main() {
	ios_base::sync_with_stdio(0);cin.tie(0);
	unordered_set<ll> pot2;
	unordered_set<int> encontrados;
	bool flag;
	int i = 0, j = 0;
	for(i = 1; i <= 34; i++){
		pot2.insert(fastPow(2,i));
	}
	/*unordered_set<ll> :: iterator itr; 
    for (itr = pot2.begin(); itr != pot2.end(); itr++) 
        cout << (*itr) << endl; */
	int n, cont = 0, aux;
	cin >> n;
	vi v(n);
	for(i = 0; i < n; i++){
		cin >> aux;
		v[i] = aux;
	}
	if(v.size() == 1){
		cout << 1;
		return 0;
	}
	for(i = 0; i < n; i++){
		flag = false;
		if(encontrados.find(v[i]) != encontrados.end()) i++;
		if(i >= n) break;
		for(j = 0; j < n; j++){
			if(i == j) continue;
			//cout << "v[i] + v[j] " << v[i] + v[j] << endl;
			if(pot2.find(v[i] + v[j]) != pot2.end()){
				encontrados.insert(v[i]);
				encontrados.insert(v[j]);
				flag = true;
				break;
			}
		}
		if(!flag) cont++;
	}
	cout << cont;
	return 0;
}