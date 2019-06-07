/*Name: Hugo David Franco Avila
Date: Feb - 16- 2018
This class will test the Student and Address class to see how
the relationship of aggregation works*/

public class TestStudent{
	public static void main(String[] args){
	
		//Constructors
		Address home = new Address("Felipe Angeles", "Queretaro","Queretaro", 28040);
		Address school = new Address("Ezekiel Montes", "Queretaro", "Queretaro", 32070);
		Student jake = new Student("Jake", home, school, true);
	
		System.out.println(jake.getData());
	
	}
}