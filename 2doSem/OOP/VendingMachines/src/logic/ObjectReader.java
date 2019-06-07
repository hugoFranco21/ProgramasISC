/* 
AUTHOR: Daniel Elias Becerra A01208905
DESCRIPTION: This class reads the objects from a file.
DATE: 20/04/2018
*/

package logic;

import java.util.*;
import java.io.*;

public class ObjectReader{// Deserializes objects stored in a file

	private FileInputStream file_in; 
	private ObjectInputStream in;

	public Machine read(String filename){
            Machine machine=null;
            int j;
		try {
			file_in = new FileInputStream(new File(filename)); //create file input stream.
			in = new ObjectInputStream(file_in); // create object input stream
                        
                        machine=(Machine)in.readObject();
                                 
			in.close(); // close input streams
			file_in.close();
		} 
		catch (IOException i){
                    i.printStackTrace();
                } 

                catch (ClassNotFoundException c){
                    System.out.println("Machine class not found");
                    c.printStackTrace();
                }
        return machine;
	}

    public Machine2 read2(String filename){
            Machine2 machine2=null;
            int j;
		try {
			file_in = new FileInputStream(new File(filename)); //create file input stream.
			in = new ObjectInputStream(file_in); // create object input stream
                        
                        machine2=(Machine2)in.readObject();
                                 
			in.close(); // close input streams
			file_in.close();
		} 
		catch (IOException i){
                    i.printStackTrace();
                } 

                catch (ClassNotFoundException c){
                    System.out.println("Machine class not found");
                    c.printStackTrace();
                }
        return machine2;
	}
}