/*Date: Feb - 23- 2018
This class test the MyCalculation class*/
package calc;

import java.util.Scanner;

public class TestCalculation{
	public static void main(String[] args){
		Scanner scanner = new Scanner (System.in);
		int x, y;
		System.out.println("Write x");
		x = scanner.nextInt();
		System.out.println("Write y");
		y = scanner.nextInt();
		MyCalculationx2 calcu = new MyCalculationx2();
		calcu.addition(x,y);
		calcu.substraction(x,y);
		calcu.multiplication(x,y);
		calcu.division(6,3);
		
	}

}