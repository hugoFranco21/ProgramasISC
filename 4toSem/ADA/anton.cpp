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

void imprime(vii &v){
	for(int i = 0; i < v.size(); i++){
		cout << v[i].first << endl;
		cout << v[i].second << endl;
		cout << "numero = " << v[i].first*pow(10,v[i].second) << endl;
	}
}

int max(int n, vii &v, int ch){
	//cout << n << endl;
	//cout << ch << endl;
	int mul;
	for(int i = v.size() - 1; i >= 0; i--){
		//mul = v[i].first*pow(10,v[i].second);
		if(ch > v[i].first){
			n -= ch;
			n -= v[i].first*pow(10,v[i].second);
			n += v[i].first;		
			n += ch*pow(10, v[i].second);
			
			break;
		} else if(i == 0){
			n -= ch;
			//cout << n << endl;
			n -= (v[i].first)*pow(10,v[i].second);
			//cout << n << endl;
			n += v[i].first;
			//cout << n << endl;
			n += ch*pow(10, v[i].second);
			//cout << v[i].first*pow(10,v[i].second) << endl;
			//cout << n << endl;
			
			//cout << n << endl;
			
		}
	}
	return n;
}

int main() {
	ios_base::sync_with_stdio(0);cin.tie(0);
	int ind = -1, a, ul;
	string s;
	char aux;
	cin >> s;
	ul = s[s.size() - 1] - '0';
	for(int i = 0; i < s.size(); i++){
		a = s[i] - '0';
		//cout << a << endl;
		if(a % 2 == 0) ind = i;
		if((a % 2 == 0) && (a < ul)){
			aux = s[i];
			s[i] = s[s.size() - 1];
			s[s.size() - 1] = aux;
			cout << s;
			return 0;
		} else if(i == s.size() - 1 && ind != -1){
			aux = s[ind];
			s[ind] = s[s.size() - 1];
			s[s.size() - 1] = aux;
			cout << s;
			return 0;
		}
	}
	cout << -1;
	return 0;
}