/*Name: Hugo David Franco Avila
Date: March - 13 - 2018
This class tests the vehicle package, using the class driver
and vehicle
*/
package vehicle;

public class TestVehicle{
	
	public static void main(String[] args){
		//Variables
		
		
		//Constructors
		Driver elite = new Driver("Hugo", 18);
		Vehicle car = new Car(elite, 2, 19, "LG");
		Vehicle moto = new Motorcycle(100, elite);
		Vehicle trucka = new PickupCar(500, elite, 4, 16, "Samsung");	
		Car myCar = (Car) car;
		PickupCar myTrucka = (PickupCar) trucka;
		
		//Main
		System.out.println("Welcome to the BMW driving academy");
		System.out.println("This is your info:");
		System.out.println(elite.getData());
		
		System.out.println("\nFirst you'll test a regular car");
		myCar.start();
		System.out.println("Test the AC unit");
		myCar.acInfo();
		myCar.stop();
		myCar.reverse();
		
		System.out.println("\nNow use the motorcycle");
		moto.start();
		moto.stop();
		
		System.out.println("\nDrive the pickup truck");
		myTrucka.start();
		System.out.println("Test the AC unit");
		myTrucka.acPrint();
		myTrucka.stop();
		
		
	}
	
}
