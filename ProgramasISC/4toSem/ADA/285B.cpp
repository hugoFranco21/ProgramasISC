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
	int n, s, t, num = 0;
	cin >> n >> s >> t;
	vi p(n);
	for(int i = 0; i < n; i++){
		cin >> p[i];
	}
	set<int> visited;
	visited.insert(s);
	while(s != t){
		num++;
		s = p[s - 1];
		if(visited.find(s) != visited.end()){
			num = -1;
			break;
		} else{
			visited.insert(s);
		}
	}
	cout << num;
	return 0;
}