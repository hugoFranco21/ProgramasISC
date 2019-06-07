/*Name: Hugo David Franco Avila
Date: March - 13 - 2018
This class represents a Driver object
*/
package vehicle;

public class Driver{
	
	//Attributes
	private String name;
	private int age;
	
	//Constructor
	public Driver(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getData(){
		return ("Name: " + name + "\nAge: " + age + "\n");
	}
}
