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
#include <string>
#include <stack>
#include <utility>
#include <vector>

#define INF 1000000000
#define FOR(i, a, b) for(int i=int(a); i<int(b); i++)
#define FORC(cont, it) for(decltype((cont).begin()) it = (cont).begin(); it != (cont).end(); it++)
#define pb push_back

using namespace std;


int main() {
	ios_base::sync_with_stdio(0);cin.tie(0);
	int n, i, len1, len2, ind;
	string num1, num2, res;
	bool carry = false;
	stack<char> s;
	cin >> n;
	vector<pair<int,string>> v(n);
	for(int i = 0; i < n; i++){
		ind = 0;
		res = "";
		cin >> num1 >> num2;
		len1 = num1.size() - 1;
		len2 = num2.size() - 1;
		while(len1 >= 0 && len2 >= 0){
			if(num1[len1] == num2[len2]){
				if(carry){
					res += '1';
				} else{					
					res += '0';
				}
				carry = num1[len1] == '0' ? false : true;
				//cout << "iguales, res actual = " << res << " " << "carry actual " << carry << endl;
			} else{
				if(carry){
					res += '0';
					if(num1[len1] == '1' || num2[len2] == '1'){
						carry = true;
					} else{
						carry = false;
					}
				} else{
					res += '1';
					carry = false;
				}
				//cout << "diferentes, res actual = " << res << " " << "carry actual " << carry << endl;
			}
			len1--;len2--;
		}
		if(len1 >= 0){
			while(len1 >= 0){
				if(carry){
					if(num1[len1] == '1'){
						res += '0';
						carry = 1;
					} else{
						res += '1';
						carry = 0;
					}
				} else{
					res += num1[len1];
				}
				//cout << "len 1 = " << res << " " << "carry actual " << carry << endl;
				len1--;
			}
		} else{
			while(len2 >= 0){
				if(carry){
					if(num2[len2] == '1'){
						res += '0';
						carry = 1;
					} else{
						res += '1';
						carry = 0;
					}
				} else{
					res += num2[len2];
				}
				//cout << "len 2 = " << res << " " << "carry actual " << carry << endl;
				len2--;
			}
		}
		if(carry) res += '1';
		reverse(res.begin(), res.end());
		for(int k = 0; k < res.size(); k++){
			//cout << "res[" << k << "] = " << res[k] << endl;
			if(res[k] == '0' && k < res.size() - 1){
				ind++;
			} else{
				//cout << "va a salir " << endl;
				break;
			}
		}
		//cout << "ind " << ind << endl;
		res = res.substr(ind, res.size());
		v[i] = make_pair(i+1, res);
	}
	for(i = 0; i < n; i++){
		cout << v[i].first << " " << v[i].second << endl;
	}
	
	return 0;
}