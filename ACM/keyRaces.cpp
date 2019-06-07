/*Hugo David Franco Avila*/
#include <iostream>
#include <bits/stdc++.h>


using namespace std;

int t_total(int x, int y, int z){
	return x*y + 2*z;
}
int main(){
	int n, v1, t1, v2, t2, tot1, tot2;
	scanf("%d %d %d %d %d", &n, &v1, &v2, &t1, &t2);
	if(t_total(n,v1,t1) > t_total(n,v2,t2)){
		cout << "Second";
	} else if(t_total(n,v1,t1) < t_total(n,v2,t2)){
		cout << "First";
	} else{
		cout << "Friendship";
	}
	return 0;
}