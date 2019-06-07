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

int contar(vi &v){
	int p = 1, bro = 0, yo = 0, ind = v.size() - 2;
	bro = accumulate(v.begin(), v.end() - 1, 0);
	yo = v[v.size() - 1];
	while(yo <= bro && ind >= 0){
		yo += v[ind];
		bro -= v[ind];
		ind--;
		p++;
	}
	return p;
}

int main() {
	int n, aux, i = 0;	
	cin >> n;
	vi v(n);
	while(n > 0){
		cin >> aux;
		v[i] = aux;
		i++;
		n--;		
	}
	sort(v.begin(), v.end());
	cout << contar(v);
	return 0;
}