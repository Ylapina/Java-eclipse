import java.awt.Choice;
import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class GradeConveter {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Letter Grade Converter");
		Scanner sc = new Scanner(System.in);}
		
		String choice = "y";{
		while (choice.equalsIgnoreCase("y"));{
		
		int numericalGrade = 60;
		if (numericalGrade >=67)
			System.out.println("Letter Grade: D");
		else if (numericalGrade >=79)
			System.out.println("Letter Grade: C");
		else if (numericalGrade >=87)
			System.out.println("Letter Grade: B");
		else if (numericalGrade >=100)
			System.out.println("Letter Grade: A");
		
		System.out.println("Enter numerical grade: ");
	
		System.out.println("Letter Grade" + numericalGrade);
		
		System.out.println("Cintunie? (y/n) ");
		Scanner sc = null;
		choice = sc.next();
		System.out.println("Bye!");
		}
		

	}

}
