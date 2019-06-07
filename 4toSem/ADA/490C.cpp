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

int tamNum(ll n){
	int i = 1;
	while(n > 0){
		n /= 10;
		i++;
	}
	return i;
}

ll fastPow(ll a, ll b) {
    ll ret=1;
    while(b>0) {
        if(b&1) ret=ret*a;
        a=a*a;
        b>>=1;
    }
    return ret;
}

ll modular_pow(ll base, ll exponent, ll modulus){
	if(modulus == 1) return 0;
	ll c = 1;
	for(int i = 0; i < exponent; i++){
		c = (c * base) % modulus;
	}
	return c;
}

int main() {
	ios_base::sync_with_stdio(0);cin.tie(0);
	string s;
	int j = 0;
	ll a, b;
	cin >> s;
	cin >> a >> b;
	int *rema, *remb;
	rema = new int[10000000];
	remb = new int[10000000];
	rema[0] = 0;
	for(int i = 1; i < s.size() + 1; i++){
		rema[i] = (rema[i - 1]*10 + (s[i-1] - '0')) % a;
		//cout << "rema [" << i << "] = " << rema[i] << endl;
	}
	//return 0;
	/*p = 1;
	cout << p << endl;
	remb[s.size() - tamNum(b) + 1] = stoi(s.substr(s.size() - tamNum(b) + 1,tamNum(b))) % b;
	cout << "remb[s.size() - tamNum(b) + 1] = " << remb[s.size() - tamNum(b) + 1] << endl;
	cout << "s.size() - tamNum(b) + 1 = " << s.size() - tamNum(b) + 1 << endl;
	for(int i = 0; i < tamNum(b); i++){
		p = (p*10) % b;
	}		
	for(int i = s.size() - tamNum(b) + 1; i >= tamNum(a); i--){
		p = (p*10) % b;
		remb[i - 1] = ((s[i - 1]-'0')*p+ remb[i]) % b ;
		cout << "remb[" << i - 1 << "] = " << ((s[i - 1]-'0')*p + remb[i]) % b << endl;
	}*/
	remb[s.size()+1]=0;
    int p = 1;
    for(int i = s.size(); i >= 1; i--){
        remb[i]=(remb[i+1]+p*(s[i-1]-'0'))%b;
        p=(p*10)%b;
    }
	for(int i = 1; i < s.size(); i++){
		//cout << "rema[" << i << "] = " << rema[i] << endl;
		//cout << "remb[" << i + 1 << "] = " << remb[i + 1] << endl;
		if(s[i] != '0'){
			if(rema[i] == 0 && remb[i+1] == 0){
				cout << "YES" << endl;
				for(j = 0; j < i; j++){
					cout << s[j];
				}
				cout << endl;
				for(j = i; j < s.size(); j++){
					cout << s[j];
				}
				delete [] rema;
				delete [] remb;
				return 0;
			}
		} else{
			continue;
		}
	}
	delete [] rema;
	delete [] remb;
	cout << "NO";
	return 0;	
}