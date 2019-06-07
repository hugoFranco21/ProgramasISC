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

void llenar(int dist[26][26]){
	for(int i = 0; i < 26; i++){
		for(int j = 0; j < 26; j++){
			if(i >= j){
				dist[i][j] = i - j;
			} else{
				dist[i][j] = j - i;
			}
			if(dist[i][j] > 13){
				dist[i][j] = 26 - dist[i][j];
			}
		}
	}
	/*for(int i = 0; i < 26; i++){
		for(int j = 0; j < 26; j++){
			cout << dist[i][j] << " ";
		}
		cout << "\n";
	}*/
}

int main() {
	ios_base::sync_with_stdio(0);cin.tie(0);
	int n, p, l = -1, r = -1, moves = 0, ind;
	int dist[26][26];
	bool flag;
	stack<int> st;
	queue<int> q;
	string s;
	cin >> n >> p;
	cin >> s;
	if(p > n/2){
		reverse(s.begin(), s.end());
		p = n - p;
	} else{
		p--;
	}
	//cout << "string " << s << endl;
	//cout << "p " << p << endl;
	/*for(int i = 0; i < n/2; i++){
		if(s[i] != s[s.size()-(1+i)] && i < p){
			if(l == -1)	l = i;
		} else if(s[i] != s[s.size()-(1+i)] && i > p){
			r = i;
		}		
	}*/
	for(int i = 0; i < n/2; i++){
		if(s[i] != s[s.size()-(1+i)]){
			if(i <= p){
				if(l == -1)	l = i;
			} else{
				r = i;
			}
			st.push(i);
			q.push(i);
		}			
	}
	if(l == -1){
		l = p;
	}
	if(r == -1){
		r = p;
	}
	//cout << "l " << l << endl;
	//cout << "r " << r << endl;
	
	llenar(dist);
	/*if(l == -1 && r != -1){
		//cout << "cond 1" << endl;
		moves += r - p;
		ind = r;
		//cout << "ind " << ind << endl;
		while(ind > p - 1){
			if(st.top() == ind) st.pop();
			if(s[ind] != s[s.size() - (1+ind)]){
				moves += dist[(int)s[ind] - 97][(int)s[s.size() - (1+ind)] - 97];
			}
			if(st.empty()) break;
			moves++;
			ind--;
		}
	} else if(r == -1 && l != -1){
		cout << "cond 2" << endl;
		moves += p - q.front();
		ind = q.front();
		while(ind < p + 1){
			if(q.front() == ind) q.pop();
			if(s[ind] != s[s.size() - (1+ind)]){
				moves += dist[(int)s[ind] - 97][(int)s[s.size() - (1+ind)] - 97];
			}
			if(q.empty()) break;
			moves++;
			ind++;
		}
	} else if(r == -1 && l == -1){
		//cout << "cond 3" << endl;
		if(s[p] != s[s.size() - (1+p)]){
			moves += dist[(int)s[p] - 97][(int)s[s.size() - (1+p)] - 97];
		} else{
			moves = 0;
		}
	} else{*/
		//cout << "cond 4" << endl;
		ind = ((r - p) > (p - l)) ? l : r;
		//cout << "ind = " << ind << endl;
		if(ind == l){
			moves += p - l;
			while(ind < r + 1){
				if(q.front() == ind) q.pop();
				if(s[ind] != s[s.size() - (1+ind)]){
					moves += dist[(int)s[ind] - 97][(int)s[s.size() - (1+ind)] - 97];
				}
				if(q.empty()) break;
				moves++;
				ind++;
			}
		} else{
			moves += r - p;
			//cout << "moves inicial " << moves << endl;
			while(ind > l - 1){
				if(st.top() == ind) st.pop();
				if(s[ind] != s[s.size() - (1+ind)]){
					//cout << "s[" << ind << "] = " << s[ind] << " " << "s[" << s.size() - (1+ind) << "] = " << s[s.size() - (1+ind)] << endl; 
					moves += dist[(int)s[ind] - 97][(int)s[s.size() - (1+ind)] - 97];					
				}
				if(st.empty()) break;
				//if(ind != l) 
				moves++;
				ind--;
				//cout << "moves actual " << moves << endl;
				//cout << "pos actual " << ind << endl;
			}
		}
	//}
	cout << moves;
	return 0;
}