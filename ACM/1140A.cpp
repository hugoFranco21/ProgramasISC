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
	int n, aux, i = 0, maxday = 0, count = 0;
	cin >> n;
	vi v(n);
	for(i = 0; i < n; i++){
		cin >> aux;
		v[i] = aux;
	}
	i = 0;
	while(i < n){
		if(v[i] > maxday){
			maxday = v[i];
		}
		if(maxday > (i+1)){
			i++;
		} else{
			i++;
			count++;
		}
	}
	cout << count;	
	return 0;
}