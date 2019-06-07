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
	ios_base::sync_with_stdio(0);cin.tie(0);
	int n, lucky = 4, i = 0;
	vi v{4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777};
	cin >> n;
	while(v[i] <= n){
		if(n % v[i] == 0){
			cout << "YES";
			return 0;
		}
		i++;
	}
	//RESUBMISSION
	cout << "NO";
	return 0;
}