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

set<string> v;

void rotar(string &s){
	char c = s[s.size() - 1];
	for(int i = s.size() - 2; i >= 0; i--){
		s[i + 1] = s[i];
	}
	s[0] = c;
	//cout << s << endl;
}

int main() {
	ios_base::sync_with_stdio(0);cin.tie(0);
	string s;
	int count = 1;
	cin >> s;
	v.insert(s);
	for(int i = 0; i < s.size(); i++){
		rotar(s);
		if(v.find(s) != v.end()){
			break;
		} else{
			v.insert(s);
			count++;
		}
		
	}
	cout << count;
	return 0;
}