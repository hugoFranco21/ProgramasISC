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

/*double angulo(int n){
	return (n - 2)*180/n;
}*/

vi v;

void val(vi &r){
	int p;
	for(int i = 3; i < 1000 ; i++){
		p = (i - 2)*180/i;
		if(p*i % 180 == 0){
			r.pb(p);
		}
	}
}



int main() {
	int t, i, aux;
	bool flag;
	cin >> t;
	vi pol;
	vi:: iterator it;
	for(i = 0; i < t; i++){
		cin >> aux;
		pol.pb(aux);
	}
	val(v);
	for(i = 0; i < pol.size(); i++){
		flag = false;
		for(it = v.begin(); it != v.end(); it++){
			if(pol[i] == *it){
				flag = true;
			}
		}
		if(flag){
			cout << "YES" <<endl;
		} else{
			cout << "NO" << endl;
		}
	}
	return 0;
}