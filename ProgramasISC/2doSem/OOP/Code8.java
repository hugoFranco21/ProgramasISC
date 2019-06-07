/*Name: Hugo David Franco Avila
Date: Feb - 1 - 2018
This program will read a text file which has numbers in it,
and it will perform operations in it, and will display the results
to the user*/
import java.util.*;
import java.io.*;

public class Code8{
	public static void main(String[] Args){
		
		//Variables
		int sum = 0, mul = 1, x = 0, i;
		
		//Constructors
		Scanner scanner = new Scanner(System.in);
		
		//Initialization
		System.out.println("Hello, this program will read a text file with numbers, and show you the results of some operations done with them");
		
		/*I use the try - catch structure because when using files,
		the name or the path could be written wrong, so if the file
		can't be found, it will notify the user*/
		try{
			Scanner s = new Scanner(new File("C8.txt"));//this method reads the file, which is hardcoded
			/*In this array list I save the content of the file*/
			ArrayList<Integer> intList = new ArrayList<Integer>();
			/*This while-cycle checks if there are any more lines,
			and assigns the value of the integers to the list*/
			while (s.hasNextLine()){
				intList.add(s.nextInt());
				x = x + 1;//this is a counter, that tells me how many items are in the array
			}
			s.close();//This closes the file
			/*This for-cycle will sum all numbers and multiply them all*/
			for(i = 0; i < x; i++){
				sum = sum + intList.get(i);//sum
				mul = mul*intList.get(i);//multiplication
			}
			/*The collections method automatically sorts a list of
			integers in ascendant order, which makes this a whole
			lot easier*/
			Collections.sort(intList);
			
			//Results displayed to the user
			System.out.println("The result of the sum is: " + sum);
			System.out.println("The result of the multiplication is: " + mul);
			System.out.println("The highest number is: " + intList.get(x-1));
			System.out.println("The smallest number is: " + intList.get(0));
		} catch (IOException e){
			System.out.println("File name/path incorrect");//Exception if file is not found
		}
		
	}
	
}