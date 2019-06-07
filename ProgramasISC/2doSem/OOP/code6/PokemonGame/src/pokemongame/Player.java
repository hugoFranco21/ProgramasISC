/*
Name: Hugo David Franco Avila
Date: 25 - March - 2018
This class is the child of Pokemon, representing the Electric type
 */
package pokemongame;

public class Player {
    
    //Attributes
    private String name;
    private Pokemon pokemon;
    private double health = 100;
    
    //Constructor
    public Player(String name, Pokemon pokemon){
        this.name = name;
        this.pokemon = pokemon;      
    }
    
    //Methods
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public Pokemon getPokemon(){
        return pokemon;
    }
    
    public String pName(){
        return pokemon.getName();
    }
    
    public void setPokemon(Pokemon pokemon){
        this.pokemon = pokemon;
    }
    
    public double getHealth(){
        return health;
    }
    
    public String gHealth(){
        return (health + "%");
    }
    
    public void setHealth(double health){
        this.health = health;
    }
    
    public void loseHealth(double val){
        this.health = this.health - val;
    }
    
    public double lightAttack(){
        return pokemon.lightAttack();
    }
    
    public double heavyAttack(){
        return pokemon.heavyAttack();
    }
    
}