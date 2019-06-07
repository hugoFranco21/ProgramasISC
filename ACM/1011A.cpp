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
	int n, k, res = 0, act, cont= 0, prev;
	char aux;
	cin >> n >> k;
	map<char, int> mapa;
	map<char,int>::iterator it, it1;
	for(int i = 0; i < n; i++){
		cin >> aux;
		mapa.insert(pair<char,int>(aux,aux-'`'));
	}
	it = mapa.begin();
	res += it->second;
	//cout << "res =" << res << endl;
	act = res;
	prev = act;
	cont++;
	it1 = next(it,0);
	for(it1; it1 != mapa.end() && cont < k; it1++){
		
		act = it1->second;
		//cout << "act = " << act << endl; 
		if(act > prev + 1){
			prev = act;
			res += act;
			//cout << "res =" << res << endl;
			cont++;
		}
	}
	if(cont == k){
		cout << res;
	} else{
		cout << -1;
	}
	return 0;
}