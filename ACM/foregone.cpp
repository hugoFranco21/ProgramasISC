#include <bits/stdc++.h>

using namespace std;

int main(){
    int t;
    cin >> t;
    string a, b;
    pair<string,string> par;
    vector<pair<string,string>> solucion(t);
    for(int i = 0; i < t; i++){
        b.clear();
        cin >> a;
        for(int j = 0; j < a.size(); j++){
            if(a[j] == '4'){
                a[j]='3';
                b.push_back('1');
            } else{
                if(b[0]=='1'){
                    b.push_back('0');
                }
            }
        }
        par = make_pair(a,b);
        solucion[i]=par;
    }
    for(int i = 0; i < t; i++){
        cout << "Case #" << i+1 << ": " << solucion[i].first << " " << solucion[i].second << endl;
    }
	return 0;
}