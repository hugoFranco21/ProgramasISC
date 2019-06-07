/*Name: Hugo David Franco Avila
Date: Feb - 1 - 2018
This program will read a text file specified by the user
and it will print its content in the console*/
import java.util.*;
import java.io.*;

public class Code7{
	public static void main(String[] Args){
		
		//Variables
		String loc;
		int x=0, j =0, b;
		
		//Constructors
		Scanner scanner = new Scanner(System.in);
		
		//Initialization
		System.out.println("Hello, this program will ask you for the location of a file, and will display its content and what type of data is in it");
		System.out.println("What is the location of the file? Or if the file is in the same folder as this java code, what is its name?");
		loc = scanner.nextLine();//this is the name/path of file
		
		/*I use the try - catch structure because when using files,
		the name or the path could be written wrong, so if the file
		can't be found, it will notify the user*/
		try{
			Scanner s = new Scanner(new File(loc + ".txt"));//this method reads the file
			/*In this array list I save the content of the file*/
			ArrayList<String> list = new ArrayList<String>();
			/*This while-cycle writes all the lines of the file 
			into the array list*/
			while (s.hasNextLine()){
				list.add(s.nextLine());
				x = x + 1;//this is a counter, that i will use next
			}
			s.close();//This closes the file
			/*This while-cycle will read the content of the ArrayList
			and try to convert it to an integer, if it can, then
			it is a number, if it doesnt, it is a string*/
			while(j < x){
				try{
					b = Integer.parseInt(list.get(j));
					System.out.println(list.get(j) + " - number");
					j++;
				
				} catch(NumberFormatException e){
					System.out.println(list.get(j) + " - word");
					j++;		
				}
			}		
		} catch (IOException e){
			System.out.println("File name/path incorrect");
		}
	}
	
}