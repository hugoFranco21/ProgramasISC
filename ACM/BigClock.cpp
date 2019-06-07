#include <iostream>
#include <queue>
#include <string>


#define INF 1000000000
#define FOR(i, a, b) for(int i=int(a); i<int(b); i++)
#define FORC(cont, it) for(decltype((cont).begin()) it = (cont).begin(); it != (cont).end(); it++)
#define pb push_back

using namespace std;


int main() {
	ios_base::sync_with_stdio(0);cin.tie(0);
	int T, h = 0, m = 0, n, sal = -1;
	cin >> T;
	bool dospuntos;
	string time;
	queue<int> salida;
	for(int i = 0; i < T; i++){
		n = 1;
		cin >> time;
		dospuntos = false;
		h = 0; m = 0; sal = -1;
		for(int j = time.size() - 1; j >= 0; j--){
			//cout << "time[" << j << "] = " << time[j] << endl;
			if (m != 0){
				//cout << "minutos = " << m << endl;
				sal = 0;
				break;
			}	
			if(time[j] == ':'){
				dospuntos = true;
				continue;
			}
			if(!dospuntos){
				if(n == 1){
					m += time[j] - '0';
					n--;
				} else{
					m += 10*(time[j] - '0');
					n = 1;
				}
				
			} else{
				if(n == 1){
					h += time[j] - '0';
					//cout << "unidades hora = " << h << endl;
					n--;
				} else{
					h += 10*(time[j] - '0');
					//cout << "decenas hora = " << h << endl;
				}
			}
					
		}
		//cout << "h = " << h << endl;
		if(sal == 0){
			//salida.push(sal);
		} else{
			sal = (h+12)%24;
			if(sal == 0) sal = 24;
		}
		//cout << "sal = " << sal << endl;
		salida.push(sal);
	}
	while(!salida.empty()){
		cout << salida.front() << endl;
		salida.pop();
	}
	return 0;
}