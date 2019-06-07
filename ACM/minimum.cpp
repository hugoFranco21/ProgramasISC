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
#define MAX 10000

using namespace std;

typedef long long ll;
typedef pair<int, int> ii;
typedef vector<int> vi;
typedef vector<ii> vii;
typedef vector<vi> vvi;

int gcd(int a, int b) {
    if(b) return gcd(b, a%b);
    return a;
}

int fastPow(int a, int b) {
    int ret=1;
    while(b>0) {
        if(b&1) ret=ret*a;
        a=a*a;
        b>>=1;
    }
    return ret;
}

int dobaFrac(int d){
	int num, den;
	num = d;
	den = 10000;
	int gc = gcd(num,den);
	num = num/gc;
	den = num/gc;
	return den;
	
}

int stringtoNum(string s){
	int i = 0, j = 1, jj, aux, aux1;
	//ll num = 0, den = 0, aux, aux1;
	while(s[i] != '.'){
		i++; j++;
	}
	i = 3;
	while(j < s.size()){
		aux = s[j] - 48;
		aux1 = aux*fastPow(10,i)
		i--;
	}
	
}

int main(){
	
	int n, i = 0;
	string aux;
	cin >> n;
	string s[n];
	vector<int> v(n);
	for(i = 0; i < n; i++){
		cin >> aux;
		//aux *= 10000;
		s[i] = aux;
	}
	for(i = 0; i < n; i++){
		cout << dobaFrac(v[i]) << endl;
	}
	return 0;
}





