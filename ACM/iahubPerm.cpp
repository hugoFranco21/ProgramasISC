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

ll MOD = 1e9+7;

ll factorial(int n){
	if(n == 0 || n == 1) return 1;
	return n*factorial(n-1);
}

ll comb(const set<int> &p, const set<int> &d){
	int dif = 0, mul = p.size() + 1;
	set<int>::iterator it;
	for(it = p.begin(); it != p.end(); it++){
		cout << *it << endl;
		if(d.find(*it) != d.end()){
			dif++;
			//Do nothing
		} else{
			//dif++;
			mul -= 1;
		}
	}
	cout << "dif vale " << dif << endl;
	cout << "mul vale " << mul << endl;
	
	return factorial(dif)*mul;
}

int main() {
	ios_base::sync_with_stdio(0);cin.tie(0);
	int n, p, num = 0;
	set<int> pos, dig;
	cin >> n;
	vi v(n);
	for(int i = 0; i < n; i++){
		cin >> p;
		v[i] = p;
		if(p == -1){
			num++; 
			pos.insert(i+1);			
		} else{
			dig.insert(p);
		}
	}
	cout << comb(pos,dig) % MOD;
	return 0;
}