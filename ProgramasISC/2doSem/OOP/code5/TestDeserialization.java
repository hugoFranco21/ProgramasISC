/*Name: Hugo David Franco Avila
Date: March - 18 - 2018
This class will test serialization
*/
package code5;

import code4.Student;

import java.io.*;
import java.util.*;

public class TestDeserialization{
	public static void main(String[] args){
		
		//Variables
		String name1, name2, name3, ID1, ID2, ID3, fn, opc, att, name, ID;
		double av1, av2, av3, av;
		int i = 0, x;
		File ser, des;
		char sec;
		boolean z = true;
		
		//Constructors
		Student[] student = new Student[3];//Array of 3 students
		Scanner scanner = new Scanner(System.in);
		ArrayList<Student> sList = new ArrayList<Student>();//ArrayList that I'm serializing
		ArrayList<Object> oList = new ArrayList<Object>();//ArrayList where my deserialized objects are going to go to
		
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
		
		System.out.println("How would you like to name the file?");
		fn = scanner.nextLine();//file name
		
		ser = new File(fn);//creation of serializer
		des = new File(fn);//creation of deserializer
		
		/*This block will take the objects and sadd them to
		a list*/
		while(i < 3){
			sList.add(student[i]);
			i++;
		}
		
		ser.serialize(sList, false);//List is serialized
		
		System.out.println("Student information is securely stored in a file called " + ser.getName() + ".ser");
		/*emptying student objects*/		
		student[0] = null;
		student[1] = null;
		student[2] = null;
		
		sList.clear();/*Emptying student list, this proofs I'm not
					using the original list later in the class,
					but the one I deserialized*/
		
		i = 0;//initializing i
		System.out.println("List has been cleared, deserialization will begin\n");
		
		/*Casting the deserialized object to an arraylist*/
		oList = (ArrayList) des.deSerialize();
		
		/*The block below will cast each member of the object
		list to a student type, and add them to the student list*/
		while(i < oList.size()){
			student[i] = (Student) oList.get(i);//casting to student type
			sList.add(student[i]);
			i++;
		}
		
		System.out.println("File has been deserialized, objects' information will be printed on screen\n");
		/*The block below will print the deserialized information
		in the console*/
		for( i =0; i < sList.size() ; i++){
			System.out.println("Object " + (i+1));
			System.out.println(sList.get(i).getData() + "\n");
		}
		
		sList.clear();//Clearing student list
		
		/*This block is the one that adds the editing functionality,
		using the setters and user input to modify the selected
		attributes*/
		do{
			System.out.println("Would you like to edit any object? (Y/N)");
			opc = scanner.nextLine();
			sec = opc.charAt(0);
			switch(sec){
				case 'y':
				case 'Y': 
					System.out.println("Which object would you like to modify? (1-3)");
					x = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Which attribute would you like to change? (Name, ID, Average)");
					att = scanner.nextLine();
					if(att.equalsIgnoreCase("name")){//change name
						System.out.println("Write the name you want to change it to");
						name = scanner.nextLine();
						student[x-1].setName(name);
					} else if(att.equalsIgnoreCase("id")){//change id
						System.out.println("Write student's new ID");
						ID = scanner.nextLine();
						student[x-1].setStudentID(ID);
					} else if(att.equalsIgnoreCase("average")){//change average
						System.out.println("Write the student's new average");
						av = scanner.nextDouble();
						scanner.nextLine();
						student[x-1].setAverage(av);
					} else{
						System.out.println("The attribute you entered is not valid, please check your spelling");
					}
				break;
					
				case 'n':
				case 'N':
					System.out.println("\nUpdated list will be serialized with the same file name");
					z = false;//Exit condition
					break;
					
				default:
					System.out.println("Please enter your option again");
			}
		} while(z);
		
		/*Update student list with the new attributes*/
		for(i = 0; i < 3; i++){
			sList.add(student[i]);
		}
		
		System.out.println("This is the data that will be serialized\n");
		
		/*Print content of the objects*/
		for( i = 0; i < sList.size() ; i++){
			System.out.println("Object " + (i+1));
			System.out.println(sList.get(i).getData() + "\n");
		}
		
		ser.serialize(sList, false);//Serialize the updated list, overwrite old list
		System.out.println("Student information is securely stored in a file called " + ser.getName() + ".ser");
		
	} 
}
