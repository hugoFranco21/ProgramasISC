/*
Name: Hugo David Franco Avila
Date: 3 - April - 2018
This class represents a NeckLace which has a composition
relationship with Pet. It's constructor will be called in the constructor
of the child classes of pet
 */
 
package exam;

public class NeckLace{
	
	//Attributes
	private String color;
	private String brand;
	
	//Constructor
	public NeckLace(String color, String brand){
		this.color = color;
		this.brand = brand;
	}
	
	//Methods
	public String getData(){
		return ("The pet's necklace is: " + brand + " " + color);
	}
	

}