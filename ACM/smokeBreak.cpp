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

int main() {
	ios_base::sync_with_stdio(0);cin.tie(0);
	int n, br = 0, res = 0;
	ll L, a, ti, li;
	cin >> n >> L >> a;
	vector<bool> libre(L, false);
	vector<bool>::iterator it;
	/*for(ll j = 0; j < L; j = j + 1){
		libre[j] = false;
	}*/
	for(int i = 0; i < n; i++){
		cin >> ti >> li;
		for(ll j = 0; j < li; j = j + 1){
			libre[ti + j] = true;
		}
	}
	for(it = libre.begin(); it != libre.end(); it++){
		if(*it == false){
			br++;
		} else{
			br = 0;
		}
		if(br == a){
			res++;
			br = 0;
		}
	}
	
	cout << res;
	return 0;  
}		
