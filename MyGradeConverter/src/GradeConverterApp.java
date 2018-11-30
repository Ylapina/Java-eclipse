import java.util.Scanner;

public class GradeConverterApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Letter Grade Converter");
		System.out.println();
		String choice = "y";
		while(choice.equalsIgnoreCase("y")) {
			System.out.println("Enter numerical grade: ");
			double numericalGrade = sc.nextDouble();
			String letterGrade = "a";
			if(numericalGrade >= 88) {
				letterGrade = "A";
			}else if (numericalGrade >= 80) {
				letterGrade = "B";
			}else if (numericalGrade > 67) {
				letterGrade = "C";
		}else if (numericalGrade > 60) {
			letterGrade = "D";
		}else if (numericalGrade < 60) {
			letterGrade = "F";
		}System.out.println("Letter grade: "+ letterGrade);
		System.out.println("Continue? y/n");
		choice = sc.next();
		

	}
  }
}
