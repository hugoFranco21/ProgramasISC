/*
Name: Hugo David Franco Avila
Date: 25 - March - 2018
This class is the child of Pokemon, representing the Electric type
 */
package pokemongame;

import java.util.Random;

public class WaterPokemon extends Pokemon {
    
    //Attributes

    //Constructor    
    public WaterPokemon(String name){
        this.name = name;
    }

    //Methods
    public double lightAttack(){
        Random rnd = new Random();
        int x = rnd.nextInt(26) + 75;
        return x*0.15;//amount of damge is low but reliable
    }
    
    public double heavyAttack(){
        Random rnd = new Random();
        int x = rnd.nextInt(66) + 35;
        return x*0.38;//amount of damage is high but it is risky
    }
    
}