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

string race(ll n, ll x, ll y){
	//int count = 1;
	if(x == 1 && y == n) return "White";
	if(x == 1 && y == 1) return "White";
	if(x == n && y == 1) return "White";
	if(x == n && y == n) return "Black";
	for(int i = 1; i <= n; i++){
		for(int j = n - 1; j >= 1; j--){
			//cout << i << " " << j << endl;
			if(x == i && y == j) return "White";
		}	
		//count++;
	}
	return "Black";
}

int main() {
	ios_base::sync_with_stdio(0);cin.tie(0);
	ll n, x, y;
	cin >> n;
	cin >> x >> y;
	cout << race(n,x,y);
	return 0;
}