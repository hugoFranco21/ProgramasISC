/*Name: Hugo David Franco Avila
Date: March - 14 - 2018
This class represents a player object
*/
package code2;

public class Player{
	
	//Attributes
	private String name;
	private int lives = 5;

	//Constructor
	public Player(String name){
		this.name = name;
	}
	
	//Methods
	public String getName(){
		return name;
	}
	
	public int getLives(){
		return lives;
	}
	
	public void loseLife(){
			lives = lives - 1;
	}
	
	/*This method will check if the player still has lives 
	or if he has already lost his 5 lives*/
	public boolean checkStatus(){
		if(lives == 0){
			return false;
		} else{
			return true;
		}
	}
}
