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
	int n, d, act, next, count = 0, num, back;
	string s;
	cin >> n >> d;
	cin >> s;
	if(s[0] == '0'){
		cout << -1;
		return 0;
	}
	for(int i = 0; i < n;){
		num = d;
		if(s[i] == '1' && i != n - 1){
			count++;
			if(i + num > n){
				break;
			}
			
			//cout << "s[" << i << "] = " << s[i] << endl;
			while(s[i + num] != '1' && num > 0){
				num--;
			}
			if(num == 0){
				cout << -1;
				return 0;
			}
			i = i + num;
			//count++;
		} else{
			break;
		}
	}
	cout << count;
	return 0;
}