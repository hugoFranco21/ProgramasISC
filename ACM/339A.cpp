#include <bits/stdc++.h>

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
	string s;
	int ind = 0;
	vi v;
	cin >> s;
	for(int i = 0; i < s.size(); i++){
		if(s[i] != '+'){
			v.pb(s[i]);
		}
	}
	sort(v.begin(), v.end());
	for(int i = 0; i < s.size(); i++){
		if(i % 2 == 0){
			cout << v[ind] - '0';
			ind++;
		} else{
			cout << '+';
		}
	}
	return 0;
}