/*Name: Hugo David Franco Avila
Date: April - 22 - 2018
This class represents a the board from the tic tac toe, that will be updated
everytime a turn is taken. It receives two player objects in an aggregation
relationship
*/
package logic;

public class Board implements java.io.Serializable {
    //Attributes
    private Player playerOne;//There is a has-a relationship with player
    private Player playerTwo;
    private int[][][] tictactoe;//The matrix
    private int countOpc = 0;//special counter, to see how many time the user clicked on options
    private int countPlay = 0;//this helps the program know whose turn is it
    
    //Constructor
    public Board(Player playerOne, Player playerTwo){
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.tictactoe = new int[4][4][4];
    }
    
    /*This method will return the matrix*/
    public int[][][] match(){
        return this.tictactoe;
    }
      
    /*This method receives a loction inside the matrix and fills it with 
    the given value
    */
    public void setValue(int a, int b, int c, int value){
        tictactoe[a][b][c] = value;
    }
    
    /*This method returns the value of a location inside the matrix*/
    public int getValue(int a, int b, int c){
        return tictactoe[a][b][c];
    }
    
    /*This method retuns player1*/
    public Player getPlayer1(){
        return playerOne;
    }
    
    /*This method returns player 2*/
    public Player getPlayer2(){
        return playerTwo;
    }
    
    /*Increments the value of countOpc*/
    public void addOpc(){
        countOpc++;
    }
    
    /*Increments the value of countPlay*/
    public void addPlay(){
        countPlay++;
    }
    
    /*returns the value of countOpc*/
    public int getOpc(){
        return this.countOpc;
    }
    
    /*returns the value of countplay*/
    public int getPlay(){
        return this.countPlay;
    }
    
    /*Sets countPlay to a given value, useful to restart the board*/
    public void setPlay(int countPlay){
        this.countPlay = countPlay;
    }
}

