/*Name: Hugo David Franco Avila
Date: March - 15 - 2018
This class will test serialization
*/
package code4;

import java.io.*;
import java.util.*;

public class TestSerialization{
	public static void main(String[] args){
		
		//Variables
		String name1, name2, name3, ID1, ID2, ID3, fn;
		double av1, av2, av3;
		int i = 0;
		
		//Constructors
		Student[] student = new Student[3];
		File file;
		Scanner scanner = new Scanner(System.in);
		
		//Main
		System.out.println("Hello, write information for the Students you want to add to the system.");
		
		/*The block below will add the information to each 
		student object*/
		//Student 1
		System.out.println("Student 1");
		System.out.print("Name: ");
		name1 = scanner.nextLine();
		System.out.print("ID: ");
		ID1 = scanner.nextLine();
		System.out.print("Average: ");
		av1 = scanner.nextDouble();
		scanner.nextLine();
		//Student 2
		System.out.println("\nStudent 2");
		System.out.print("Name: ");
		name2 = scanner.nextLine();
		System.out.print("ID: ");
		ID2 = scanner.nextLine();
		System.out.print("Average: ");
		av2 = scanner.nextDouble();
		scanner.nextLine();
		//Student 3
		System.out.println("\nStudent 3");
		System.out.print("Name: ");
		name3 = scanner.nextLine();
		System.out.print("ID: ");
		ID3 = scanner.nextLine();
		System.out.print("Average: ");
		av3 = scanner.nextDouble();
		scanner.nextLine();
		
		/*Creation of student objects using the previously
		captured information*/		
		student[0] = new Student(name1,ID1,av1);
		student[1] = new Student(name2,ID2,av2);
		student[2] = new Student(name3,ID3,av3);
		
		System.out.println("How would you like to name the file where the students' information will be stored?");
		fn = scanner.nextLine();//Name of the created file
		file = new File(fn);
		
		/*This block will take the objects and serialize them to
		a file*/
		while(i < 3){
			file.serialize(student[i]);
			i++;
		}
		
		System.out.println("Student information is securely stored in a file called " + file.getName() + ".ser");

	} 
}
