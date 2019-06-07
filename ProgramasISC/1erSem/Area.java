import java.util.Scanner;

public class Area{
	public static void main(String [] Args){
		double height;
		double width;
		double area;
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("We are going to calculate the area of a rectangle");
		System.out.println("Give me the height");
		height = in.nextDouble();
		System.out.println("Give me the width plz");
		width = in.nextDouble();
		area = height * width;
		System.out.println("El area es de " + area + " m^2");
		
	}
}