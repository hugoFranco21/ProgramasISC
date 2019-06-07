/*
Name: Hugo David Franco Avila
Date: 3 - April - 2018
This class represents an abstract class called Pet which has an aggregation
relationship with PetHotel. It also has a composition relationship with
NeckLace.
It is also the parent class from Dog, Cat and Rabbit
 */

package exam;

public abstract class Pet{
	//Attributes
	protected String name;
	protected String owner;
	protected NeckLace neckLace;//composition relationship
	protected static int numPets;//class attribute
	
	//This class doesn't have a constuctor because as it is abstract
	//it can't be instantiated
	
	//Methods
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setOwner(String owner){
		this.owner = owner;
	}
	
	public String getOwner(){
		return owner;
	}
	
	public int getNumPets(){
		
		return numPets;
	}
	
	/*Returns information from the Pets*/
	public String getData(){
		return ("The pet's name is " + name + "\nThe pet's owner is " + owner + "\n" + neckLace.getData());
	}
	
	/*Different from the eat() method in the child classes*/
	public void eat(){
		System.out.println("I am a pet and I'm eating food");
	}
	
	/*As this is an abstract method, in needs a definition
	in the child classes to be implemented*/
	public abstract void drinkWater();
	
	

}