/*Name: Hugo David Franco Avila
Date: April - 22 - 2018
This class represents a file object, that can serialize objects
*/
package logic;

import java.io.*;
import java.util.*;

public class FileHelper{
	
	//Attributes
	private String name;

	//Constructor
	public FileHelper(String name){
		this.name = name;
	}
	
        /*returns the name of the file*/
	public String getName(){
		return name;
	}
	
	/*The method write will take a Board object and serialize
	it into a file with the .ser extension. Object object is the parameter
	so it can take any object of any type and serialize it*/
	public void saveMatch(Object object){
		try {
			 FileOutputStream fileOut =
			 new FileOutputStream("src/matches/" + name + ".ser");
			 ObjectOutputStream out = new ObjectOutputStream(fileOut);
			 out.writeObject(object);
			 out.close();
			 fileOut.close();
		} catch (IOException i) {
			 i.printStackTrace();
			 System.out.println("There was a problem creating the file");
		}
		
	}
        
        /*The method write will take a string and write it on a line 
	inside the file, if multiple lines are written, they will 
	be appended under the last line written*/
	public void write(String n){
		try(FileWriter fw = new FileWriter("src/matches/" + name + ".txt",true);//true word will make lines append
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter out = new PrintWriter(bw))
		{
                    out.println(n);
		} catch (IOException e) {
			System.out.println("File cannot be written");
		}
	}
        
        /*This method will return an object type using the readObject()
	method of the ObjectInputStream class. If object is not found
	it will return a null object*/
        public Object deSerialize(){
		Object obj;
		try {
			FileInputStream fileIn = new FileInputStream("src/matches/" + name);
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
	
        public void setName(String name){
            this.name = name;
        }

}
