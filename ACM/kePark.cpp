/*Hugo David Franco Avila*/
#include <algorithm>
#include <bitset>
#include <cmath>
#include <cstdio>
#include <cstring>
#include <deque>
#include <functional>
#include <iomanip>
#include <iostream>
#include <queue>
#include <map>
#include <numeric>
#include <set>
#include <sstream>
#include <stack>
#include <utility>
#include <vector>

#define INF 1000000000
#define FOR(i, a, b) for(int i=int(a); i<int(b); i++)
#define FORC(cont, it) for(decltype((cont).begin()) it = (cont).begin(); it != (cont).end(); it++)
#define pb push_back
#define MAX 100001

using namespace std;

typedef long long ll;
typedef pair<int, int> ii;
typedef vector<int> vi;
typedef vector<ii> vii;
typedef vector<vi> vvi;

vector<int> lis[MAX];
bool cats[MAX];
bool visited[MAX];
int n,m;

int dfs(int node, int cat, bool last){
    int sum = 0;
    visited[node]=true;
    if(cats[node])
        cat++;
    else
        cat = 0;
    if(cat > m)
        last=true;
    if(lis[node].size()==1 && node!=1)
        return !last;
    for(vector<int>::iterator it=lis[node].begin();it!=lis[node].end();it++){
        if(!visited[*it])
            sum += dfs(*it,cat,last);
    }
    return sum;
}

int main(){
	int p,c;
    cin >> n >> m;
    for(int i=1;i<=n;i++){
        cin >> cats[i];
    }
    for(int i=1;i<n;i++){
        
        cin >> p >> c;
        lis[p].pb(c);
        lis[c].pb(p);
    }
    cout<<dfs(1,0,0)<<endl;
	return 0;
}
