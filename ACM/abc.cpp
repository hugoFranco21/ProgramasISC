/*Hugo David Franco Avila*/
#include <algorithm>
#include <bitset>
#include <cmath>
#include <cstdio>
#include <cstring>
#include <deque>
#include <functional>
#include <iomanip>
#include <iostream>
#include <queue>
#include <map>
#include <numeric>
#include <set>
#include <sstream>
#include <stack>
#include <utility>
#include <vector>

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

ll fastPow(ll a, ll b) {
    ll ret=1;
    while(b>0) {
        if(b&1) ret=ret*a;
        a=a*a;
        b>>=1;
    }
    return ret;
}

ll gcd(ll a, ll b);

class Rat{
	public:
		ll num;
		ll den;
		
		Rat(){
			num = 0;
			den = 1;
		}
		
		Rat(ll numer, ll denom){
			num = numer;
			den = denom;
		}
		
		ll getNumerator(){
			return num;
		}
		
		ll getDenominator(){
			return den;
		}
		
		void printRat(){
			cout << num << "/" << den << endl;
			//return num/den;
		}
		
		void operator=(Rat right){
			num = right.num;
			den = right.den;
		}
		
		/*void operator+(const Rat &right){
			int n, d;
			n = right.den*num + right.num*den;
			d = den*right.den;
			
		}*/
};

Rat operator+ (Rat &left, Rat &right) {
	ll num, den;

	num = (left.getNumerator() * right.getDenominator()) + (left.getDenominator() * right.getNumerator());
	den = left.getDenominator() * right.getDenominator();
	ll d = gcd(num, den);
	num = num/d;
	den = den/d;
	return Rat(num, den);
}

ll gcd(ll a, ll b) {
    if(b) return gcd(b, a%b);
    return a;
}

int lcm(int a, int b){
	int temp = gcd(a,b);
	return temp ? (a/temp*b) : 0;
}

Rat convierteS(string s){
	//Rat r;
	int i = 0, j = 1, jj;
	ll num = 0, den = 0, aux, aux1;
	while(s[i] != '/'){
		i++; j++;
	}
	jj = 0;
	i--;
	while(i >= 0){
		aux = s[i] - 48;
		aux1 = aux*fastPow(10,jj);
		num += aux1;
		jj++;
		i--;
	}
	//cout << "numerador " << num << endl;
	i = 0;
	j = s.size() - 1;
	while(s[j] != '/'){
		aux = s[j] - 48;
		aux1 = aux*fastPow(10,i);
		den += aux1;
		i++;
		j--;
	}
	//cout << "denominador " << den << endl;
	Rat r(num, den);
	return r;
}

int main(){
	string a, b, c;
	int n, ap, i = 0;
	cin >> n;
	//ap = n*3;
	//Rat r[n*3];
	Rat r[n][3];
	Rat out;
	//cin >> a;
	//r = convierteS(a);
	//cout << r.printRat();
	while(i < n){
		cin >> a >> b >> c;
		r[i][0] = convierteS(a);
		r[i][1] = convierteS(b);
		r[i][2] = convierteS(c);
		i++;
	}
	i = 0;
	while(i < n){
		out = r[i][0] + r[i][1];
		out = out + r[i][2];
		out.printRat();
		i++;
	}
	return 0;
	//cin >> a >> b >> c;
	
	
	/*cout << a << endl;
	cout << b << endl;
	cout << c << endl;*/
	
	
	
}












