import java.text.NumberFormat;
import java.util.Scanner;

public class TravelTimeCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Travel Time Calculator");
		String choice = "y";
		while (choice.equalsIgnoreCase("Y")) {
			System.out.println("Enter miles: ");
			double miles = sc.nextDouble();
			
			System.out.println("Enter miles per hour");
			double milesPerHour= sc.nextDouble();
			System.out.println("Estimated travel time");
			System.out.println();
			
			double hours = miles/milesPerHour;
			
			long result= Math.round(hours);
			System.out.println("Hours:  "+ hours);
			
			System.out.println("Cintunie? (y/n) ");
			choice = sc.next();
			
			
			
			
			
			
		}
		

	}

}
