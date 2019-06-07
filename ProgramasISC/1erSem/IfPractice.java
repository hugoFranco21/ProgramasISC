import java.util.Scanner;

public class IfPractice{
	public static void main (String[] Args){
		
		int num, grade, a, b, c;
		
		//First part
		Scanner dec = new Scanner(System.in);
		System.out.println("Enter an integer:");
		num = dec.nextInt();
		if(num % 2 == 0){
			System.out.println(+ num +" is an even number");
		} else{
			System.out.println(+ num + " is not an even number");
		}
		
		//Second part 
		System.out.println("Insert the grade you got on your paper:");
		grade = dec.nextInt();
		if(grade == 100){
			System.out.println("Excelent");
		} else if (grade<100 && grade >=80){
			System.out.println("Very good");
		} else if (grade>=70 && grade <100){
			System.out.println("Good");
		}
		else if(grade<70 && grade>=0){
			System.out.println("Failed");
		}
		else if(grade>100 || grade<0){
			System.out.println("Grade introduced is not correct, please try again later");
		}
			
		//Third part		
		System.out.println("Introduce three integer numbers");
		System.out.println("A");
		a = dec.nextInt();
		System.out.println("B");
		b = dec.nextInt();
		System.out.println("C");
		c = dec.nextInt();
		if (a == b ){
			if (a == c){
				System.out.println(+ a + " is the biggest number. And it is represented in A, B and C");
			}
			else if(a > c){
				System.out.println(+ a + " is the biggest number. And it is represented in A and B");
			}
			else{
				System.out.println(+ c +" is the biggest number. It is represented in C");
			}
		}
		else if (a == c && b < a){
			System.out.println(+ a + " is the biggest number. It is represented in A and C");
		}	
		else if (b == c && b > a){
			System.out.println(+ b + " is the biggest number, and it is represented in B and C");
		}
		else if (b > a && b > c){
			System.out.println(+ b + " is the biggest number. It is represented in B");
		} 
		else if (a > b && a > c){
			System.out.println(+ a + " is the biggest number. It is represented in A");
		}
		else{
			System.out.println(+ c + " is the biggest number. It is represented in C");
		}		
	}
}
