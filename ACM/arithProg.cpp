/*Hugo David Franco Avila*/
#include <iostream>

class Element{
	private:
		int value;
		bool modificado;
	public:
		Element();
		void setMod(bool b);
		void setValue(int va);
		int getValue() const;
		bool getMod() const;
		
};

Element::Element(){
	value = 0;
	modificado = false;
}

void Element::setMod(bool b){
	modificado = b;
}

void Element::setValue(int va){
	value = va;
}

int Element::getValue() const{
	return value;
}

bool Element::getMod() const{
	return modificado;
}

		
int main(){
	int num, val, ans = 0, j = 0, valid1 = 0,valid2 = 0, valid3 = 0, aux1, aux2, aux3;
	bool check = true;
	scanf("%i", &num);
	Element arr[num];
	for(int i = 0; i < num; i++){
		scanf("%i", &val);
		arr[i].setValue(val);
	}
	if(num == 1 || num == 2){
		ans = 0;
	} else{
		while(j + 2 < num){
			valid1 = arr[j+1].getValue() - arr[j].getValue();
			valid2 = arr[j+2].getValue() - arr[j+1].getValue();
			if(num == 3){
				check = false;
			}
			if(valid1 == valid2){

			}else if((valid1 - valid2) > 4 || (valid2 - valid1) > 4){
				
				ans = -1;
				
				break;
			} else{
					aux1 = arr[j].getValue();
					aux2 = arr[j+1].getValue();
					aux3 = arr[j+2].getValue();
					do{
						
						arr[j].setValue(arr[j].getValue() + 1);
						valid1 = arr[j+1].getValue() - arr[j].getValue();
						valid2 = arr[j+2].getValue() - arr[j+1].getValue();
						valid3 = valid1;
						if(j+3 < num){
							valid3 = arr[j+3].getValue() - arr[j+2].getValue();
						}
						if(valid1 == valid2 && valid1 == valid3){
							arr[j].setMod(true);
							break;
						}
						arr[j].setValue(aux1);
						//
						arr[j+1].setValue(arr[j+1].getValue() + 1);
						valid1 = arr[j+1].getValue() - arr[j].getValue();
						valid2 = arr[j+2].getValue() - arr[j+1].getValue();
						valid3 = valid1;
						if(j+3 < num){
							valid3 = arr[j+3].getValue() - arr[j+2].getValue();
						}
						if(valid1 == valid2 && valid1 == valid3){
							arr[j+1].setMod(true);
							break;
						}
						arr[j+1].setValue(aux2);
						//
						arr[j+2].setValue(arr[j+2].getValue() + 1);
						valid1 = arr[j+1].getValue() - arr[j].getValue();
						valid2 = arr[j+2].getValue() - arr[j+1].getValue();
						valid3 = valid1;
						if(j+3 < num){
							valid3 = arr[j+3].getValue() - arr[j+2].getValue();
						}
						if(valid1 == valid2 && valid1 == valid3){
							arr[j+2].setMod(true);
							break;
						}
						arr[j+2].setValue(aux3);
						//
						arr[j].setValue(arr[j].getValue() + 1);
						arr[j+1].setValue(arr[j+1].getValue() + 1);
						valid1 = arr[j+1].getValue() - arr[j].getValue();
						valid2 = arr[j+2].getValue() - arr[j+1].getValue();
						if(j+3 < num){
							valid3 = arr[j+3].getValue() - arr[j+2].getValue();
						}
						if(valid1 == valid2 && valid1 == valid3){
							arr[j].setMod(true);
							arr[j+1].setMod(true);
							break;
						}
						arr[j].setValue(aux1);
						arr[j+1].setValue(aux2);
						
						//
						arr[j].setValue(arr[j].getValue() + 1);
						arr[j+2].setValue(arr[j+2].getValue() + 1);
						valid1 = arr[j+1].getValue() - arr[j].getValue();
						valid2 = arr[j+2].getValue() - arr[j+1].getValue();
						valid3 = valid1;
						if(j+3 < num){
							valid3 = arr[j+3].getValue() - arr[j+2].getValue();
						}
						if(valid1 == valid2 && valid1 == valid3){
							arr[j].setMod(true);
							arr[j+2].setMod(true);
							break;
						}
						arr[j].setValue(aux1);
						arr[j+2].setValue(aux3);
						
						//
						arr[j+1].setValue(arr[j+1].getValue() + 1);
						arr[j+2].setValue(arr[j+2].getValue() + 1);
						valid1 = arr[j+1].getValue() - arr[j].getValue();
						valid2 = arr[j+2].getValue() - arr[j+1].getValue();
						valid3 = valid1;
						if(j+3 < num){
							valid3 = arr[j+3].getValue() - arr[j+2].getValue();
						}
						if(valid1 == valid2 && valid1 == valid3){
							arr[j+1].setMod(true);
							arr[j+2].setMod(true);
							break;
						}
						arr[j].setValue(aux1);
						arr[j+1].setValue(aux2);
						arr[j+2].setValue(aux3);
						//
						arr[j].setValue(arr[j].getValue() + 1);
						arr[j+1].setValue(arr[j+1].getValue() + 1);
						arr[j+2].setValue(arr[j+2].getValue() + 1);
						valid1 = arr[j+1].getValue() - arr[j].getValue();
						valid2 = arr[j+2].getValue() - arr[j+1].getValue();
						valid3 = valid1;
						if(j+3 < num){
							valid3 = arr[j+3].getValue() - arr[j+2].getValue();
						}
						if(valid1 == valid2 && valid1 == valid3){
							arr[j].setMod(true);
							arr[j+1].setMod(true);
							arr[j+2].setMod(true);
							break;
						}
						arr[j].setValue(aux1);
						arr[j+1].setValue(aux2);
						arr[j+2].setValue(aux3);
											
						//Negativos
						arr[j].setValue(arr[j].getValue() - 1);
						valid1 = arr[j+1].getValue() - arr[j].getValue();
						valid2 = arr[j+2].getValue() - arr[j+1].getValue();
						valid3 = valid1;
						if(j+3 < num){
							valid3 = arr[j+3].getValue() - arr[j+2].getValue();
						}
						if(valid1 == valid2 && valid1 == valid3){
							arr[j].setMod(true);
							break;
						}
						arr[j].setValue(aux1);
						//
						arr[j+1].setValue(arr[j+1].getValue() - 1);
						valid1 = arr[j+1].getValue() - arr[j].getValue();
						valid2 = arr[j+2].getValue() - arr[j+1].getValue();
						valid3 = valid1;
						if(j+3 < num){
							valid3 = arr[j+3].getValue() - arr[j+2].getValue();
						}
						if(valid1 == valid2 && valid1 == valid3){
							arr[j+1].setMod(true);
							break;
						}
						arr[j+1].setValue(aux2);
						//
						arr[j+2].setValue(arr[j+2].getValue() - 1);
						valid1 = arr[j+1].getValue() - arr[j].getValue();
						valid2 = arr[j+2].getValue() - arr[j+1].getValue();
						if(j+3 < num){
							valid3 = arr[j+3].getValue() - arr[j+2].getValue();
						}
						if(valid1 == valid2 && valid1 == valid3){
							arr[j+2].setMod(true);
							break;
						}
						arr[j+2].setValue(aux3);
						//
						arr[j].setValue(arr[j].getValue() - 1);
						arr[j+1].setValue(arr[j+1].getValue() - 1);
						valid1 = arr[j+1].getValue() - arr[j].getValue();
						valid2 = arr[j+2].getValue() - arr[j+1].getValue();
						valid3 = valid1;
						if(j+3 < num){
							valid3 = arr[j+3].getValue() - arr[j+2].getValue();
						}
						if(valid1 == valid2 && valid1 == valid3){
							arr[j].setMod(true);
							arr[j+1].setMod(true);
							break;
						}
						arr[j].setValue(aux1);
						arr[j+1].setValue(aux2);
						
						//
						arr[j].setValue(arr[j].getValue() - 1);
						arr[j+2].setValue(arr[j+2].getValue() - 1);
						valid1 = arr[j+1].getValue() - arr[j].getValue();
						valid2 = arr[j+2].getValue() - arr[j+1].getValue();
						valid3 = valid1;
						if(j+3 < num){
							valid3 = arr[j+3].getValue() - arr[j+2].getValue();
						}
						if(valid1 == valid2 && valid1 == valid3){
							arr[j].setMod(true);
							arr[j+2].setMod(true);
							break;
						}
						arr[j].setValue(aux1);
						arr[j+2].setValue(aux3);
						
						//
						arr[j+1].setValue(arr[j+1].getValue() - 1);
						arr[j+2].setValue(arr[j+2].getValue() - 1);
						valid1 = arr[j+1].getValue() - arr[j].getValue();
						valid2 = arr[j+2].getValue() - arr[j+1].getValue();
						valid3 = valid1;
						if(j+3 < num){
							valid3 = arr[j+3].getValue() - arr[j+2].getValue();
						}
						if(valid1 == valid2 && valid1 == valid3){
							arr[j+1].setMod(true);
							arr[j+2].setMod(true);
							break;
						}
						arr[j+1].setValue(aux2);
						arr[j+2].setValue(aux3);
						
						//
						arr[j].setValue(arr[j].getValue() - 1);
						arr[j+1].setValue(arr[j+1].getValue() - 1);
						arr[j+2].setValue(arr[j+2].getValue() - 1);
						valid1 = arr[j+1].getValue() - arr[j].getValue();
						valid2 = arr[j+2].getValue() - arr[j+1].getValue();
						valid3 = valid1;
						if(j+3 < num){
							valid3 = arr[j+3].getValue() - arr[j+2].getValue();
						}
						if(valid1 == valid2 && valid1 == valid3){
							arr[j].setMod(true);
							arr[j+1].setMod(true);
							arr[j+2].setMod(true);
							break;
						}
						arr[j].setValue(aux1);
						arr[j+1].setValue(aux2);
						arr[j+2].setValue(aux3);
						
						//Mixtos
						arr[j].setValue(arr[j].getValue() + 1);
						arr[j+1].setValue(arr[j+1].getValue() - 1);
						valid1 = arr[j+1].getValue() - arr[j].getValue();
						valid2 = arr[j+2].getValue() - arr[j+1].getValue();
						valid3 = valid1;
						if(j+3 < num){
							valid3 = arr[j+3].getValue() - arr[j+2].getValue();
						}
						if(valid1 == valid2 && valid1 == valid3){
							arr[j].setMod(true);
							arr[j+1].setMod(true);
							break;
						}
						arr[j].setValue(aux1);
						arr[j+1].setValue(aux2);
						
						//
						arr[j].setValue(arr[j].getValue() - 1);
						arr[j+1].setValue(arr[j+1].getValue() + 1);
						valid1 = arr[j+1].getValue() - arr[j].getValue();
						valid2 = arr[j+2].getValue() - arr[j+1].getValue();
						valid3 = valid1;
						if(j+3 < num){
							valid3 = arr[j+3].getValue() - arr[j+2].getValue();
						}
						if(valid1 == valid2 && valid1 == valid3){
							arr[j].setMod(true);
							arr[j+1].setMod(true);
							break;
						}
						arr[j].setValue(aux1);
						arr[j+1].setValue(aux2);
						
						//
						arr[j].setValue(arr[j].getValue() + 1);
						arr[j+1].setValue(arr[j+1].getValue() - 1);
						arr[j+2].setValue(arr[j+2].getValue() - 1);
						valid1 = arr[j+1].getValue() - arr[j].getValue();
						valid2 = arr[j+2].getValue() - arr[j+1].getValue();
						valid3 = valid1;
						if(j+3 < num){
							valid3 = arr[j+3].getValue() - arr[j+2].getValue();
						}
						if(valid1 == valid2 && valid1 == valid3){
							arr[j].setMod(true);
							arr[j+1].setMod(true);
							arr[j+2].setMod(true);
							break;
						}
						arr[j+1].setValue(aux2);
						arr[j+2].setValue(aux3);
						arr[j].setValue(aux1);
						//
						arr[j].setValue(arr[j].getValue() + 1);
						arr[j+1].setValue(arr[j+1].getValue() - 1);
						arr[j+2].setValue(arr[j+2].getValue() + 1);
						valid1 = arr[j+1].getValue() - arr[j].getValue();
						valid2 = arr[j+2].getValue() - arr[j+1].getValue();
						valid3 = valid1;
						if(j+3 < num){
							valid3 = arr[j+3].getValue() - arr[j+2].getValue();
						}
						if(valid1 == valid2 && valid1 == valid3){
							arr[j].setMod(true);
							arr[j+1].setMod(true);
							arr[j+2].setMod(true);
							break;
						}
						arr[j+1].setValue(aux2);
						arr[j+2].setValue(aux3);
						arr[j].setValue(aux1);
						
						//
						arr[j].setValue(arr[j].getValue() - 1);
						arr[j+1].setValue(arr[j+1].getValue() + 1);
						arr[j+2].setValue(arr[j+2].getValue() - 1);
						valid1 = arr[j+1].getValue() - arr[j].getValue();
						valid2 = arr[j+2].getValue() - arr[j+1].getValue();
						valid3 = valid1;
						if(j+3 < num){
							valid3 = arr[j+3].getValue() - arr[j+2].getValue();
						}
						if(valid1 == valid2 && valid1 == valid3){
							arr[j].setMod(true);
							arr[j+1].setMod(true);
							arr[j+2].setMod(true);
							break;
						}
						arr[j+1].setValue(aux2);
						arr[j+2].setValue(aux3);
						arr[j].setValue(aux1);
						
						//
						arr[j].setValue(arr[j].getValue() - 1);
						arr[j+1].setValue(arr[j+1].getValue() - 1);
						arr[j+2].setValue(arr[j+2].getValue() + 1);
						valid1 = arr[j+1].getValue() - arr[j].getValue();
						valid2 = arr[j+2].getValue() - arr[j+1].getValue();
						valid3 = valid1;
						if(j+3 < num){
							valid3 = arr[j+3].getValue() - arr[j+2].getValue();
						}
						if(valid1 == valid2 && valid1 == valid3){
							arr[j].setMod(true);
							arr[j+1].setMod(true);
							arr[j+2].setMod(true);
							break;
						}
						arr[j+1].setValue(aux2);
						arr[j+2].setValue(aux3);
						arr[j].setValue(aux1);
						//
						arr[j+1].setValue(arr[j+1].getValue() + 1);
						arr[j+2].setValue(arr[j+2].getValue() - 1);
						valid1 = arr[j+1].getValue() - arr[j].getValue();
						valid2 = arr[j+2].getValue() - arr[j+1].getValue();
						valid3 = valid1;
						if(j+3 < num){
							valid3 = arr[j+3].getValue() - arr[j+2].getValue();
						}
						if(valid1 == valid2 && valid1 == valid3){
							arr[j+1].setMod(true);
							arr[j+2].setMod(true);
							break;
						}
						arr[j+1].setValue(aux2);
						arr[j+2].setValue(aux3);
						
						//
						arr[j+1].setValue(arr[j+1].getValue() - 1);
						arr[j].setValue(arr[j].getValue() + 1);
						valid1 = arr[j+1].getValue() - arr[j].getValue();
						valid2 = arr[j+2].getValue() - arr[j+1].getValue();
						valid3 = valid1;
						if(j+3 < num){
							valid3 = arr[j+3].getValue() - arr[j+2].getValue();
						}
						if(valid1 == valid2 && valid1 == valid3){
							arr[j+1].setMod(true);
							arr[j+2].setMod(true);
							break;
						}
						arr[j+1].setValue(aux2);
						arr[j+2].setValue(aux3);
						//
						
						arr[j].setValue(arr[j].getValue() + 1);
						arr[j+2].setValue(arr[j+2].getValue() - 1);
						valid1 = arr[j+1].getValue() - arr[j].getValue();
						valid2 = arr[j+2].getValue() - arr[j+1].getValue();
						valid3 = valid1;
						if(j+3 < num){
							valid3 = arr[j+3].getValue() - arr[j+2].getValue();
						}
						if(valid1 == valid2 && valid1 == valid3){
							arr[j].setMod(true);
							arr[j+2].setMod(true);
							break;
						}
						arr[j].setValue(aux1);
						arr[j+2].setValue(aux3);
						
						//
						arr[j].setValue(arr[j].getValue() - 1);
						arr[j+2].setValue(arr[j+2].getValue() + 1);
						valid1 = arr[j+1].getValue() - arr[j].getValue();
						valid2 = arr[j+2].getValue() - arr[j+1].getValue();
						valid3 = valid1;
						if(j+3 < num){
							valid3 = arr[j+3].getValue() - arr[j+2].getValue();
						}
						if(valid1 == valid2 && valid1 == valid3){
							arr[j].setMod(true);
							arr[j+2].setMod(true);
							break;
						}
						arr[j].setValue(aux1);
						arr[j+2].setValue(aux3);
						} while(valid1 != valid2);
				}
				j++;
		}

	
		
	}

	if(ans == -1){
		ans = -1;
	} else{
		for(int k = 0; k < num; k++){
			if(arr[k].getMod()){
				ans++;
			}
		}
	}
		
	std::cout << ans;
	return 0;

}