/*Hugo David Franco Avila*/
#include <iostream>
#include <bits/stdc++.h>
#define MAX 10000005

using namespace std;

string s;
long long b[MAX], n, m;

void funcionKMP(){
    int i = 0, j = -1; b[0] = -1;
    while (i < m){
        while (j >= 0 && s[i] != s[j]) j = b[j];
        i++;
		j++;
        b[i] = j;
    }
}

int main() {
    cin >> s;
    m = s.size();
	funcionKMP();
    if(b[m]==0){
        cout << "Just a legend" << endl;
    }
    else{
        bool flag = false;
        for(int i = 0; i < m; i++){
            if(b[i]==b[m]){
                cout << s.substr(0,b[m]);
            return 0;
            }
        }
        if(b[b[m]]!=0){
            cout << s.substr(0,b[b[m]]) << endl;
        }
        else cout << "Just a legend" << endl;
    }

    return 0;
}