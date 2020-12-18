#include<bits/stdc++.h>

#define MOD 1000000007

typedef long long int ll;

using namespace std;

int main(){
	ll rgb[3];
	cin >> rgb[0] >> rgb[1] >> rgb[2];
	sort(rgb, rgb + 3);
	if(rgb[0]+rgb[1] < rgb[2]/2){
		cout << rgb[0] + rgb[1];
	} else{
		cout << rgb[0]/3 + rgb[1]/3 + rgb[2]/3 + (rgb[0]%3 + rgb[1]%3+rgb[2]%3)/3;
	}
	return 0;
}