/*Name: Hugo David Franco Avila
Date: Jan - 22 - 2018
This program asks the user some questions and displays the answer
onscreen */

import java.util.Scanner;

public class Code1{
	public static void main (String[] Args){
		
		//Declaration of variables
		int age;
		String name, colour, music, food;
		
		//This block will ask the user for some of his personal
		//information
		System.out.println("Write your name");
		Scanner scanner = new Scanner (System.in);
		name = scanner.nextLine();
		System.out.println("How old are you?");
		age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("What is your favourite colour?");
		colour = scanner.nextLine();
		System.out.println("What is your favourite music genre?");
		music = scanner.nextLine();
		System.out.println("What is your favourite meal?");
		food = scanner.nextLine();
		
		//This block will print out the information
		System.out.println();
		System.out.println("Hello " + name + "!");
		System.out.println("You are " + age + " years old, your favourite color is " + colour + ", your favourite music is " + music + ", and your favourite food is "  + food);
			
	}	
}

