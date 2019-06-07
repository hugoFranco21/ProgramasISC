/*Name: Hugo David Franco Avila
Date: March - 15 - 2018
This class represents a file object, that can serialize objects
*/
package code4;

import java.io.*;
import java.util.*;

public class File{
	
	//Attributes
	private String name;

	//Constructor
	public File(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	/*The method write will take an object and serialize
	it into a file with the .ser extension. Whenever another
	object is serialized it will be appended under the object
	that was las appended. Object object is the parameter
	so it can take any object of any type and serialize it*/
	public void serialize(Object object){
		try {
			 FileOutputStream fileOut =
			 new FileOutputStream("code4/" + name + ".ser", true);
			 ObjectOutputStream out = new ObjectOutputStream(fileOut);
			 out.writeObject(object);
			 out.close();
			 fileOut.close();
		} catch (IOException i) {
			 i.printStackTrace();
			 System.out.println("There was a problem creating the file");
		}
		
	}
	
}