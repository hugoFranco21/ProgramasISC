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

ll fastPow(ll a, ll b) {
    ll ret=1;
    while(b>0) {
        if(b&1) ret=ret*a;
        a=a*a;
        b>>=1;
    }
    return ret;
}

/*int manhattan(vector<pair<ll,ll>> &r){
	int j = 0, count = 0;
	double mandis, dandis;
	for(int i = 0; i < r.size() - 1; i++){
		
		for(j = i + 1; j < r.size(); j++){
			mandis = sqrt((fastPow(r[i].first-r[j].first,2))+(fastPow(r[i].second-r[j].second,2)));
			dandis = (r[i].first - r[j].first) +(r[i].second - r[j].second);
			if(dandis < 0) dandis*=-1;
			//cout << mandis << " " << dandis << endl;
			if(mandis == dandis) count++;
		}
	}
	return count;
}*/

int manhattan(vector<pair<ll,ll>> &r){
	int count = 0;
	for(int i = 0; i < r.size() - 1; i++){
		for(int j = i + 1; j < r.size(); j++){
			if(r[i].first == r[j].first){
				count++;
			} else if(r[i].second == r[j].second){
				count++;
			}
		}
	}
	return count;
}

int main() {
	ios_base::sync_with_stdio(0);cin.tie(0);
	int n;
	ll x, y;
	cin >> n;
	vector<pair<ll,ll>> v(n);
	for(int i = 0; i < n; i++){
		cin >> x >> y;
		v[i].first = x;
		v[i].second = y;
	}
	cout << manhattan(v);
	return 0;
}