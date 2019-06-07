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

int costo(string R){
	int u = 0, r = 0, count = 0;//, prevU = 0, prevR = 0;
	bool izq, prev;
	if(R[0] == 'U'){
		u++;
		izq = true;
	} else{
		r++;
		izq = false;
	}
	for(int i = 1; i < R.size(); i++){
		prev = izq;
		//cout << "PREV " << prev << endl;
		if(R[i] == 'U'){
			u++;
		} else{
			r++;
		}
		//cout << u << " " << r << endl;
		if(u > r){
			izq = true;
			//cout << "verdadero\n";
		} else if(r > u){
			izq = false;
			//cout << "falso\n";
		} else{
			if(izq){
				izq = true;
			} else{
				izq = false;
			}
			
		}
		if(prev != izq) count++;
		//prevU = u; prevR = r;
		//cout << u << " " << r << endl;
		//if(prevU == prevR) 
	}
	return count;
}

int main() {
	int n;
	string R;
	cin >> n >> R;
	//cout << R << endl;
	cout << costo(R);
	return 0;
}