#include<bits/stdc++.h>

typedef long long int ll;

using namespace std;

void minPaper(int a[3], int b[3]){
	if(b[2] >= a[0]){
		b[2] -= a[0];
		a[0] = 0;
		if(b[2] >= a[2]){
			b[2] -= a[2];
			a[2] = 0;
		} else {
			a[2] -= b[2];
			b[2] = 0;
		}
	} else {
		a[0] -= b[2];
		b[2] = 0;
	}
}

void minRock(int a[3], int b[3]){
	if(b[0] >= a[1]){
		b[0] -= a[1];
		a[1] = 0;
		if(b[0] >= a[0]){
			b[0] -= a[0];
			a[0] = 0;
		} else {
			a[0] -= b[0];
			b[0] = 0;
		}
	} else {
		a[1] -= b[0];
		b[0] = 0;
	}
}

void minScissor(int a[3], int b[3]){
	if(b[1] >= a[2]){
		b[1] -= a[2];
		a[2] = 0;
		if(b[1] >= a[1]){
			b[1] -= a[1];
			a[1] = 0;
		} else {
			a[1] -= b[1];
			b[1] = 0;
		}
	} else {
		a[2] -= b[1];
		b[1] = 0;
	}
}

int main(){
	int n;
	int a[3], b[3];
	int mini, maxi = 0;
	cin >> n;
	mini = n;
	cin >> a[0] >> a[1] >> a[2];
	cin >> b[0] >> b[1] >> b[2];
	maxi += (a[0] >= b[1]) ? b[1] : a[0];
	maxi += (a[1] >= b[2]) ? b[2] : a[1];
	maxi += (a[2] >= b[0]) ? b[0] : a[2];
	if(b[2] > b[1]){
		if(b[2] > b[0]){
			if(b[1] > b[0]){
				minPaper(a, b);
				minScissor(a, b);
				minRock(a, b);
			} else {
				minPaper(a, b);
				minRock(a, b);
				minScissor(a, b);
			}
		} else {
			minRock(a, b);
			minPaper(a, b);
			minScissor(a, b);
		}	
	} else if(b[1] > b[0]){
		if(b[0] > b[2]){
			minScissor(a, b);
			minRock(a, b);
			minPaper(a, b);			
		} else {
			minScissor(a, b);
			minPaper(a, b);
			minRock(a, b);
		}
	} else {
		minRock(a, b);
		minScissor(a, b);
		minPaper(a, b);
	}
	mini = a[0] + a[1] + a[2];
	cout << mini << " " << maxi << endl;
	return 0;
}
