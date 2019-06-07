/*Name: Hugo David Franco Avila
Date: Feb - 20- 2018
This class tests the bank package, it adds clients name to an
array list, and by giving the name it fetches his information*/
package bank;

import java.util.*;

public class TestBank{
	public static void main(String[] args){
		
		//variables
		int accNumb, x = 0;
		String clientName, c; 
		double clientBalance;
		boolean w = true;
		char ch;
		
		//constructors
		Scanner scanner = new Scanner(System.in);//To take user input
		Bank bancomer = new Bank("Bancomer");//Bank object called bancomer
		Bank banamex = new Bank("Banamex");//Bank object called banamex
		/*This randomizes an account number every time
		the program is ran*/
		Random rnd = new Random();
		int random = 100000 + rnd.nextInt(900000);
		accNumb = random;
		/*The block below is the creation of an array of client
		objects, this helps me get the exact object I need easier,
		and dynamically, I don't need to hardcode which object
		the user can see*/
		Client[] client = new Client[5];
		client[0] = new Client("Hugo Franco", accNumb, 10000, bancomer);
		random = 100000 + rnd.nextInt(900000);
		accNumb = random;//random account number of 6 digits
		client[1] = new Client("Manuel Gallegos", accNumb, 3500, bancomer);
		random = 100000 + rnd.nextInt(900000);
		accNumb = random;
		client[2] = new Client("Jose Sanchez", accNumb, 2800, banamex);
		random = 100000 + rnd.nextInt(900000);
		accNumb = random;
		client[3] = new Client("Nicole Barra", accNumb, 7500, banamex);
		random = 100000 + rnd.nextInt(900000);
		accNumb = random;
		client[4] = new Client("Ivan Celis", accNumb, 4700, bancomer);
		/*The block below creates an ArrayList of the names of the
		clients, I used this because I wanted to add a register
		new client function, but it was a little more complex
		than I thought.*/
		ArrayList<String>list = new ArrayList<String>();
		for(x = 0; x < 5; x++){
			list.add(client[x].getName());
		}
		x = 0;
		
		
		//Program
		System.out.println("Welcome to the public record office database");
		/*The do-while below is a menu, where the user can pick am
		option, and it will run until the user asks it to 
		stop*/
		do{
			
			System.out.println("What would you like to do next");
			System.out.println("1. Look for a person's account information");
			System.out.println("2. Exit");
			c = scanner.nextLine();
			ch = c.charAt(0);//java doesn't accept individual char input
			switch(ch){
				
				case '1':
					System.out.println("\nWe found information of 5 people: "+ list + "\nOf whom would you like to see?");
					clientName = scanner.nextLine();
					/*List of persons gets displayed, and the user
					is asked to write the name of who he wants to see*/
					x = 0;//so when it iterates x returns to 0
					/*The while below, has as condition that the string
					the user writes is not equal to the clients name.
					It ignores capital letters, and when it finds a match
					it gets out. The break inside the if is to stop 
					it from going on forever.*/
					while(!clientName.equalsIgnoreCase(list.get(x))){
						x++;
						if(x >= 5){
							break;
						}
					}
					if(x < 5){
						System.out.println(client[x].getData());
						//prints out client information
						
					} else{
						System.out.println("It seems like you misspelled the person's name, or the person you are looking for doesn't exist in our databases, please try again later\n");
					}
					
					
				break;
				
				case '2':
					System.out.println("\nHave a nice day!");
					w = false;
					//as the do while condition is w, after changing it to 
					//false it will finish the program
				break;
				
				default:
					System.out.println("\nYou didn't write a valid option\n");
					//It's never a bad idea to add this
			}
			
			
		}while (w);
		
		
	}
	

}