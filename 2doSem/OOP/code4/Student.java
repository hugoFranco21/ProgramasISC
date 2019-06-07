/*Name: Hugo David Franco Avila
Date: March - 15 - 2018
This class represents a student object.
It implements serializable so it can be serialized into a file
*/
package code4;

public class Student implements java.io.Serializable{
	
	//Attributes
	private String name;
	private String studentID;
	private double average;

	//Constructor
	public Student(String name, String studentID, double average){
		this.name = name;
		this.studentID = studentID;
		this.average = average;
	}
	
	//Methods
	public String getName(){
		return name;
	}
	
	public void setName(String n){
		name = n;
	}
	
	public String getStudentID(){
		return studentID;
	}
	
	public void setStudentID(String id){
		studentID = id;
	}
	
	public double getAverage(){
		return average;
	}
	
	public void setAverage(Double a){
		average = a;
	}
	
	public String getData(){
		return ("Name: " + name + "\nID: " + studentID + "\nAverage: " + average);
	}
}
