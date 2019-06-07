#include <bits/stdc++.h>

#define INF 1000000000
#define FOR(i, a, b) for(int i=int(a); i<int(b); i++)
#define FORC(cont, it) for(decltype((cont).begin()) it = (cont).begin(); it != (cont).end(); it++)
#define pb push_back

using namespace std;

typedef long long ll;
typedef pair<int, int> ii;
typedef vector<int> vi;
typedef vector<ii> vii;
typedef vector<vi> vvi;

int main() {
	ios_base::sync_with_stdio(0);cin.tie(0);
	int n, m, bombs = 0, des, row = -1, col = -1;
	
	set<int> x, y;
	cin >> n >> m;
	vi bcol(m,0), brow(n,0);
	char** mat;
	mat = new char*[n];
	for(int i = 0; i < n; i++){
		mat[i] = new char[m];
	}
	for(int i = 0; i < n; i++){
		for(int j = 0; j < m; j++){
			cin >> mat[i][j];
			if(mat[i][j] == '*'){
				bcol[j]++;
				brow[i]++;
				bombs++;
			}
		}
	}
	for(int i = 0; i < n; i++){
		for(int j = 0; j < m; j++){
			des = bcol[j] + brow[i];
			if(mat[i][j] == '*') des--;
			if(des == bombs){
				row = i;
				col = j;
				break;
			}
		}
	}
	if(row == -1){
		cout << "NO";
	} else{
		cout << "YES" << endl;
		cout << row + 1 << " " << col + 1;
	}
	
	//Deallocate
	for(int i = 0; i < n; i++){
		delete[] mat[i];
	}
	delete [] mat;
	return 0;
}