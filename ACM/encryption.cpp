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
#define MAX 1000

using namespace std;

typedef long long ll;
typedef pair<int, int> ii;
typedef vector<int> vi;
typedef vector<ii> vii;
typedef vector<vi> vvi;

int main(){
	int n, i = 0, mod, j = 0;
	ll s, ap;
	char c, h;
	string::iterator it;
	//cin >> n >> s >> lose;
	scanf("%i %lld%*c", &n, &s);
	mod = s%26;
	cout << mod << endl;
	string texto[n];
	for(i = 0;i < n;i++){
		getline(cin, texto[i]);
		texto[i] = texto[i] + '\n';
	}
	for(i = 0; i < n; i++){
		for(it = texto[i].begin(); it != texto[i].end(); it++){
			j = mod;
			if(*it > 96 && *it < 123){
				c = *it;
				while(j > 0){
					j--;
					c--;
					if(c < 97) c = 122;
					
				}
				//ap = 'a' + mod;
				cout << c;
			} else if(*it > 64 && *it < 91){
				c = *it;
				while(j > 0){
					j--;
					c--;
					if(c < 64) c = 90;
					
				}
				cout << c;
			} else{
				cout << *it;
			}
		}
	}
	return 0;
}



