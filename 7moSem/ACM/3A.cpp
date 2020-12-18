#include<bits/stdc++.h>

typedef long long int ll;

using namespace std;

ll getpairs(ll s, ll x);

int main(){
	ll s, x;
	cin >> s >> x;
	cout << getpairs(s,x) << endl;
	return 0;
}

ll getpairs(ll s, ll x){
	ll acum = 0;
	ll m;
	for(ll i = 1; i <= s / 2; i++){
		//cout << i << " + " << s - i << endl;
		m = i ^ (s - i);
		//cout << m << endl;
		if(m == x){
			if(i == s - i) {
				acum++;
			} else {
				//cout << "NOW" << endl;
				acum += 2;
			}
		}
	}
	return acum;
}
