/*Name: Hugo David Franco Avila
Date: Mar - 6 - 2018
This class tests the pokemon class*/
package pokemon;

import java.util.*;

public class TestPokemon{
	public static void main(String[] args){
		
		String fire, water, elec;
		Pokemon f, w, e;
		//Object array
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Which fire pokemon do yo want?");
		fire = scanner.nextLine();
		System.out.println("Which water pokemon do yo want?");
		water = scanner.nextLine();
		System.out.println("Which electric pokemon do yo want?");
		elec = scanner.nextLine();
		
		f = new FirePokemon(fire);
		w = new WaterPokemon(water);
		e = new ElectricPokemon (elec);
		
		ArrayList <Pokemon> pokelist = new ArrayList<Pokemon>();
		pokelist.add(f);
		pokelist.add(w);
		pokelist.add(e);
		
		System.out.println(pokelist.get(0).attack());
		System.out.println();
		
		System.out.println(pokelist.get(1).attack());
		System.out.println();
		
		System.out.println(pokelist.get(2).attack());
		
	}
}