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

void print_tree(int n, int d, int h){
	int i = 0, j = 0, distance = 0, height = 0;
	while(height < h){
		cout << i + 1 << ' ' << i + 2 << endl;
		i++;
		distance++;
		height++;
		//if((distance == (d - 1)) && (h != d)) break;
	}
	i++;
	while(distance < d){
		if(j == 0){
			cout << j + 1 << ' ' << i + 1 << endl;
		} else{
			cout << i << ' ' << i + 1 << endl;
		}
		i++; j++; distance++;
	}
	//i++;
	while(i < n){
		if(height == distance){
			cout << 2 << ' ' << i + 1 << endl;
			i++;
		} else{
			cout << 1 << ' ' << i + 1 << endl;
			i++;
		}
	}
	
}

int main() {
	int n, d, h;
	cin >> n >> d >> h;
	if((d > 2*h) || (d < h)){
		cout << -1;
	} else if(d == 1 && n >2){
		cout << -1;
	} else{
		print_tree(n,d,h);
	}
	return 0;
}