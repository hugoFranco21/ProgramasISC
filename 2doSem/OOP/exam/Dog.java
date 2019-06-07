/*
Name: Hugo David Franco Avila
Date: 3 - April - 2018
This class represents a Dog object which is a child class of pet
 */

package exam;

public class Dog extends Pet{
	//Attributes
	/*It will inherit the attributes of pet*/

	//Constructor
	public Dog(String brand, String color){
		this.neckLace = new NeckLace(brand, color);//Composition relationship with necklace
		numPets++;//incrementing number of pets, given that it is a static attribute the this reference is not used
	}
	
	//Methods
	/*This eat method is overloaded, which means it has the same name but
	different parameters from the eat method in Pet. Given that it 
	is "different" than the eat() in Pet, we can only call it by downcasting from pet to Dog*/
	public void eat(String food){
		System.out.println("I am a Dog eating " + food);
	}
	
	/*This method is overriding the drink water method in the parent 
	class. As it was an abstract method, we defined it in the child class
	so it can be implemented*/
	public void drinkWater(){
		System.out.println("I am a Dog and I'm drinking water");
	}
	

}