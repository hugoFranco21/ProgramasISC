/*
Name: Hugo David Franco Avila
Date: 25 - March - 2018
This class is the child of Pokemon, representing the Electric type
 */
package pokemongame;

import java.util.Random;

public class FirePokemon extends Pokemon {
    
    //Attributes

    //Constructor
    public FirePokemon(String name){
        this.name = name;
    }
    
    //Methods
    public double lightAttack(){
        Random rnd = new Random();
        int x = rnd.nextInt(36) + 65;
        return x*0.18;//amount of damge is low but reliable
    }
    
    public double heavyAttack(){
        Random rnd = new Random();
        int x = rnd.nextInt(81) + 20;
        return x*0.35;//amount of damage is high but it is risky
    }
    
}