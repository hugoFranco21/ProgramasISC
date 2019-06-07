/*Name: Hugo David Franco Avila
Date: Feb - 20- 2018
This class represent a Respiratory System that has a composition
relationship with the class Student*/

public class RespiratorySystem{
	
	//Attributes
	private boolean state;
	
	//Constructor
	public RespiratorySystem(boolean state){
		
		this.state = state;
		
	}
	
	//To String method
	public String getData(){
		String ph;
		if(state){
			ph = ("\n\n" + "This student is sick");
		} else{
			ph = ("\n\n" + "This student is healthy");
		}
		return ph;
	}

}