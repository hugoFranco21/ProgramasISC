/*Hugo David Franco Avila*/
#include <iostream>

class Board{
	private:
		int mat[][];
	public:
		Board();
		void setMod(bool b);
};

Board::Board(){
	
}

int main(){
	int num, count = 0, au = 10, ans, aux, aux2, aux3;
	scanf("%i", &num);
	if(num >= 0){
		ans = num;
	} else{
		while(num / au != 0){
			count++;
			ans = num / au;
			au = au*10;
		}
		if(count == 0){
			ans = 0;
		} else{
			aux = num % (10);
			aux2 = num % (100);
			aux2 = aux2 / 10;
			if(aux < aux2){			
				num = (num / 100)*10;
				ans = num + aux2;
			} else{
				num = (num / 100)*10;
				ans = num + aux;
			}
		}
	}
	std::cout << ans;
	return 0;
}