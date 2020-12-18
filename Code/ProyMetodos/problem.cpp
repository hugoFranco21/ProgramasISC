/* check palindrome*/

#include "bits/stdc++.h"

using namespace std;


string sanitize(string s){
	string k = "";
	for(int i = 0; i < s.length(); i++){
		if(s[i] != 32){
			k += s[i];
		}
	}
	return k;
}

int countDigits(int number, int digit){
	int count = 0;
	// 3253
	while(number){
		if(number % 10 == digit){
			count++;
		}
		number /= 10;
	}
	return count;
}

vector<int> SoE(int n){
	vector<bool> v(n + 1, true);
	int c = 2;
	for(c = 2; c <= n; c++){
		if(v[c]){
			for(int i = c; i <= n; i++){
				//cout << "c = " << c << endl;
				//cout << "i = " << i << endl;
				if(i % c == 0 && i != c){
					// cout << i <<" is not prime " << endl;
					v[i] = false;
				}
			}
		} else {
			continue;
		}
	}
	vector<int> prime;
	for(int i = 2; i < n; i++){
		if(v[i]){
			prime.push_back(i);
		}
	}
	return prime;
}

void print(vector<int> &v){
	for(int i = 0; i < v.size(); i++){
		cout << v[i] << endl;
	}
}

int main(){
	/*string s;
	bool flag = true;
	getline(cin, s);
	int left, right;
	left = 0; 
	
	s = sanitize(s);
	right = s.length() - 1;
	cout << "s = " << s << endl;
	while(left <= right){
		if(s[left] == s[right]){
			left++;
			right--;
		} else {
			cout << s[left] << " != " <<  s[right] << endl;
			flag = false;
			break;
		}
	}
	if(flag){
		cout << "YES";
	} else{
		cout << "NO";
	}*/
	/*int n, digit;
	cin >> n >> digit;
	cout << countDigits(n, digit);*/
	int n;
	vector<int> v;
	cin >> n;
	v = SoE(n);
	print(v);
	return 0;
}