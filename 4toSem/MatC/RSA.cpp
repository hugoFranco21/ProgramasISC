/*
Hugo David Franco Avila A01654856
Daniel Elias Becerra A01208905
Manuel Yafté Gallegos López A01702980
*/

#include <bits/stdc++.h>

typedef long long ll;

using namespace std;

/* Seguimos el algoritmo de la presentacion pero no funcionaba correctamente, por lo que modificamos
algunas lineas*/
ll modExp(ll a, ll b, ll n){
    int c = 0, d = 1;
    while(b > 0){
        c *= 2; // la c no hace nada?
        //d = (d*d) % n; esta linea creemos que es incorrecta porque altera directamente el resultado final
        if(b & 1 == 1){
            c++;
            d = (d*a) % n;
        }
        //cout << "d = " << d << endl;
        b >>= 1;
        a = (a * a) % n;//esta linea es para que en cada iteracion se incremente la base, que nunca tendra un valor mayor a n
    }
    return d;
}

vector<ll> SieveOfEratosthenes(ll n, ll s) { 
	vector<ll> v;
    bool prime[n+1]; 
    memset(prime, true, sizeof(prime)); 
    for (ll p=2; p*p<=n; p++){ 
        if (prime[p] == true){ 
            for (int i=p*2; i<=n; i += p) 
                prime[i] = false; 
        } 
    } 
    for (ll p=s+1; p<=n; p++){
        if (prime[p]){ 
			v.push_back(p);
		}
	}
	return v;
} 

ll RSA(pair<ll, ll> &p, ll num){
    return modExp(num, p.first, p.second);
}

int main(){
    pair<ll,ll> P, S;
    ll p, q, num, n, phi, e, d, par, cifrado, ed;
    cin >> p >> q >> num;
    bool flag = false;
    n = p*q;
    par = p > q ? q : p;
    vector<ll> v =  SieveOfEratosthenes(n, par);
    phi = (p - 1)*(q - 1);
    for(int i = 0; i < v.size(); i++){
        e = v[i];
        for(int j = 1; j <= phi; j++){
            d = j;
            //cout << "e = " << e << endl;
            //cout << "d = " << d << endl;
            ed = e * d;
            //cout << "e * d = " << ed << endl;
            if(ed % phi == 1){
                flag = true;
                break;
            }
        }
        if(flag) break;
    }
    P = make_pair(e,n);
    S = make_pair(d,n);
    cifrado = RSA(P, num);
    //cout << p << endl;
    //cout << q << endl;
    //cout << num << endl;
    //cout << n << endl;
    //cout << e << endl;
    //cout << d << endl;
    //cout << phi << endl;
    //cout << cifrado << endl;
    cout << RSA(S, cifrado) << endl;
	return 0;
}
