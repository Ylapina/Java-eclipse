import java.util.Arrays;
import java.util.Scanner;

public class StudentScoreApp {

	public static void main(String[] args) {
		System.out.println("The Student Scores application");
		
		int numberOfStudents= Console.getInt("number of Studends: ",0,Integer.MAX_VALUE);
		
		Student[] students = new Student[numberOfStudents];
		for(int i=0; i< numberOfStudents; i++) {
			System.out.println("STUDENT"+(i+1));
			String lastName= Console.getString("Last Name: ");
			String firstName=Console.getString("First Name: ");
			int Score =Console.getInt("Score: ",0,100);
			Student student = new Student(lastName, firstName, Score);
			students[i]=student;
		}
		
		Arrays.sort(students);
		System.out.println("SUMMARY");
		for(Student s: students) {
			System.out.println(s);
		}
		System.out.println();
		
		
		
		
		
		

	}

}
