/*
Name: Hugo David Franco Avila
Date: 3 - April - 2018
This class represents a Cat object which is a child class of pet
 */

package exam;

public class Cat extends Pet{
	//Attributes
	/*It will inherit the attributes of pet*/

	//Constructor
	public Cat(String brand, String color){
		this.neckLace = new NeckLace(brand, color);//Composition relationship with necklace
		numPets++;//incrementing number of pets
	}
	
	//Methods
	/*This eat method is overloaded, which means it has the same name but
	different parameters from the eat method in Pet. Given that it 
	is "different" from the eat() method in Pet, we can only call it by downcasting from pet to Cat*/
	public void eat(String food){
		System.out.println("I am a Cat eating " + food);
	}
	
	/*This method is overriding the drink water method in the parent 
	class. As it was an abstract method, we defined it in the child class
	so it can be implemented*/
	public void drinkWater(){
		System.out.println("I am a Cat and I'm drinking water");
	}
	

}