#include <bits/stdc++.h>

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
	int n, m, k, size, i, j, count = 0, res;
	bool regr = false, nuevo = false;
	cin >> n >> m >> k;
	res = n*m - 2*(k-1);
	if(n == k){
		for(i = 1; i <= n; i++){
			cout << m;
			for(int j = 1; j <= m; j++){
				cout << " " <<  i << " " << j;
			}
			cout << endl;
		}
	} else if(m == k){
		for(i = 1; i <= m; i++){
			cout << n;
			for(j = 1; j <= n; j++){
				cout << " " <<  j << " " << i;
			}
			cout << endl;
		}
	} else{
		i = 1; j = 1;
		while(k > 1){
			count = 0;
			cout << 2;
			while(count < 2){
				if(j <= m && !regr){
					cout << " " << i << " " << j;
					j++;
				} else if(regr && j >=1){
					cout << " " << i << " " << j;
					j--;
				}
				if(j == m + 1){
					regr = true;
					i++;
					j--;
				}
				if(j == 0){
					j++;
					i++;
					regr = false;
				}
				count++;
			}
			cout << endl;
			k--;
		}
		count = 0;
		//if(m % 2 == 0){
			cout << res;
			while(count < res){
				if(j <= m && !regr){
					cout << " " << i << " " << j;
					j++;
				} else if(regr && j >=1){
					cout << " " << i << " " << j;
					j--;
				}
				if(j == m + 1){
					regr = true;
					i++;
					j--;
				}
				if(j == 0){
					j++;
					i++;
					regr = false;
				}
				count++;
			}
		//} else{
			
		//}
	}
	return 0;
}