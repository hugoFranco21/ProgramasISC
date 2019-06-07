/*Hugo David Franco Avila*/
#include <iostream>
#include <bits/stdc++.h>
#define MODUL 1000000009

using namespace std;

long long fastPow(long long a, long long b){
	long long ret=1;
	while(b>0){
		if(b&1) ret = ret*a%MODUL;
		a = a*a%MODUL;
		b>>=1;
	}
	return ret;
}

int main(){
	long long n, a, b, k, ans = 0, signo;
	int x;
	string s;
	cin >> n >> a >> b >> k;
	cin >> s;
	x = s.size();
	for(int i = 0;i < x; ++i){
        if(s[i]=='+'){
            signo = 1;
        }else{
            signo = -1;
        }
        ans = ((ans + signo*fastPow(a, n-i) * fastPow(b, i) )% MODUL + MODUL) % MODUL;
	}
	long long ch = fastPow(b, k) * fastPow(a, k * (MODUL - 2)) % MODUL;
	if(ch == 1){
        ans = ans * ((n + 1) / k) % MODUL;
	}else{
        ans = ans * (fastPow(ch, (n + 1)/k) - 1)%MODUL * fastPow(ch - 1,MODUL - 2)%MODUL;
	}
	cout << ans;
	return 0;
}