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
	int n, k, m, res = 0, aux;
	map<int,int> mapa;
	map<int,int>::iterator itr, it;
	queue<int> q;
	cin >> n >> k >> m;
	for(int i = 1; i <= m; i++){
		cin >> aux;
		mapa.insert(pair<int,int>(aux,i));
	}
	for(int i = 0; i < k; i++){
		for(int j = 0; j < n; j++){
			cin >> aux;
			q.push(aux);
		}
	}
	while(!q.empty()){
		it = mapa.find(q.front());
		res += it -> second;
		q.pop();
		for(itr = mapa.begin(); itr != mapa.end(); itr++){
			if(itr -> second < it->second){
				itr->second++;
			}
		}
		it->second = 1;
	}
	cout << res;
	
	return 0;
}