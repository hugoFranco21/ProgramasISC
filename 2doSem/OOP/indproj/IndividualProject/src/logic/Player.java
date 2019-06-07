/*Name: Hugo David Franco Avila
Date: April - 22 - 2018
This class represents a player, that can play tic tac toe
*/
package logic;

public class Player implements java.io.Serializable{
    //Atributes
    private String name;
    
    //Constructor
    public Player(String name){
        this.name = name;
    }
    
    /*This method will check if the integer received is even,
    and if it is it will return 1, else it will return 2*/
    public static int play(int count){
        if(count % 2 == 0){
            return 1;
        } else{
            return 2;
        }
    }
    
    /*Set the name of the player to a string
    */
    public void setName(String name){
        this.name = name;
    }
    
    /*Get the name of the player*/
    public String getName(){
        return this.name;
    }
}
