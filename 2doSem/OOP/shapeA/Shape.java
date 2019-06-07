/*Name: Hugo David Franco Avila
Date: Mar - 9 - 2018
This class represents an abstract class shape*/
package shapeA;

public abstract class Shape{
	
	//Attributes
	protected String color;
	
	//Constructor
	public abstract Shape();
	
	//Methods
	public abstract double getArea();
	
	public String toString(){
		System.out.println("Its color is " + color);
	}
	
}