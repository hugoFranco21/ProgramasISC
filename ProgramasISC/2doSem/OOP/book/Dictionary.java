/*Name: Hugo David Franco Avila
Date: Feb - 27- 2018
This class represents a dictionary, which is a subclass from
book*/

public class Dictionary extends Book{
	
	//Attributes
	private int definitions;
	
	//Constructor
	/*public Dictionary(int definitions){
		
		this.definitions = definitions;
		
	}
	*/
	public void setDefinitions(int numDefinitions){
		definitions = numDefinitions;
	}
	
	public int getDefinitions(){
		return definitions;
	}

}