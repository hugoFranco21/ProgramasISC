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

ll gcd(ll a,ll b) {
    if(b) return gcd(b, a%b);
    return a;
}

ll mcm(ll a, ll b) {
    return a/gcd(a, b)*b;
}

int main() {
	ios_base::sync_with_stdio(0);cin.tie(0);
	ll n, a, b, p, q;
	ll res;
	cin >> n >> a >> b >> p >> q;
	bool check = p > q;
	//cout << "mcm ab" << mcm(a,b) << "a " << a << " b " << b << endl;
	//res += (n/b - n/mcm(a,b))*q;
	if(check){
		if(b % a == 0){
			res=(n/a)*p;
		} else{
			res=(n/a)*p;
			res+=(n/b - n/mcm(a,b))*q;
		}
	} else{
		if(a % b == 0){
			res = (n/b) * q;
		} else{
			res=(n/b)*q;
			res+=(n/a - n/mcm(a,b))*p;
		}
	}
	cout << res;
	return 0;
}