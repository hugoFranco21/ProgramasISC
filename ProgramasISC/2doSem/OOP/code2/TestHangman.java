/*Name: Hugo David Franco Avila
Date: March - 14 - 2018
This class will implement a Hangman game
*/
package code2;

import java.io.*;
import java.util.*;

public class TestHangman{
	public static void main(String[] args){
		
		//Variables
		File words, previousMatches;
		Random rnd = new Random();
		int random = rnd.nextInt(7), x = 0, i =0;
		String name, guess, word;
		char letter;
		//Constructors
		Scanner scanner = new Scanner(System.in);//read user input
		ArrayList<String> wordlist = new ArrayList<String>();//arrayList to write the words file
		words = new File("code2/words");//creates a file object
		previousMatches = new File("matches");//creates a file object to save information from the matches
		
		//Main
		words.read(wordlist);//adds words from file to arayList
		System.out.println("Hello new player!");
		System.out.println("Please write your name");
		name = scanner.nextLine();
		Player one = new Player(name);//create player object
		Game hangman = new Game(one, wordlist.get(random), "Hangman");//create game object
		
		word = hangman.getWord();//gets the randomized word to a string variable
		
		/*I used StringBuilder because I needed to append characters to an
		existing string, which the normal string doesn't allow me.
		And in the 'right' case, I needed to substitute chars to a 
		specific place in the String which is only allowed
		by StringBuilder.*/
		StringBuilder right = new StringBuilder();
		StringBuilder wrong = new StringBuilder();
		
		/*This fills the 'right' string with '-' so the player
		can see how many letters he hasn't found yet*/
		while(i < word.length()){
			right.append('-');
			i++;
		}
		
		System.out.println(hangman.toString());
		
		/*The while loop has two conditions, that the player still has
		lives and that he hasn't guessed the word yet. If any of
		those conditions is not met, it will exit the cycle*/
		while((one.checkStatus()) && (!word.equals(right.toString()))){
			System.out.println("\nYou have " + one.getLives() + " lives remaining.\n");
			System.out.println("Which letter do you think is in the word?");
			guess = scanner.nextLine();//Java doesn't allow individual char read
			letter = guess.charAt(0);//Extracts char I need
			/*The if below uses the tryLetter() method,
			if the letter is in the word it will enter the first
			case, if not it will go to the else block*/
			if(hangman.tryLetter(letter)){
				System.out.println("\n" + letter + " is in the word!");
			} else{
				System.out.println("\nSorry! " + letter + " isn't in the word");
				one.loseLife();//player will lose a life
				wrong.append(letter);//this will add the letters that are not correct to the 'wrong' string
			}
			
			System.out.println("Here is your updated guessed word\n");
			for(i = 0; i < word.length() ; i++){
				if(letter == word.charAt(i)){
					right.setCharAt(i, letter);//replaces - with the letter
				} 
			}
			System.out.println(right.toString() + "\n");//right cannot be printed directly
			System.out.println("These are the letters you have guessed that were wrong:\n" + wrong.toString() + "\n");
			
		}
		//exit loop
		
		/*If the player won it will enter the first condition, 
		if he lost then it will enter the else*/
		if(one.checkStatus()){
			System.out.println("Congratulations " + one.getName() + "! You won!");
			/*The block below writes the name of the player,
			the word he guessed, and how many lives he had left.
			The if is only for grammatical purposes*/
			if(one.getLives() == 1){
				previousMatches.write(one.getName() + " correctly guessed the word '" + hangman.getWord() + "' with " + one.getLives() + " life remaining.");			
			} else {
				previousMatches.write(one.getName() + " correctly guessed the word '" + hangman.getWord() + "' with " + one.getLives() + " lives remaining.");
			}
		} else{
			/*This block will write in the file the name
			of the player, that he lost and which word
			made him lose*/
			System.out.println("Thanks for playing " + one.getName() + ". Unfortunately you lost. Keep trying!");
			previousMatches.write(one.getName() + " couldn't guess the word '" + hangman.getWord() + "' within his 5 lives.");
		}	
	} 
}
