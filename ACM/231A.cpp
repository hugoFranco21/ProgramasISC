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
	int n, num, count = 0, act;
	cin >> n;
	for(int i = 0; i < n; i++){
		act = 0;
		for(int j = 0; j < 3; j++){
			cin >> num;
			if(num == 1){
				act++;
			}
		}
		if(act >= 2) count++;
	}
	cout << count;
	return 0;
}