//Name: Hugo David Franco Avila
//Date: Jan - 16 - 2018
//This class defines a bottle

package bottle;

public class Bottle{

	//Attributes
	private String color;
	private String material;
	private float volume;
	private float radius;
	
	//Constructor
	public Bottle(){
		color = "Transparent";
		material = "Plastic";
		volume = 600.0f;
		radius = 7.0f;	
	}
	
	public Bottle(String bColor, String bMaterial,float bVolume, float bRadius){
		color = bColor;
		material = bMaterial;
		volume = bVolume;
		radius = bRadius;
	}
	
	//Setters and getters
	public void setColor(String bColor){
		color = bColor;
	}
	
	public String getColor(){
		return color;
	}
	
	public void setMaterial(String bMaterial){
		material = bMaterial;
	}
	
	public String getMaterial(){
		return material;
	}
	
	public void setVolume(float bVolume){
		volume = bVolume;
	}
	
	public float getVolume(){
		return volume;
	}
	
	public void setRadius(float bRadius){
		radius = bRadius;
	}
	
	public float getRadius(){
		return radius;
	}
	
	public float getHeight(){
		float height;
		height = volume/(3.14f * radius);
		return height;
	}

}