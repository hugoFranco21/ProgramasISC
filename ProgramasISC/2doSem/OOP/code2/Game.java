/*Name: Hugo David Franco Avila
Date: March - 14 - 2018
This class represents a game object
*/
package code2;

public class Game{
	
	//Attributes
	private Player player;
	private String word;
	private String name;

	//Constructor
	public Game(Player player, String word, String name){
		this.player = player;
		this.word = word;
		this.name = name;
	}
	
	//Methods
	public String getWord(){
		return word;
	}
	
	/*This method will check if the letter used by the player
	is in the word or not, returning a boolean*/
	public boolean tryLetter(char a){
		int x = word.length(), i, n = 0;
		for(i = 0; i < x; i++){
			if(word.charAt(i) == a){
				n++;
			}
		}
		if (n != 0){
			return true;
		} else {
			return false;
		}
	}
	
	/*This will return a string with information 
	from the game object*/
	public String toString(){
		return("Welcome to " + name + " " + player.getName() + ", you have to guess the letters that make up one word, if you guess a letter that isn't in the word you'll lose a life, you have 5 lives\nGood luck!");
	}
	
}
