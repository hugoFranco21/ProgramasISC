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

int maximo(int *n, int size){
	int maxi = -9999;
	for(int i = 0; i < size; i++){
		if(n[i] > maxi) maxi = n[i];
	}
	return maxi;
}

int calif(vi &v){
	int *LIS = new int[v.size()];
	int ind;
	int maxi;
	LIS[0] = 0;
	LIS[1] = 1;
	for(int i = 2; i < v.size(); i++){
		if(v[i] > v[i - 1]){
			//cout << "v[" << i << "] = " << v[i] << endl;
			//cout << "v[" << i << "] = " << v[i - 1] << endl;
			LIS[i] = LIS[i - 1] + 1;
		} else{
			ind = i - 2;
			while(v[i] < v[ind] && ind > 0){
				ind--;
			}
			LIS[i] = LIS[ind] + 1;
		}
		//cout << "LIS[" << i << "] = " << LIS[i] << endl;
	}
	maxi = maximo(LIS, v.size());
	delete [] LIS;
	return maxi;
}

int main() {
	ios_base::sync_with_stdio(0);cin.tie(0);
	queue<int> q;
	bool vec = false;
	vi v;
	int n, aux;
	char c;
	string s, p;
	while(getline(cin, s)){
		//cout << "S = " << s << endl;
		if(s.size() <= 2){
			//nothing
		} else{
			//cout << "s.size = " << s.size() << endl;
			v.pb(0);
			for(int i = 0; i < s.size(); i++){
				if(s[i] != 32 && i != s.size() - 1){
					p += s[i];
				} else {
					if(i == s.size() - 1) p += s[i];
					aux = stoi(p);
					//cout << "aux = " << aux << endl;
					p.clear();
					v.pb(aux);
					
				}
			}
			q.push(calif(v));
			v.clear();
			//break;
		}
	}
	while(!q.empty()){
		cout << q.front() << endl;
		q.pop();
	}
	return 0;	
}