/*Hugo David Franco Avila*/
#include <algorithm>
#include <bitset>
#include <cmath>
#include <cstdio>
#include <cstring>
#include <deque>
#include <functional>
#include <iomanip>
#include <iostream>
#include <queue>
#include <map>
#include <numeric>
#include <set>
#include <sstream>
#include <stack>
#include <utility>
#include <vector>

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
	int n, m, k, ans;
	bool flag;
	vi op;
	cin >> n >> m;
	if(n < m){
		cout << -1 << endl;
	} else{
		if(n % 2 == 0){
			for(int i = n/2; i <= n; i++){
				op.pb(i);
			}
		} else{
			for(int i = n/2 + 1; i <=n; i++){
				op.pb(i);
			}
		}
		for(int i = 0; i < op.size(); i++){
			if(op[i] % m == 0){
				cout << op[i] << endl;
				break;				
			}
		}
	}
	return 0;
}








