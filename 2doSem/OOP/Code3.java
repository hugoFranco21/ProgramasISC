/*Name: Hugo David Franco Avila
Date: Jan - 27 - 2018
This program will ask some questions to the user, and will display
a score based on his answers */

import java.util.Scanner;

public class Code3{
	public static void main (String[] Args){
		
		//variables
		int score = 0;
		float ansb1;
		char ans1, ans2, ans3, ans4, ans5;
		String a1, a2, a3, a4, a5;
		
		//initialization of scanner
		Scanner scanner = new Scanner(System.in);
		
		//Intro
		System.out.println("Hello, and welcome to this Star Wars trivia game");
		System.out.println("You have to answer 5 questions and you will get a score as high as 10 or as low as 0");
		System.out.println();
		
		//Question 1
		System.out.println("1. What's the name of the planet Luke Skywalker grew on? You have five seconds to answer");
		System.out.println("Just kidding, take your time!");
		System.out.println("a) Endor");
		System.out.println("b) Tattooine");
		System.out.println("c) Yavin 4");
		System.out.println("d) Mustafar");
		System.out.println("e) Alderaan");
		a1 = scanner.nextLine();
		a1 = a1.toLowerCase();
		ans1 = a1.charAt(0);
		if(ans1 == 'b'){
			score = score + 2;
		}
		System.out.println();
		
		//Question 2
		System.out.println("2. What is the name of Han Solo's ship?");
		System.out.println("a) Millenium Falcon");
		System.out.println("b) Tantive IV");
		System.out.println("c) Slave I");
		System.out.println("d) Millenium Hawk");
		System.out.println("e) X-Wing");
		a2 = scanner.nextLine();
		a2 = a2.toLowerCase();
		ans2 = a2.charAt(0);
		if(ans2 == 'a'){
			score = score + 2;
		}
		System.out.println();
		
		//Question 3
		System.out.println("3. What's the name of Poe Dameron's droid?");
		System.out.println("a) C-3PO");
		System.out.println("b) R2-D2");
		System.out.println("c) BB9e");
		System.out.println("d) BB8");
		System.out.println("e) Jar Jar");
		a3 = scanner.nextLine();
		a3 = a3.toLowerCase();
		ans3 = a3.charAt(0);
		if(ans3 == 'd'){
			score = score + 2;
		}
		System.out.println();
		
		//Question 4
		System.out.println("4. What is the name of the jedi Master who wields a purple lightsaber");
		System.out.println("a) Obi-Wan Kenobi");
		System.out.println("b) Yoda");
		System.out.println("c) Mace Windu");
		System.out.println("d) Qui Gon Jin");
		System.out.println("e) Ben Kenobi");
		a4 = scanner.nextLine();
		a4 = a4.toLowerCase();
		ans4 = a4.charAt(0);
		if(ans4 == 'c'){
			score = score + 2;
		}
		System.out.println();
		
		//Question 5
		System.out.println("5. What is Finn's number as a Stormtrooper");
		System.out.println("a) FN-2887");
		System.out.println("b) FN-2781");
		System.out.println("c) FN-1468");
		System.out.println("d) FN-2975");
		System.out.println("e) FN-2187");
		a5 = scanner.nextLine();
		a5 = a5.toLowerCase();
		ans5 = a5.charAt(0);
		if(ans5 == 'e'){
			score = score + 2;
		}
		System.out.println();
		
		//BONUS ROUND!!!
		System.out.println("BONUS ROUND:");
		System.out.println("Getting this question correct will add a point to your final score");
		System.out.println("Which is the best Star Wars film? Write the number of the episode, by the way, Rogue One = 3.5");
		ansb1 = scanner.nextFloat();
		scanner.nextLine();
		System.out.println();
		if(ansb1 == 5){
			score = score + 1;
		}
		
		//Score output
		System.out.println("Alright, let's check your score:");
		/*This avoids a situation where the player gets more points than he should*/
		if(score > 10){
			score = 10;
		}
		
		if(score == 10){
			System.out.println("You got " + score + " points. You are the Ultimate Fan!");
		} else if (score >= 6){
			System.out.println("You got " + score + " points. You did alright, but you gotta rewatch the films");
		} else {
			System.out.println("You got " + score + " points. Looks like you haven't watched the movies, what are you waiting for? Watch them!");
		}
		
		System.out.println();
		System.out.println("P.S. if you wrote anything different than 5 in the bonus question, you are just wrong");
		
		
	}
}