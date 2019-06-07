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
	int n, aux, i = 0, svec, max, indmax, min, indmin, ans;
	cin >> n;
	svec = n;
	vector<int> v(n);
	while(n > 0){
		cin >> aux;
		v[i] = aux;
		i++;
		n--;		
	}
	max = v[0];
	indmax = 0;
	min = v[0];
	indmin = 0;
	for(i = 1; i < svec; i++){
		if(v[i] > max){
			max = v[i];
			indmax = i;			
		} else if(v[i] <= min){
			min = v[i];
			indmin = i;
		}
	}
	ans = indmax - 1 + svec - indmin;
	if(indmax > indmin) ans--;
	cout << ans;
	return 0;
}