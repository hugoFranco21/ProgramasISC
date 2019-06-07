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

int subBear(string s){
	int count = 0, dec;
	vi prevIndex;
	string b;
	/*queue<char> c(s.size());
	for(int i = 0; i < s.size(); i++){
		c.push(s[i]);
	}*/
	//cout << s.size() << endl;
	for(int i = 0; i < s.size() - 3; i++){
		if(s[i] == 'b'){
			b = s.substr(i,4);
			//cout << b << endl;
			if(b == "bear"){
				prevIndex.pb(s[i]);
				if(i > 0){
					count += i;
					count -= prevIndex.size();
					if((i+4) < s.size()){
						count += i*(s.size()-(i+4));
						//count -= prevIndex.size();
					}
				}
				count++;
				dec = i + 4;
				count += s.size() - dec;
				//cout << count << endl;
				b.clear();
			}
		} else{
			continue;
		}
		
		
	}
	return count;
}

int main() {
	ios_base::sync_with_stdio(0);cin.tie(0);
	string s;
	cin >> s;
	cout << subBear(s);
	return 0;
}