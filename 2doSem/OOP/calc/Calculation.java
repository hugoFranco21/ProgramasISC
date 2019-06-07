/*Date: Feb - 23- 2018
This class does a sum and a substraction of two integers
and shows the results*/
package calc;

public class Calculation{
	
	//Attributes
	protected int z;

	//Addition
	public void addition (int x, int y){
		
		z = x + y;
		System.out.println("The result of the addition is " + z);
		
	}
	
	//Substraction
	public void substraction (int x, int y){
		z = x - y;
		System.out.println("The result of the substraction is " + z);
	}
	

}