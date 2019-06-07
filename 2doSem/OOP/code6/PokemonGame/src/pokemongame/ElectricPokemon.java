/*
Name: Hugo David Franco Avila
Date: 25 - March - 2018
This class is the child of Pokemon, representing the Electric type
 */
package pokemongame;

import java.util.Random;

public class ElectricPokemon extends Pokemon {
   
    //Attributes
    
    //Constuctor
    public ElectricPokemon(String name){
        this.name = name;
    }
    
    //Methods
    public double lightAttack(){
        Random rnd = new Random();
        int x = rnd.nextInt(31) + 70;
        return x*0.2;//amount of damge is low but reliable
    }
    
    public double heavyAttack(){
        Random rnd = new Random();
        int x = rnd.nextInt(71) + 30;
        return x*0.3;//amount of damage is high but it is risky
    }
    
}