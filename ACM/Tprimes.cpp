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
#define MAX 1e12
using namespace std;

typedef long long ll;
typedef pair<int, int> ii;
typedef vector<int> vi;
typedef vector<ii> vii;
typedef vector<vi> vvi;

set<ll> tprimos;
set<ll>:: iterator it;

set<ll> SieveOfEratosthenes(int n) { 
	set<ll> s;
    bool prime[n+1]; 
    memset(prime, true, sizeof(prime)); 
    for (ll p=2; p*p<=n; p++){ 
        if (prime[p] == true){ 
            for (ll i=p*2; i<=n; i += p) 
                prime[i] = false; 
        } 
    } 
    for (ll p=2; p<=n; p++){
        if (prime[p]){ 
			s.insert(p*p);
		}
	}
	return s;
} 

void imprime_vector(vector<double> &r){
	for(int i = 0; i < r.size(); i++){
		cout << r[i] << endl;
	}
}

void imprime_vector1(vi &r){
	for(int i = 0; i < r.size(); i++){
		cout << r[i] << endl;
	}
}

int main() {
	//int n, i, count;
	int n, ax;
	ll aux;
	vi z;
	cin >> n;
	//vector <double> q(n);
	vector<long long> q(n);
	tprimos = SieveOfEratosthenes(1e6);
	for(int i = 0; i < n; i++){
		cin >> aux;
		//aux = fmod(aux,MAX);
		//aux = sqrt(aux);
		q[i] = aux;
	}
	//cout << q.size() << endl;
	//imprime_vector(q);
	/*for(it = primos.begin(); it != primos.end(); it++){
		cout << *it << endl;
	}*/
	for(int i = 0; i < n;i++){
		if(tprimos.find(q[i]) != tprimos.end()){
			//cout << *it << endl;
			cout << "YES" <<endl;
		} else{
			//cout << *it << endl;
			cout << "NO" << endl;
		}
	}
	
	return 0;
}