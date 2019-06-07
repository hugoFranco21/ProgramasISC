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
	int n, k, aux1, aux2, mult, max, act, sum, nmul, count = 0, min;
	set<int> ind;
	set<int>::iterator it;
	cin >> n >> k;
	vii v(n), mand(k);
	for(int i = 0; i < n; i++){
		cin >> aux1 >> aux2;
		v[i].first = aux2;
		v[i].second = aux1;
	}
	sort(v.begin(),v.end());
	act = v[n -1].first*v[n-1].second;
	mult = v[n-1].first;
	sum = v[n-1].second;
	ind.insert(n-1);
	//cout << act << endl;
	count++;
	for(int i = n - 2; i >= 0; i--){
		if((sum + v[i].second)*v[i].first > act){
			if(count < k){
				ind = i
				sum+=v[i].second;
				mult=v[i].first;
				
				//cout << act << endl;
				count++;
			} else{
				min = 9999999;
				for(it = ind.begin(); it != ind.end(); it++){
					if(*it < min && *it < v[i].second){
						min = *it;
					}
				}
				sum-=min;
				sum+=v[i].second;
			}
		}
		act = sum*mult;
	}
	cout << act;
	return 0;
}