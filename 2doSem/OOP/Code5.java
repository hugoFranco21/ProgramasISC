/*Name: Hugo David Franco Avila
Date: Jan - 27 - 2018
This program will generate a random number, and the user will get 1 chance 
to guess it. It will repeat itself until the user gets it right.
It'll also count the number of times the user tried */

import java.util.Scanner;
import java.util.Random;

public class Code5{
	public static void main (String[] Args){
		
		//Variables
		int q, p, counter = 0;
		boolean i = true, z = false;
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
			counter = counter + 1;//This adds 1 to the number of tries the user has used
			if(q == p){
				System.out.println("You did it, you correctly guessed the computer picked " + q + ". Congratulations!");
				System.out.println("And it only took you " + counter + " tries!");
				z = true;
			} else{
				System.out.println("Sorry, wrong number. Try again");		
			}
		}while(!z);
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