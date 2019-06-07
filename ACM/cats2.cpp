
#include <bits/stdc++.h>
#define MAX 100001
using namespace std;

vector<int> lis[MAX];
bool cats[MAX];
bool visited[MAX];
int n,m;

int dfs(int node, int n_cats, bool last){
    int sum=0;
    visited[node]=true;
    if(cats[node])
        n_cats++;
    else
        n_cats=0;
    if(n_cats>m)
        last=true;
    if(lis[node].size()==1 && node!=1)
        return !last;
    for(vector<int>::iterator it=lis[node].begin();it!=lis[node].end();it++){
        if(!visited[*it])
            sum+=dfs(*it,n_cats,last);
    }
    return sum;
}

int main(){
    cin>>n>>m;
    for(int i=1;i<=n;i++){
        cin>>cats[i];
    }
    for(int i=1;i<n;i++){
        int p,c;
        cin>>p>>c;
        lis[p].push_back(c);
        lis[c].push_back(p);
    }
    cout<<dfs(1,0,0)<<endl;
}
