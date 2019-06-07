/*Name: Hugo David Franco Avila
Date: March - 13 - 2018
This class represents a Motorcycle object, that is the child of vehicle
*/
package vehicle;

public class Motorcycle extends Vehicle{
	
	//Attributes
	private int cubicCentimeters;
	
	//Constructor
	public Motorcycle(int cubicCentimeters, Driver passenger){
		this.cubicCentimeters = cubicCentimeters;
		this.passenger = passenger;
	}
	
	public void start(){
		System.out.println("The motorcycle is going forward");
	}
	
	public void stop(){
		System.out.println("The motorcycle has stopped");
	}
}