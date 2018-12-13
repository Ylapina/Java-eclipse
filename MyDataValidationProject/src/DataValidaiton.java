import java.util.Scanner;

public class DataValidaiton {

	public static void main(String[] args) {
		System.out.println("Welcome to the Area and Perimeter Calculator");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		String choice= "y";
		while (choice.equalsIgnoreCase("y")){
			
			double length = getDoubleWithinRange (sc,"Enter length: ",0, 1000000);
			
			
			double width = getDoubleWithinRange(sc,"Enter width:", 0,1000000);
			
			double area = width * length;
			double perimeter = 2 * width + 2 * length;
			System.out.println("Area: " + area);
			System.out.println("Perimeter: "+ perimeter);
			System.out.println();
			
			System.out.println("Cintunie? (y/n) ");
			choice = sc.next();
		}
			}
		public static double getDouble(Scanner sc, String prompt) {
		       double d = 0;
		       boolean isValid = false;
		       while (!isValid) {
		           System.out.print(prompt);
		           if (sc.hasNextDouble()) {
		               d = sc.nextDouble();
		               isValid = true;
		           } else {
		               System.out.println("Error! Invalid decimal value. Try again.");
		           }
		           sc.nextLine();  // discard any other data entered on the line
		       }
		       return d;
		   }

		   public static double getDoubleWithinRange(Scanner sc, String prompt,
		           double min, double max) {
		       double d = 0;
		       boolean isValid = false;
		       while (!isValid) {
		           d = getDouble(sc, prompt);
		           if (d <= min) {
		               System.out.println(
		                   "Error! Number must be greater than " + min);
		           } else if (d >= max) {
		               System.out.println(
		                   "Error! Number must be less than " + max);
		           } else {
		               isValid = true;
		           }
		       }
		       return d;
		   }
		

		}
		
		
		
		

	


