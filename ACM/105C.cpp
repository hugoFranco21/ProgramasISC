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

class item{
	private:
		string name, cla;
		int atk, def, res, size;
		
	public:
		itesm(string name, string cla, int atk, int def, int res, int size){
			this->name = name;
			this->cla = cla;
			this->atk = atk;
			this->def = def;
			this->res = res;
			this->size = size;
		}
};

int main() {
	ios_base::sync_with_stdio(0);cin.tie(0);
	return 0;
}