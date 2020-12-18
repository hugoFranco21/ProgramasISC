#include<bits/stdc++.h>

typedef long long int ll;

using namespace std;

ll choose(int n, int k);
ll getmin(int n, int m);
ll getmax(int n, int m);

int main(){
	int n, m;
	cin >> n >> m;
	cout << getmin(n,m) << " " << getmax(n,m) << endl;
	return 0;
}

long long int choose(int n, int k){
	if(n < k) return 0;
	if(n == k) return 1;
	long long int acum = 1;
	int i = n - k + 1;
	for(i; i <= n; i++){
		acum *= i;
	}
	return acum / k;
}

long long int getmin(int n, int m){
	if(n % m){
		return (m-(n%m))*(choose((n/m),2)) + (n%m)*(choose((n /m) + 1,2));
	} else {
		
		return m * (choose((n / m),2));
	}
}

long long int getmax(int n, int m){
	return choose((n - (m - 1)),2);
}