/*Hugo David Franco AvilA*/
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
#define MAX 100
using namespace std;

typedef long long ll;
typedef pair<int, int> ii;
typedef vector<int> vi;
typedef vector<ii> vii;
typedef vector<vi> vvi;


int main() {
	ios_base::sync_with_stdio(0);cin.tie(0);
	int n, a, ser = 0, dim = 0, count = -1;;
	cin >> n;
	vi v(n);
	for(int i = 0; i < n; i++){
		cin >> a;
		v[i] = a;
	}
	while(!v.empty()){
		count *= -1;
		if(v[v.size()-1] > v[0]){
			if(count > 0){
				ser += v[v.size()-1];
			} else{
				dim += v[v.size() - 1];
			}
			v.pop_back();
		} else{
			if(count > 0){
				ser += v[0];
			} else{
				dim += v[0];
			}
			v.erase(v.begin());
		}
	}
	cout << ser << " " << dim;
	return 0;
}