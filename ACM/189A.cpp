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
	int n, i = 0, act;
	vi v(3);
	cin >> n >> v[0] >> v[1] >> v[2];
	sort(v.begin(), v.end());
	int dp[n+1] = {INF};
	cout << "v[0] = " << v[0] << endl;
	while(i < n+1){
		dp[i] = 0;
		i++;
	}
	for(i = 0; i < n +1; i++){
		cout << dp[i] << endl;
	}
	for(i = 0; i < 3; i++){
		act = 0;
		for(int j = v[i]; j < n+1; j++){
			if(j % v[i] == 0){
				dp[j] = max(1 + act, dp[j]);
				act = dp[j];
			} else{
				dp[j] = 0;
			}
			cout << "dp[" << j << "] = " << dp[j] << endl;
		}
	}
	cout << dp[n];
	return 0;
}