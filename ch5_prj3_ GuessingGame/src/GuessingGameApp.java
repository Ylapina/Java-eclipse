import java.util.Scanner;

public class GuessingGameApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the guess the number game");
		Scanner sc = new Scanner(System.in);
		String choice ="y";
		while(choice.equalsIgnoreCase("y")) {
			System.out.println("I am thinking of a number from 1 to 100.\n"+"Try to guess it.\r\n");
			System.out.println("Enter a number: ");
			int guess = 0;
			
			
			
			
			System.out.println();
			choice = getStringValues(sc, "Try Again?", "y", "n");
			
		}
				
		
		
		
		
		System.out.println("Bye");

	}
	private static String getStringvalues(Scanner sc, String prompt, String val1, String val2) {
		String retStr = "";
		boolean isValid = false;
		
		while(!isValid) {
			System.out.println(prompt);
			retStr = sc.next();
			if(retStr.equalsIgnoreCase(val1) || retStr.equalsIgnoreCase(val2))
				isValid = true
		}
		else {
			System.out.println("Invalid entry. Try again");
		}
	}

}
