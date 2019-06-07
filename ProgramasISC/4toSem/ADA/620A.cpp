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
	int x1, y1, x2, y2, distx, disty, res;
	cin >> x1 >> y1;
	cin >> x2 >> y2;
	distx = x2 - x1;
	disty = y2 - y1;
	if(distx < 0) distx *= -1;
	if(disty < 0) disty *= -1;
	res = distx > disty ? distx : disty;
	cout << res;
	return 0;
}