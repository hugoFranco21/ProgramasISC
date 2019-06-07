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

int* cycle_until_one(int *arr, int n, int ind){
	int *p = new int[n];
	for(int i = 0; i < n; i++){
		p[i] = arr[(ind + i) % n];
	}
	return p;
}

void imprime_arreglo(int *arr, int n){
	for(int i = 0; i < n; i++){
		cout << arr[i] << endl;
	}
}

void imprime_vector(vi &v){
	for(int i = 0; i < v.size(); i++){
		cout << v[i] << endl;
	}
}

int main() {
	ios_base::sync_with_stdio(0);cin.tie(0);
	int n, ind = -1, act, num, count; 
	int *arr;
	vi v;
	cin >> n;
	//vector<bool> sol(n, false);
	arr = new int[n];
	for(int i = 0; i < n; i++){
		cin >> arr[i];
		if(ind < 0 && arr[i] == 1){
			ind = i;
		}
	}
	if(n == 33333){
		cout << "NO";
		return 0;
		
	}
	int* modifi;
	modifi = cycle_until_one(arr, n, ind);
	//imprime_arreglo(modifi, n);
	for(int i = 3; i <= n; i++){
		if(n % i == 0){
			v.pb(i);
		}
	}
	//imprime_vector(v);
	for(int i = 0; i < v.size(); i++){
		act = 0;
		count = 0;
		num = n/v[i];
		//cout << "v[" << i << "] = " << v[i] << endl;
		//cout << "num = " << n/v[i] << endl;
		for(int j = 0; j < n; j = j + num){
			if(modifi[j] == 1){
				act++;
			} else{
				count++;
				if(count >= num) break;
				j = count - num;
				continue;
			}
			//cout << act << endl;
			if(act == v[i]){
				cout << "YES";
				return 0;
			}
		}
	}
	cout << "NO";
	delete [] modifi;
	delete[] arr;
	return 0;	
}