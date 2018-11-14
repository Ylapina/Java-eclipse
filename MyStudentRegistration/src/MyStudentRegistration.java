import java.util.Scanner;

public class MyStudentRegistration {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//declare each variable
	
		
		//Prompt user and take input
		
		System.out.println("Enter first name");
		String firstName = s.nextLine();
		System.out.println("Enter last name:");
		String lastName= s.nextLine();
		System.out.println("Enter year of birth");
		int yearOfBirth= s.nextInt();
		
		//use inputs
		
		System.out.println("Welcome " + firstName + " " + lastName +"!");
		System.out.println("Your registration is compelte!");
		System.out.println("Your temporary password is:" + "firstName"+ "lastName");
		
		
		
				
		

	}

}
