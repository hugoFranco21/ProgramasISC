#include <bits/stdc++.h>

using namespace std;

int div(string s){
	int aux1, aux2, aux3;
	for(int i = 0; i < s.size(); i++){
		aux1 = s[i] - 48;
		if(aux1 == 0){
			return aux1;
		} else if(aux1 == 8){
			return aux1;
		} else if(s.size() == 1){
			return -1;
		}
	}
	for(int i = 0; i < s.size() - 1; i++){
		aux1 = s[i] - 48;
		for(int j = i+1; j < s.size(); j++){
			aux2 = s[j] - 48;
			if((aux1*10 + aux2) % 8 == 0) return aux1*10 + aux2;
		}
	}
	for(int i = 0; i < s.size() - 2; i++){
		aux1 = s[i] - 48;
		for(int j = i+1; j < s.size() - 1; j++){
			aux2 = s[j] - 48;
			for(int k = j+1; k < s.size(); k++){
				aux3 = s[k] - 48;
				if((aux1*100 + aux2*10 + aux3) % 8 == 0) return aux1*100 + aux2*10 + aux3;
			}
		}
	}
	return -1;
}

int main(){
	string num;
	cin >> num;
	if(div(num) < 0){
		cout << "NO";
	} else{
		cout << "YES" << endl;
		cout << div(num);
	}
	return 0;
}