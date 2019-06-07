#include <bits/stdc++.h>

#define INF 1000000007
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
	int x, y, n, ans, i = 1;;
	cin >> x >> y;
	cin >> n;
	switch(n % 6){
		case 1:
			ans = x;
		break;
		
		case 2:
			ans = y; 
		break;
		
		case 3:
			ans = y - x;
		break;
		
		case 4:
			ans = -x;
		break;
		
		case 5:
			ans = -y;
		break;
		
		case 0:
			ans = x - y;
		break;
		
	}
	if(ans >= 0){
		ans = ans % INF;
	} else{
		while(i*INF < abs(ans)){
			i++;
		}
		ans = i*INF - abs(ans);
	}
	cout << ans;
	return 0;
}