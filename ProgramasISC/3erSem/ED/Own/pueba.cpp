#include <iostream>
#include<vector>
using namespace std;

int pares(vector<int> &v){
	vector<int> z = v;
	if(z.size() == 1) return 1;
	z.resize(z.size()/2);
	return 1 + pares(z);
}

int main(){
	vector<int> v;
	for(int i = 0; i < 10; i++){
		v.push_back(i + 1);
	}
	cout << pares(v);
}