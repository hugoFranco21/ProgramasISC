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
	ll r, g, b, rd, gd, bd, modul, ans;
	cin >> r >> g >> b;
	vector<ll> rgb{r,g,b};
	sort(rgb.begin(), rgb.end());
	if((rgb[0]+rgb[1]) < rgb[2]/2){
		cout << rgb[0] + rgb[1];
		
	} else{
		rd = r/3;
		gd = g/3;
		bd = b/3;
		modul = r%3 + g%3 + b%3;
		ans = rd+gd+bd+(modul/3);
		cout << rd+gd+bd+(modul/3);
	}
	return 0;
}