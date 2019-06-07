/*Name: Hugo David Franco Avila
Date: March - 6 - 2018
This class represents a file object, that can be read and wrtten
*/
package code1;

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
	be appended under the last line written*/
	public void write(String n){
		try(FileWriter fw = new FileWriter(name + ".txt", true);//true word will make lines append
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter out = new PrintWriter(bw))
		{
			out.println(n);
		} catch (IOException e) {
			System.out.println("File cannot be written");
		}
	}
	
	/*This method will delete the content of the file*/
	public void deleteContent(){
		String s = "";//Blank
		try(FileWriter fw = new FileWriter(name + ".txt", false);//false will make the new line erase the whole file
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter out = new PrintWriter(bw))
		{
			out.print(s);
		} catch (IOException e) {
			System.out.println("File can't be deleted");
		}
	}
	
	/*This method will receive Strings inside a file and will 
	store them inside an ArrayList for easy manipulation*/
	public void read(ArrayList<String> list){
		try (BufferedReader br = new BufferedReader(new FileReader(name + ".txt"))) {
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				list.add(sCurrentLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("File cannot be read");
		}
	}
}

