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

ll minimo(ll n, int k){
	int i = 1;
	ll fact, aux;
	fact = fastPow(10, k);
	if(k == 0) return n;
	if(n % fact == 0) return n;
	//n = n*k;
	aux = n;
	while(true){
		if(n % fact == 0) return n;
		n = aux;
		n = n*i;
		i++;
	}
}
int main() {
	ios_base::sync_with_stdio(0);cin.tie(0);
	int k;
	ll n;
	cin >> n >> k;
	cout << minimo(n,k);
	return 0;
}