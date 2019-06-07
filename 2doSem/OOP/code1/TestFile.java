/*Name: Hugo David Franco Avila
Date: March - 6 - 2018
This class tests the File class
*/
package code1;

import java.io.*;
import java.util.*;

public class TestFile{
	public static void main(String[] args){
		//Variables
		String ans, name1, temp;
		char a = 'y';
		int num, x = 0, i = 0, p = 0, n = 0;
		
		//Constructors
		ArrayList<Integer> intList = new ArrayList<Integer>();
		ArrayList<String>list = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		
		
		//Initialization
		System.out.println("This program will save a list of numbers in a file and then display it to the user");
		System.out.println("What is the first number you want to add?");
		num = s.nextInt();//first number, mandatory
		intList.add(num);//add to dynamic array
		s.nextLine();
		while(a == 'y'){
			System.out.println("Would you like to add another number? (Y/N)");
			ans = s.nextLine();
			ans = ans.toLowerCase();
			a = ans.charAt(0);//checks if user wants another number or not
			if(a == 'y'){
				System.out.println("Write the number");
				num = s.nextInt();
				intList.add(num);
				s.nextLine();
				x = x + 1; //this tells me the index of the last number written by the user
			}
		}
		Collections.sort(intList);//sorts in ascendant order
		System.out.println("How would you like to name your file. Do not add the .txt extension at the end ");
		name1 = s.nextLine();//name of the file to be created
		
		File file = new File(name1);//Creation of object file
		/*This while loop will write the content of the arraylist
		into the file*/
		while (i <= x){
			temp = Integer.toString(intList.get(i));
			file.write(temp);//Method defined in class file
			i++;
		}
		
		file.read(list);//This will read the file and add its content to an arraylist
		x = list.size();//Number of objects in the list
		intList.clear();//clear the content in intList
		while(n < x){
				try{
					p = Integer.parseInt(list.get(n));//change to int the numbers in the file
					intList.add(p);//add numbers to array list
					n++;
				
				} catch(NumberFormatException e){
					n++;
					System.out.println("ERROR!");					
				}
			}		
		Collections.sort(intList);//sort in ascendant order
		
		//The block below, clears list and then adds the whole list of numbers
		i = 0;
		list.clear();
		while (i < x){
			list.add(Integer.toString(intList.get(i)));
			i++;
		}
		
		
		i = 0;
		file.deleteContent();//Erase the content inside the file
		while (i < x){
			temp = Integer.toString(intList.get(i));
			file.write(temp);//Write the new list of numbers
			i++;
		}
		
		file.read(list);//read the updated file
		i = 0;
		while(i < x){
				System.out.println(list.get(i));//print the content of the file to the console
				i++;
		}	
		
	}
}



