/*Name: Hugo David Franco Avila
Date: Mar - 6 - 2018
This class represents a water pokemon*/
package pokemon;

public class WaterPokemon extends Pokemon{
	
	//Constructor
	public WaterPokemon(String name){
		super(name);
	}
	
	//Methods
	public String attack(){
		String n = super.attack();//call parent method
		n += (name + " splash him!");
		return n;
	}
}