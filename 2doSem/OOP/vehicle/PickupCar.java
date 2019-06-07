/*Name: Hugo David Franco Avila
Date: March - 13 - 2018
This class represents a Pickup object, that is the child of Car
*/
package vehicle;

public class PickupCar extends Car{
	
	//Attributes
	private float maxLoad;
		
	//Constructor
	public PickupCar(float maxLoad, Driver passenger, int numberOfDoors, int temperature, String brand){
		super(passenger, numberOfDoors, temperature, brand);
		this.maxLoad = maxLoad;
		
	}
	
	public void start(){
		System.out.println("The pickup car is going forward");
		
		
	}
	
	public void stop(){
		System.out.println("The pickup car has stopped");
	}
	
	public void acPrint(){
		super.acInfo();
	}
	
}
