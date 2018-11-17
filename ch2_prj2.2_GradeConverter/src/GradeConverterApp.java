import java.util.Scanner;

public class GradeConverterApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice= "y";
		while(choice.equalsIgnoreCase("y")) {
			System.out.println("Welcome to the Letter Grade Converter");
			System.out.println();
			System.out.println("Enter numerical grade: ");
			double numericalGrade = sc.nextDouble();
			String letterGrade = "";
			if(numericalGrade<60) {
				letterGrade = "f";
				} else if(numericalGrade <= 60) {
					letterGrade = "D";
				}else if(numericalGrade <= 67) {
					letterGrade = "C";
				}else if(numericalGrade <= 80) {
					letterGrade = "B";
				}else if(numericalGrade <= 88) {
					letterGrade = "A";
				}
					System.out.println("Letter Grade"+letterGrade);
					System.out.println("Continue? y/n");
					choice= sc.next();
		}
	}
}
