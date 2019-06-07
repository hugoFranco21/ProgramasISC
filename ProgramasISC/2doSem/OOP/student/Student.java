/*Name: Hugo David Franco Avila
Date: Feb - 16- 2018
This class represent a Student*/

public class Student{
	
	//Attributes
	private String name;
	private Address homeAddress;
	private Address schoolAddress;
	private RespiratorySystem respsys;
	
	//Constructor
	public Student(String name, Address homeAddress, Address schoolAddress, boolean sta){
		
		this.name = name;
		this.homeAddress = homeAddress;
		this.schoolAddress = schoolAddress;
		this.respsys = new RespiratorySystem(sta);	
		
	}
	
	//To String method
	public String getData(){
		String st;
		st = ("Name: " + name +"\n\n" + "Home address: " + homeAddress.getData() + "\n\n" + "School address: " + schoolAddress.getData() + respsys.getData());
		return st;
	}

}