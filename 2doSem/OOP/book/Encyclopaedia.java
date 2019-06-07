/*Name: Hugo David Franco Avila
Date: Feb - 27- 2018
This class represents an encyclopaedia, which is a subclass from
book*/

public class Encyclopaedia extends Book{
	
	//Attributes
	private int branches;
	private String field;
	
	
	/*//Constructor
	public Encyclopaedia(int branches, String field){
		
		this.branches = branches;
		this.field = field;
		
	}
	*/
	
	public void setBranches(int branch){
		branches = branch;
	}
	
	public int getBranches(){
		return branches;
	}
	
	public void setField(String f){
		field = f;
	}
	
	public String getField(){
		return field;
	}

}