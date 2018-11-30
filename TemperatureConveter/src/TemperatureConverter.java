import java.math.BigDecimal;
import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the temperature conveter");
		String choice="y";
		while(choice.equalsIgnoreCase("y")) {
			System.out.println("Enter degrees in Fahrenheit: ");
			double degreesinFahrenheit = sc.nextDouble();
			
			double degreesInCelcius= 0.00;
			degreesInCelcius= (degreesinFahrenheit-32)*5/9;
			degreesInCelcius=(double)Math.round(degreesInCelcius*100)/100;
			
		System.out.println("Degrees in celcius:"+degreesInCelcius);
		System.out.println("Continue? y/n");
		choice= sc.next();
		
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
			
				
		
		

	}

}
