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
	int n;
	char ch;
	string s;
	cin >> n >> s;
	ch = s[0];
	if(n == 1){
		if(ch == '0'){
			cout << "No";
		} else{
			cout << "Yes";
		}
		return 0;
	}
	//cout << "wtf" << endl;
	if(n == 2){
		if(ch == s[1]){
			cout << "No";
		} else{
			cout << "Yes";
		}
		return 0;
	}
	for(int i = 1; i < n - 1; i++){
		
		//cout << s[i] << endl;
		//cout << s[i-1] << endl;
		if(ch == s[1]){
			cout << "No";
			return 0;
		}
		if(s[i] == s[i-1]){
			//cout << s[i] << endl;
			//cout << s[i-1] << endl;
			if(n == 2){
				cout << "No";
				return 0;
			} else if(s[i] == s[i+1]){
				cout << "No";
				return 0;
			} else if(s[i] == '1'){
				cout << "No";
				return 0;
			}
		} else if(s[i] == s[i+1]){
			if(s[i] == '1'){
				cout << "No";
				return 0;
			} else if(i == n - 2){
				cout << "No";
				return 0;
			}
		}
	}
	cout << "Yes";
	return 0;
}