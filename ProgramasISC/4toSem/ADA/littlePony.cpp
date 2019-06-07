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

void imprime(vi &v){
	for(int i = 0; i < v.size(); i++){
		cout << v[i] << endl;
	}
}

int main() {
	ios_base::sync_with_stdio(0);cin.tie(0);
	bool flag = true;
	int n, aux, ind = 0, min, ch = 0, ans = 0;
	cin >> n;
	vi v(n), q(n);
	while(n > 0){
		cin >> aux;
		v[ind] = aux;
		ind++;
		n--;
	}
	ind = 0;
	min = v[0];
	for(int i = 1; i < v.size(); i++){
		if(v[i] <= min && v[i] != v[i-1]){
			min = v[i];
			ind = i;
		}
	}
	ans = (ind != 0) ? v.size() - ind : 0;
	for(int i = 0; i < v.size(); i++){
		q[i] = v[(i+ind) % v.size()];
	}
	//imprime(q);
	for(int i = 1; i < v.size(); i++){
		if(q[i] < q[i-1]){
			ans = - 1;
			flag = false;
			break;
		}
	}
	
	
	if(flag){
		cout << ans;
	} else{
		cout << -1;
	}
	return 0;
}