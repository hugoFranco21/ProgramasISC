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
	string s;
	int n, x, y, change = 0, i;
	cin >> n >> x >> y;
	cin >> s;
	i = n - x - 1;
	if(s[i] != '1') change++;
	i++;
	for(; i < n; i++){
		if(i < n - (y + 1)){
			if(s[i] != '0'){
				change++;
			}
		} else if(i == n - (y + 1)){
			if(s[i] != '1'){
				change++;
			}
		} else{
			if(s[i] != '0'){
				change++;
			}
		}
	}
	cout << change;
	return 0;
}