/*Name: Hugo David Franco Avila
Date: March - 13 - 2018
This class represents an Air Conditioner
*/
package vehicle;

public class AirConditioner{
	
	//Attributes
	private int temperature;
	private String brand;
	
	//Constructor
	public AirConditioner(int temperature, String brand){
		this.temperature = temperature;
		this.brand = brand;
	}
	
	public String getData(){
		return ("This " + brand + " AC unit is currently operating at " + temperature + "° Celsius");
	}
}
