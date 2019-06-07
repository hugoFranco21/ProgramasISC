/*Name: Hugo David Franco Avila
Date: Feb - 20- 2018
This class represents a bank, that receives clients as attributes,
but doesn't create them*/
package bank;

public class Bank{
	
	//Attributes
	private String name;
	
	//Constructor
	public Bank (String name){
		
		this.name = name;
		
	}
	
	//To String method
	public String getData(){
		String lu;
		lu = ("The account is in " + name + "\n");
		return lu;
	}
	
}