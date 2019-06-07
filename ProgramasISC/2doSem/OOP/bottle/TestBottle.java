//Name: Hugo David Franco Avila
//Date: Jan - 16 - 2018
//This method invokes the Bottle class and prints out information about them

package bottle;

public class TestBottle{
	public static void main(String[]args){
		
		//create 2 objects from the class Bottle 
		Bottle bonafont = new Bottle();
		Bottle ciel = new Bottle("Red", "Plastic", 1000f, 5f);
		
		//Print the attributes of the first object
		System.out.println("Bonafont");
		System.out.println("Color: " + bonafont.getColor());
		System.out.println("Material: " + bonafont.getMaterial());
		System.out.println("Volume: " + bonafont.getVolume() + " mL" );
		System.out.println("Radius: " + bonafont.getRadius() + " cm");
		System.out.println();
		
		//Print attributes of second object
		System.out.println("Ciel");
		System.out.println("Color: " + ciel.getColor());
		System.out.println("Material: " + ciel.getMaterial());
		System.out.println("Volume: " + ciel.getVolume() + " mL");
		System.out.println("Radius: " + ciel.getRadius() + " cm");
		System.out.println();
		
		//Get bottles 1 Height
		float heightBonafont = bonafont.getHeight();
		System.out.println("Bonafont height: " + heightBonafont + " cm");
		
		//Get bottles 2 Height
		float heightCiel = ciel.getHeight();
		System.out.println("Ciel height: " + heightCiel + " cm");
				
	}
}
