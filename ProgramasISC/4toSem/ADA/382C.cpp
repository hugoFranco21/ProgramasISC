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

bool check_igual(vi &v){
	for(int i = 1; i < v.size(); i++){
		if(v[i] != v[i-1]){
			return false;
		}
	}
	return true;
}

int main() {
	ios_base::sync_with_stdio(0);cin.tie(0);
	int n, aux, dif, prevdif, count = 0, difer, izq, der, ind = 0, check = 0, num, max;
	bool nuev, arith;
	ii par;
	cin >> n;
	vi v(n);
	vii diferencias;
	for(int i = 0; i < n; i++){
		cin >> aux;
		v[i] = aux;
	}
	sort(v.begin(), v.end());
	if(n == 1){
		cout << -1;
		return 0;
	} else if(n == 2 && v[0] != v[1]){
		dif = v[1] - v[0];
		if(dif % 2 == 0){
			cout << 3 << endl;
			cout << v[0] - dif << " ";
			cout << v[0] + dif/2 << " ";
			cout << v[1] + dif;
		} else{
			cout << 2 << endl;
			cout << v[0] - dif << " ";
			cout << v[1] + dif;
		}
		return 0;
	}	
	if(check_igual(v)){
		cout << 1 << endl;
		cout << v[0];
		return 0;
	}
	dif = v[1] - v[0];
	par = make_pair(dif,1);
	diferencias.pb(par);
	for(int i = 2; i < n; i++){// cambiar 2 por 1
		//if(v[i] > v[i-1]){
			//prevdif = dif;
			nuev = true;
			dif = v[i] - v[i-1];
			for(int j = 0; j < diferencias.size();j++){
				if(dif == diferencias[j].first){
					diferencias[j].second++;
					nuev = false;
				}
			}
			if(nuev){
				par = make_pair(dif,1);
				diferencias.pb(par);
			}
			/*if(dif == prevdif){
				difer = dif;
			} else{
				count++;
			}*/
		/*} else{
			cout << 0;
			return 0;
		}
		if(count > 1){
			break;
		}*/
		if(diferencias.size() > 2){
			cout << 0;
			return 0;
		}
	}
	//cout << "difer " << difer << endl;
	//cout << "izq " << izq << " " << "der " << der << endl;
	//if(count > 1){
		//cout << 0;
	//} else if(count == 1){
	if(diferencias.size() == 2){
		check = 0;
		//cout << "vector tamano 2 " << endl;
		if(diferencias[0].second > 1 && diferencias[1].second > 1){
			//cout << "no se pueden tener diferencias mayores a 1" << endl;
			cout << 0;
			return 0;
		} else if(diferencias[0].second == diferencias[1].second){
			//cout << "el numero de diferencias son iguales " << endl;
			for(int k = 0; k < 2; k++){
				ind = 0;
				arith = true;
				check =0;
				while(ind < n - 1){
					//cout << "v[" << ind << "] = " << v[ind] << endl;
					//cout << "v[ind] + dif[" << k << "] = " << v[ind] + diferencias[k].first << endl;
					if(v[ind] + diferencias[k].first != v[ind+1]){
						num = v[ind] + diferencias[k].first;
						check++;
						if(check > 1){
							arith = false;
							break;							
						}
						if(num + diferencias[k].first != v[ind+1]){
							arith = false;
							break;
						}
					}
					ind++;
				}
				if(arith){
					cout << 1 << endl;
					cout << num;
					return 0;
				}
			}
			cout << 0;
			return 0;
		} else if(diferencias[0].second > diferencias[1].second){
			//cout << "la diferencia 0 es mayor " << diferencias[0].second << " > " << diferencias[1].second << endl;
			//cout << "dif 0 = " << diferencias[0].first << endl;
			while(ind < n - 1){
				//cout << "v[" << ind << "] = " << v[ind] << endl;
				//cout << 
				if(v[ind] + diferencias[0].first != v[ind+1]){
					num = v[ind] + diferencias[0].first;
					check++;
					if(check > 1){
						cout << 0;
						return 0;
					}
					if(num + diferencias[0].first != v[ind+1]){
						cout << 0;
						return 0;
					}
				}
				ind++;
			}
			cout << 1 << endl;
			cout << num;
		} else{
			//cout << "la diferencia 1 es mayor " << diferencias[1].second << " > " << diferencias[0].second << endl;
			//cout << "dif 1 = " << diferencias[1].first << endl;
			while(ind < n - 1){
				if(v[ind] + diferencias[1].first != v[ind+1]){
					num = v[ind] + diferencias[1].first;
					check++;
					if(check > 1){
						cout << 0;
						return 0;
					}
					if(num + diferencias[1].first != v[ind+1]){
						cout << 0;
						return 0;
					}
				}
				ind++;
			}
			cout << 1 << endl;
			cout << num;
		}
	} else{
		cout << 2 << endl;
		cout << v[0] - diferencias[0].first << " ";
		cout << v[n-1] + diferencias[0].first;
	}
	return 0;
}