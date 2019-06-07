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

using namespace std;

typedef long long ll;
typedef pair<int, int> ii;
typedef vector<int> vi;
typedef vector<ii> vii;
typedef vector<vi> vvi;

/*class Tree;

class Node{
	public:
		int value;
		Node *left, *right;
	//public:
		Node(int);
		Node(int, Node*, Node*);
		//friend class Tree;
		int getValue() const{
			return value;
		}
};


class Tree{
	public:
		Node *root;
		
	//public:
		Tree(int);
		void insert();

	
	
	
	
};

Node::Node(int val){
	value = val;
}

Tree::Tree(int p){
	root = new Node(p);
}

void arbol(Tree &t,int n, int m){
	int a, b, c, d, aux = 0;
	Node *nx, *pr, *qz;
	pr = t.root;
	a = 2*n;
	b = n - 1;
	while(aux < 2*m){
		pr -> left = new Node(a);
		pr -> right = new Node(b);
		qz = pr -> left;
		nx = pr -> right;
		
	}
	
}

int main() {
	int n, m, x;
	cin >> n >> m;
	//Node ra(n);
	//ra = Node(4);
	Tree tree(n);
	cout << tree.root->value;
	
	return 0;
}*/


int main(){
	int n, m;
	int count = 0;
	cin >> n >> m;
	while(n != m){
		if(n > m){
			m += 1;
			count++;
		} else{
			if(m % 2 == 0){
				m /= 2;
				count++;
			} else{
				m += 1;
				count++;
				//n /= 2;
				//count++;
			}
		}	
	}
	cout << count << endl;
}















