/*Name: Hugo David Franco Avila
Date: Jan - 22 - 2018
This program asks the user some questions and based on his answers
he asks different questions */

import java.util.Scanner;

public class Code2{
	public static void main (String[] Args){
		
		//Variables
		String a1, a2, a3;
		char ans1, ans2, ans3;
		int i;
		
		//Initialization (An error kept showing, thats the only reason for this block)
		ans1 = 'z';
		ans2 = 'z';
		ans3 = 'z';
		
		//
		System.out.println("This program will make you pick between two choices and then display your answers, if you write something that does not represent an answer, that one and the rest of the questions will be answered as Void.");
		System.out.println();
		System.out.println("Which color do you prefer, white or yellow?");
		Scanner scanner = new Scanner(System.in);
		a1 = scanner.nextLine();
		a1 = a1.toLowerCase();
		ans1 = a1.charAt(0);
		System.out.println();
		if (ans1 == 'w'){
			System.out.println("White can be used to make many colours, two of them are gray and pink, which of them do you prefer?");
			a2 = scanner.nextLine();
			a2 = a2.toLowerCase();
			ans2 = a2.charAt(0);
			System.out.println();
			if(ans2 == 'g'){
				System.out.println("Would you rather buy a gray jacket or shirt?");
				a3 = scanner.nextLine();
				a3 = a3.toLowerCase();
				ans3 = a3.charAt(0);
			} 
			
			else if (ans2 == 'p'){
				System.out.println("Would you rather buy pink underwear or socks?");
				a3 = scanner.nextLine();
				a3 = a3.toLowerCase();
				ans3 = a3.charAt(0);
			} 
			
			else{
				System.out.println("You didn't enter a valid answer");
				ans3 = 'z';
			}
		
		
		} else if(ans1 == 'y'){
			System.out.println("Yellow can be used to make many colours, two of them are green and orange, which of them do you prefer?");
			a2 = scanner.nextLine();
			a2 = a2.toLowerCase();
			ans2 = a2.charAt(0);
			System.out.println();
			if (ans2 == 'g'){
				System.out.println("Would you rather eat broccoli, or spinach?");
				a3 = scanner.nextLine();
				a3 = a3.toLowerCase();
				ans3 = a3.charAt(0);			
			}
			
			else if(ans2 == 'o'){
				System.out.println("Would you rather eat an orange or a carrot?");
				a3 = scanner.nextLine();
				a3 = a3.toLowerCase();
				ans3 = a3.charAt(0);
			}
		
			else{
				System.out.println("You didn't enter a valid answer");
				ans3 = 'z';
			}
		
		} else{
			System.out.println("You didn't enter a valid answer");
		}
		
		/*Switch to determine the final output*/
		System.out.println();
		System.out.println("Your answers were:");		
		switch(ans1){
			case 'w':
				System.out.println("-White");
				if(ans2 == 'g'){
					System.out.println("-Gray");
					if(ans3 == 'j'){
						System.out.println("-Jacket");
					}
					else if(ans3 == 's'){
						System.out.println("-Shirt");
					}
					else{
						System.out.println("-Void");
					}
					
				}
				else if(ans2 == 'p'){
					System.out.println("-Pink");
					if(ans3 == 'u'){
						System.out.println("-Underwear");
					}
					else if(ans3 == 's'){
						System.out.println("-Socks");
					}
					else{
						System.out.println("-Void");
					}
					
				}
				else{
					for(i = 0; i < 2; i++){
						System.out.println("-Void");
					}
				}
			break;
			
			case 'y':
				System.out.println("-Yellow");
				if(ans2 == 'g'){
					System.out.println("-Green");
					if(ans3 == 'b'){
						System.out.println("-Broccoli");
					}
					else if(ans3 == 's'){
						System.out.println("-Spinach");
					}
					else{
						System.out.println("-Void");
					}
					
				}
				else if(ans2 == 'o'){
					System.out.println("-Orange");
					if(ans3 == 'o'){
						System.out.println("-Orange");
					}
					else if(ans3 == 'c'){
						System.out.println("-Carrot");
					}
					else{
						System.out.println("-Void");
					}
					
				}
				else{
					for(i = 0; i < 2; i++){
						System.out.println("-Void");
					}
				}
			
			break;
			
			default:
				for(i = 0;i < 3; i++){
					System.out.println("-Void");
				}

		}
		
	}
}