/*Name: Hugo David Franco Avila
Date: Feb - 16 - 2018
This class represent the address of a place*/

public class Address{
	//Attributes
	private String streetAddress;
	private String city;
	private String state;
	private long zipCode;
	
	//Constructor
	public Address(String streetAddress, String city, String state, long zipCode){
		
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
			
	}
	
	//To String method
	public String getData(){
		String ad;
		ad = ("\n" + "Street address: " + streetAddress + "\n" + "City: " + city + "\n" + "State: " + state + "\n" + "ZipCode: " + zipCode);
		return ad;
	}



}