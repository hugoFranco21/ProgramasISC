/*Name: Hugo David Franco Avila
Date: March - 18 - 2018
This class represents a file object, that can serialize
and deserialize objects
*/
package code5;

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
	
	/*The method write will take a string and write it on a line 
	inside the file, if multiple lines are written, they will 
	be appended under the last line written, depending
	on the value of the boolean*/
	public void serialize(Object object, boolean b){
		try {
			 FileOutputStream fileOut =
			 new FileOutputStream("code5/" + name + ".ser", b);
			 ObjectOutputStream out = new ObjectOutputStream(fileOut);
			 out.writeObject(object);
			 out.close();
			 fileOut.close();
		} catch (IOException i) {
			 i.printStackTrace();
			 System.out.println("There was a problem creating the file");
		}
		
	}

	/*This method will return an object type using the readObject()
	method of the ObjectInputStream class. If object is not found
	it will return a null object*/
	public Object deSerialize(){
		Object obj;
		try {
			FileInputStream fileIn = new FileInputStream("code5/" + name + ".ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			obj = in.readObject();
			fileIn.close();
			return obj;
		} catch (IOException y) {
			y.printStackTrace();
			System.out.println("File couldn't be opened");
			obj = null;
			return obj;
        } catch (ClassNotFoundException c) {
			System.out.println("Class not found");
			c.printStackTrace();
			obj = null;
			return obj;
			
		}
	}
}

