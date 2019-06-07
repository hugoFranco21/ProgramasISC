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

vector<pair<int,int>> checkMat(char s[MAX][MAX]){
	vector<pair<int,int>> v;
	v.pb(1,1)
	//for(
	return v;
}

int main() {
	ios_base::sync_with_stdio(0);cin.tie(0);
	int n, a;
	cin >> n;
	char mat[n][n];
	for(int i = 0; i < n; i++){
		for(int j = 0; j < n; j++){
			cin >> a;
			mat[i][j] = a;
		}
	}
	
	return 0;
}