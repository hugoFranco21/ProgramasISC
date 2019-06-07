/*
Name: Hugo David Franco Avila
Date: 3 - April - 2018
This class represents a "Pet Hotel" which has an aggregation
relationship with Pet. That means it will have as attributes objects
of the class Pet
 */

package exam;

import java.util.ArrayList;

public class PetHotel{
	//Attributes
	private ArrayList<Pet> list;//Aggregation because it receives Pet objects
	
	//Constructor
	public PetHotel(){
		this.list = new ArrayList<Pet>();
	}
	
	//Methods
	public void addPet(Pet pet){
		list.add(pet);//add to arraylist
	}
	
	public ArrayList<Pet> getPets(){
		return list;
	}
	
	/*This method calls the eat() and drinkWater() methods form Pet*/
	public void feedPets(){
		int i;
		for(i = 0; i < list.size(); i++){
			list.get(i).eat();
			list.get(i).drinkWater();
			System.out.println("----------------------");
		}
	}
	

}