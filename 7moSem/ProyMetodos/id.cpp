#include "bits/stdc++.h"
using namespace std;

int extract_min(string s){
    string k = "";
    bool flag = true;
    for(int i = 0; i < s.length(); i++){
        if(flag){
            if(s[i] != '-'){
                k += s[i];
            } else {
                flag = false;
            }
        }
    }
    return stoi(k);
}

int extract_max(string s){
    string k = "";
    bool flag = false;
    for(int i = 0; i < s.length(); i++){
        if(s[i] == '-'){
            flag = true;
            continue;
        }
        if(flag){
            k += s[i];
        }
    }
    return stoi(k);
}

char get_key(string s){
    return s[0];
}

bool check(int mini, int maxi, char key, string s){
    if(s.length() >= maxi){
		if(s[mini - 1] != s[maxi - 1]){
			if(s[mini - 1] == key || s[maxi - 1] == key){
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	} else {
		return false;
	}
}

int main(int argc, char* argv[]) {
	string s1, s2, s3;
	ifstream in(argv[1]);
	int n = 1000;
	int count = 0;
	while(n--){
	    in >> s1 >> s2 >> s3;
	    //cout << "min = " << extract_min(s1) << endl;
	    //cout << "max = " << extract_max(s1) << endl;
	    //cout << "key = " << get_key(s2) << endl;
	    //cout << "password = " << s3 << endl;
	    if(check(extract_min(s1), extract_max(s1), get_key(s2), s3))
	        count++;
		//cout << count << endl;
	}
	cout << count;
	return 0;
}