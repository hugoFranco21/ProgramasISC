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
	vi v(6);
	int aux, mitad, suma, res, right, left, mid;
	for(int i = 0; i < 6; i++){
		cin >> aux;
		v[i] = aux;
	}
	sort(v.begin(), v.end());
	suma = accumulate(v.begin(), v.end(), 0);
	if(suma % 2 != 0){
		cout << "NO";
		return 0;
	}
	mitad = suma/2;
	//cout << "mitad " << mitad << endl;
	right = 5;
	left = 0;
	mid = 1;
	while(left != 3){
		res = v[left] + v[right];
		if(res + v[mid] == mitad){
			cout << "YES";
			return 0;
		} else if(res + v[mid] > mitad){
			cout << "NO";
			return 0;
		} else{
			for(int i = mid; i < 5; i++){
				if(res + v[i] == mitad){
					cout << "YES";
					return 0;
				} else if(res + v[i] > mitad){
					break;
				}
			}
		}
		left++;
		mid++;
	}
	cout << "NO";
	return 0;
}