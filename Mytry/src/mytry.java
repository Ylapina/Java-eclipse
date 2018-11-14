import java.util.Scanner;

public class mytry {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Student registration Form");
		System.out.println( );
		System.out.println("Enter first name");
		String firstName= s.nextLine();
		System.out.println("Enter last name");
		String lastName= s.nextLine();
		System.out.println("Enter date of birth");
		int yearOfBirth = s.nextInt();
		
		System.out.println("Welcome"+ firstName+ lastName+ "!");
		System.out.println("Your tr=emporary password is:"+ lastName+"*");
		System.out.println("Bye");
		
		

	}

}
