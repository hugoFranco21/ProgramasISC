#include <bits/stdc++.h>

const long long mod=1e9+9;

using namespace std;

string s;

long long fastPow(long long a, long long b){
	long long ret=1;
	while(b>0){
		if(b&1) ret = ret*a%mod;
		a = a*a%mod;
		b>>=1;
	}
	return ret;
}

int main(){
	long long n, a, b, k, res=0;
	int sz;
	cin >>n>>a>>b>>k;
	cin >>s;
	sz=s.size();
	for(int i=0;i<sz;++i){
        int sign;
        if(s[i]=='+'){
            sign = 1;
        }else{
            sign = -1;
        }
        res= ((res+sign*fastPow(a, n-i) * fastPow(b, i) )% mod + mod) % mod;
	}
	long long t = fastPow(b, k) * fastPow(a, k * (mod - 2)) % mod;
	if(t == 1){
        res = res * ((n + 1) / k) % mod;
	}else{
        res = res * (fastPow(t, (n+1)/k)-1)%mod * fastPow(t-1,mod-2)%mod;
	}
	cout<<res<<endl;
	return 0;
}
