import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the Temperature Converter");
		String choice = "y";
		while (choice.equalsIgnoreCase("Y")) {
			System.out.println("Enter degrees in Fahrenheit: ");
			double fahrenheit = sc.nextDouble();
			
		    double celsius = (fahrenheit-32) * 5/9;
		    
		    System.out.println("Degrees in Celsius: "+ celsius);
			System.out.println("Cintunie? (y/n) ");
			choice = sc.next();
			
			
			
			
			
			
			
		}
			
				
		
		

	}

}
