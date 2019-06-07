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

void corregir(string &s){
	
}

int main() {
	ios_base::sync_with_stdio(0);cin.tie(0);
	int t, d, may, mi, id, imay, imi;
	cin >> t;
	vector<string> v(t);
	for(int i = 0; i < t; i++){
		cin >> v[i];
	}
	for(int i = 0; i < t; i++){
		d = 0; may = 0; mi = 0; id = 0; imay = 0; imi = 0;
		for(int j = 0; j < v[i].size(); j++){
			if(v[i][j] > 64 && v[i][j] < 91){
				may++;
				imay = j;
			} else if(v[i][j] > 47 && v[i][j] < 58){
				d++;
				id = j;
			} else{
				mi++;
				imi = j;
			}
		}
		if(d > 0 && may > 0 && mi > 0){
			continue;
		} else{
			if(
		}
	}
	return 0;
}