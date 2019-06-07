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

//vii coord;
int check_sau(int n, int r, int d, vii &s, const vi &q){
	int count = 0;
	double min_dist, max_dist;
	for(int i = 0; i < n; i++){
		if(2*q[i] > r) continue;
		//if(s[i].first < 0) s[i].first = s[i].first*-1;
		//if(s[i].second < 0) s[i].second = s[i].second*-1;		
		//if(s[i].first == r || s[i].second == r) continue;
		min_dist = sqrt(s[i].first*s[i].first + s[i].second*s[i].second) - q[i];
		max_dist = sqrt(s[i].first*s[i].first + s[i].second*s[i].second) + q[i];
		if(min_dist >= (r-d) && max_dist <=r) count++;
	}
	return count;
}


int main() {
	ios_base::sync_with_stdio(0);cin.tie(0);
	int r, d, n , xi, yi, ri;
	cin >> r >> d;
	cin >> n;
	vii coord(n);
	vi tam(n);
	for(int i = 0; i < n; i++){
		cin >> xi >> yi >> ri;
		coord[i].first = xi;
		coord[i].second = yi;
		tam[i] = ri;
	}
	cout << check_sau(n, r, d, coord, tam);
	return 0;
}