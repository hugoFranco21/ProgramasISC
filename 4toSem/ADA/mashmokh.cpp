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
	int i = 0;
	int n, a, b, aux, aux2, aux3, aux4;
	cin >> n >> a >> b;
	vector<int> v(n);
	while(n > 0){
		cin >> aux;
		v[i] = aux;
		i++;
		n--;		
	}
	/*for(i = 0; i < v.size(); i++){
		cout <<  << " ";
	}*/
	aux = v[i]%b;
	aux2 = v[i]/b;
	aux3 = aux2*a;
	aux4 = 
	cout << v[i] - aux;
	return 0;
}