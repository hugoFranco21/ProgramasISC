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
	int n;
	cin >> n;
	vi v(n),dp(n, 1);
	vi::iterator res;
	for(int i = 0; i < n; i++){
		cin >> v[i];
	}
	for(int i = 0; i < n - 1; i++){
		if(v[i] <= v[i+1]){
			dp[i+1] = dp[i] + 1;
		} else{
			dp[i+1] = 1;
		}
	}
	res = max_element(dp.begin(), dp.end());
	cout << *res;
	return 0;
}