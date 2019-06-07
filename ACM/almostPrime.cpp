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

vi SieveOfEratosthenes(int n) { 
	vi v;
    bool prime[n+1]; 
    memset(prime, true, sizeof(prime)); 
    for (int p=2; p*p<=n; p++){ 
        if (prime[p] == true){ 
            for (int i=p*2; i<=n; i += p) 
                prime[i] = false; 
        } 
    } 
    for (int p=2; p<=n; p++){
        if (prime[p]){ 
			v.pb(p);
		}
	}
	return v;
} 

void imprime_vector(vector<int> &r){
	for(int i = 0; i < r.size(); i++){
		cout << r[i] << endl;
	}
}

int main() {
	int n, i, count;
	vi z,k;
	cin >> n;
	z = SieveOfEratosthenes(n);
	//imprime_vector(z);
	for(i = 6; i <= n;i++){
		count = 0;
		for(int j = 0; j < z.size(); j++){
			if(i % z[j] == 0){
				count++;
			}
		}
		if(count == 2) k.pb(i);
	}
	cout << k.size();
	return 0;
}







