/*Name: Hugo David Franco Avila
Date: Mar - 6 - 2018
This class represents an electric pokemon*/
package pokemon;

public class ElectricPokemon extends Pokemon{
	
	//Constructor
	public ElectricPokemon(String name){
		super(name);
	}
	
	
	//Methods
	public String attack(){
		String pr = super.attack();//call parent method
		pr += (name + " shock him!");
		return pr;
	}
}