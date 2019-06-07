/*Name: Hugo David Franco Avila
Date: March - 13 - 2018
This class represents a Car object, that is the child of vehicle
*/
package vehicle;

public class Car extends Vehicle{
	
	//Attributes
	protected int numberOfDoors;
	protected AirConditioner ac;
	
	//Constructor
	public Car(){
	}
	
	public Car(Driver passenger, int numberOfDoors, int temperature, String brand){
		this.passenger = passenger;
		this.numberOfDoors = numberOfDoors;
		this.ac = new AirConditioner(temperature, brand);
	}
	
	public void start(){
		System.out.println("The car is going forward");
		
	}
	
	public void stop(){
		System.out.println("The car has stopped");
	}
	
	public void reverse(){
		System.out.println("The car is going backward");
	}
	
	public void acInfo(){
		System.out.println(ac.getData());
	}
}
