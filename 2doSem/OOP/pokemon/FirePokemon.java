/*Name: Hugo David Franco Avila
Date: Mar - 6 - 2018
This class represents a fire pokemon*/
package pokemon;

public class FirePokemon extends Pokemon{
	
	//Constructor
	public FirePokemon(String name){
		super(name);
	}
	
	//Methods
	public String attack(){
		String rp = super.attack();//call parent method
		rp += (name + " throw a fireball!");
		return rp;
	}
}