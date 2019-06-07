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
	//queue<char> q;
	//stack<char> ss;
	int i = 0, j;
	string s;
	cin >> s;
	string inv(s.size(), 'x');
	set<char> p;
	//q.push(s[0]);
	//ss.push(s[0]);
	for(j = s.size() - 1; i < s.size(), j >= 0; i++, j--){
		inv[i] = s[j];
		p.insert(s[i]);
	}
	if(p.size() == 1){
		cout << 0;
		return 0;
	}
	if(inv == s){
		cout << inv.size() - 1;
	} else{
		cout << s.size();
	}
	
	return 0;
}