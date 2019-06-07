/*Hugo David Franco Avila*/
#include <iostream>
#include <stdlib.h>

class Dragon{
	private:
		int strength;
		int bonus;
		
	public:
		Dragon();
		void setStrength(int s);
		void setBonus(int b);
		int getStrength() const;
		int getBonus() const;
		bool operator>(const Dragon &right);
		void operator=(const Dragon &right);
};

Dragon::Dragon(){
	strength = 0;
	bonus = 0;
}
void Dragon::setStrength(int s){
	strength = s;
}

void Dragon::setBonus(int b){
	bonus = b;
}

int Dragon::getStrength() const{
	return strength;
}

int Dragon::getBonus() const{
	return bonus;
}

bool Dragon::operator>(const Dragon &right){
	if(strength > right.strength)
		return true;
	else{
		return false;
	}
}

void Dragon::operator=(const Dragon &right){
	strength = right.strength;
	bonus = right.bonus;
}

int main(){
	int num, s, st, i = 0, bonus, count = 0; 
	bool win;
	Dragon prin, aux;
	scanf("%i %i", &s, &num);
	prin.setStrength(s);
	Dragon d[num];
	while(i < num){
		scanf("%i %i", &st, &bonus);
		d[i].setStrength(st);
		d[i].setBonus(bonus);
		i++;
	}
	
	i = 0;
	while(i < num){
		for(int j = 1; j < num; j++){
			if(d[j - 1] > d[j]){
				aux = d[j];
				d[j] = d[j -1];
				d[j -1] = aux;
			}
		}	
		i++;		
	}
	
	while(count < num){
		if (prin.getStrength() > d[count].getStrength()){
			prin.setStrength(prin.getStrength() + d[count].getBonus());
			win = true;
		} else{
			win = false;
			break;
		}
		count++;
	}
	
	
	if(win){
		std::cout << "YES";
	} else{
		std::cout << "NO";
	}
	
	return 0;
	
}