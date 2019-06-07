/*Name: Hugo David Franco Avila
Date: Mar - 6 - 2018
This class represents a pokemon with no specific type*/
package pokemon;

public class Pokemon{
	
	//Attributes
	protected String name;
	
	
	//Constructor
	public Pokemon(String name){
		
		this.name = name;
		
	}
	
	//Methods
	public String getName(){
		return name;
	}
	
	public void setName(String n){
		name = n;
	}
	
	public String attack(){
		String st;
		st = (name + " I choose you!\n");
		return st;
	}
}