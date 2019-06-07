import java.util.Scanner;

public class Temp{
	public static void main(String [] Args){
		double temp;
		final double NUM = 32;
		int decis;
		double result;
		
	System.out.println("Do you wish to convert the Temperature from F to C or viceversa?");
	System.out.println("0 for C to F");
	System.out.println("1 for F to C");
	Scanner dec = new Scanner(System.in);
	decis = dec.nextInt();
	
	if(decis==1){
		System.out.println("Write the temp in Fahrenheit");
		temp = dec.nextDouble();
		result = (temp-NUM)*(5.0/9);
		System.out.println("The temperature is " + result + " C");
	}
	else {
		System.out.println("Write the temp in Celsius");
		temp = dec.nextDouble();
		result = ((temp)*(9.0/5))+NUM;
		System.out.println("The temperature is " + result + " F");
	}	

	}
}
