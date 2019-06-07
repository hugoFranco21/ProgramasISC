/*Hugo David Franco Avila*/
#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int n, cad[10];
string s;
int main() {
	int x = 0, res = 0;
	string s;
	cin >> n >> s;
	for (int i = 0; i < (int) s.size(); i++) {
        int dig = s[i] - '0';
        cad[dig]++;
        x += dig;
    }
    for (int i = 0; i < 9; i++) {
        for (int j = 0; j < cad[i]; j++) {
            if (x < n) {
                res++;
                x += 9 - i;
            }
        }
    }
    cout << res << endl;
	return 0;
}
