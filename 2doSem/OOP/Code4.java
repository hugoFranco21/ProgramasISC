/*Name: Hugo David Franco Avila
Date: Jan - 27 - 2018
This program will generate a random number, and the user will get 1 chance 
to guess it */

import java.util.Scanner;
import java.util.Random;

public class Code4{
	public static void main (String[] Args){
		
		//Variables
		int q, p;
		boolean i = true;
		String po;
		
		//Initialize random number generator
		Random r =  new Random();
		q = 1 + r.nextInt(25);//Assigned random number
		//Initialize Scanner
		Scanner scanner = new Scanner(System.in);
		
		
		//Start game
		System.out.println("Hello, in this game the machine will randomly generate a number between 1 and 25, and you will try to guess it");
		System.out.println("If you write anything other than an integer you will be asked to try again");
		System.out.println("The machine has made its choice, which number was it?");
		/*This loops checks if the parseInt throws an exception
		If it throws an exception, i =true, and the loop
		will restart
		If it doesn't, i = false, and it exits the loop*/
		do{
			po = scanner.nextLine();//read user input
			i = Check(po);//gives i the value of the function check
		}while(i);
		/*After the number is validated to be an integer
		you assign its value to p*/
		p = Integer.parseInt(po);
		System.out.println();
		/*This part of the program tells the user
		if he guessed it or not*/
		if(q == p){
			System.out.println("You did it, you correctly guessed the computer picked " + q + ", it was a 1/25 possibility and you did it. Congratulations!");
		} else{
			System.out.println("Sorry, wrong number. The correct one was " + q + ". Don't feel bad, it was only a 1/25 possibility. Statistics win again.");
		}
	}
	
	/*This function takes a string, and evaluates if it 
	throws an exception while parsing it to an Int*/
	public static boolean Check(String a){
		int b;
		try{
			b = Integer.parseInt(a);
				
		} catch(NumberFormatException e){
			System.out.println("You didn't introduce an integer");
			System.out.println("Please try again");
			return true;
		}
		return false;
	}
}