/*Name: Hugo David Franco Avila
Date: Jan - 31 - 2018
This program will show the table of the numbers from 1 to 10
using nested loops*/

public class Code6{
	public static void main(String[] Args){
		
		//Variables
		int x, y, mul;
		
		/*Initialization, brief introduction to what the 
		program will do*/
		System.out.println("Hello, this program will display the numeric tables from 1 to 10");
		System.out.println();
		
		/*This for loop will handle the first number
		or the one who gets multiplied by all the numbers from
		1 to 10*/
		for(x=1;x<=10;x++){
			/*This loop transitions the numbers from 1 to 10
			and restarts everytime the main number changes*/
			for(y=1;y<=10;y++){
				mul = x*y;// The result
				/*The if conditional below, was used to help
				improve readability of my table, what it does 
				is that when a number is only of 1 digit,
				it will leave 2 spaces before it, so it can 
				catch up to 2 digit numbers, it makes it look
				really organized
				I used print() because I wanted all the numbers
				from the table to be displayed horizontally,
				and then change to the other numeric table 
				in another line*/
				if(mul>=10){
					System.out.print(" " + mul);
				} else{
					System.out.print("  " + mul);
				}
			}
			System.out.println();//change of line
		}
	}
}