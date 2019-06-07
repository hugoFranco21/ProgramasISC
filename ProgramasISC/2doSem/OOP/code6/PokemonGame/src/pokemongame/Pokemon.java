/*
Name: Hugo David Franco Avila
Date: 25 - March - 2018
This class is the parent for different type of pokemons
 */
package pokemongame;

public abstract class Pokemon {
    //Attributes
    protected String name;
    
    //Methods
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public abstract double lightAttack();
    
    public abstract double heavyAttack();  
    
    
}
