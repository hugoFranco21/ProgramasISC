/*Name: Hugo David Franco Avila
Date: Feb - 2 - 2018
This program will take input from the user, save it to a list
and then it will order the content and create a file where this information
is going to be written, if written on the same file it will add lines
to it*/
import java.util.*;
import java.io.*;

public class Code9{
	public static void main(String[] Args){
		
		//Variables
		String ans, name, temp;
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
		name = s.nextLine();//name of the file to be created
		
		/*the block below, will add lines to the file specified
		by the user, or if the file doesn't exist, it will create one
		with the name specified by the user*/
		try(FileWriter fw = new FileWriter(name + ".txt", true);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter out = new PrintWriter(bw))//adds the println() method
		{
			while(i <= x){//use <= operator because x = last index
				/*I use the Integer.toString method because I couldn't
				find a way to write the inList without {[]}*/
				temp = Integer.toString(intList.get(i));
				out.println(temp);//writes to the file
				i++;
			}
			intList.clear();//this will erase all the numbers inside intList
		} catch (IOException e) {
			//This won't trigger, probably
		}
		
		/*The block below, reads the recently created/modified
		file, and sends its content to an ArrayList, I use this
		because if the file was modified, I need to sort the numbers
		taking into account the ones that were already
		inside the file*/
		try{
			Scanner f = new Scanner(new File(name + ".txt"));//this method reads the file
			/*In this array list I save the content of the file*/
			x = 0;//restart x
			/*This while-cycle writes all the lines of the file 
			into the array list*/
			while (f.hasNextLine()){
				list.add(f.nextLine());
				x = x + 1;//number of items in the file
			}
			f.close();//This closes the file
			/*This while-cycle will read the content of the ArrayList
			and try to convert it to an integer, because it is
			in String form, and it will add it to intList, which
			we previously cleared*/
			while(n < x){
				try{
					p = Integer.parseInt(list.get(n));
					intList.add(p);
					n++;
				
				} catch(NumberFormatException e){
					n++;//this will not happen		
				}
			}		
			Collections.sort(intList);//sort in ascendant order
		} catch (IOException e){
			System.out.println("File name/path incorrect");//this won't happen
		}

		/*The block below, clears list and then writes the updated
		list of numbers*/
		i = 0;
		list.clear();
		while (i < x){
			list.add(Integer.toString(intList.get(i)));
			i++;
		}
		
		/*The block below, will overwrite the originally created/modified
		file, so all the numbers inside it are in order*/
		try(FileWriter fw = new FileWriter(name + ".txt");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter out = new PrintWriter(bw))
		{
			i = 0;
			while(i < x){
				temp = list.get(i);
				out.println(temp);//writes inside file
				i++;
			}
			list.clear();//erases every item inside list
		} catch (IOException e) {
			//not triggering
		}
		
		/*This block below, is what I use to print in the console
		the content of the file*/
		try{
			Scanner l = new Scanner(new File(name + ".txt"));//this method reads the file
			x = 0;
			while (l.hasNextLine()){
				list.add(l.nextLine());//adds new items to the list array
				x = x + 1; //number of items 
			}
			l.close();//This closes the file
			i = 0; //restart i
			/*this block prints the content of the file to the console*/
			while(i < x){
				System.out.println(list.get(i));
				i++;
			}				
		} catch (IOException e){
			System.out.println("File name/path incorrect");//this won't trigger
		}
	}
}
