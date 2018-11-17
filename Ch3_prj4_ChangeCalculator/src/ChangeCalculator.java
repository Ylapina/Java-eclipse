import java.util.Scanner;

public class ChangeCalculator {

	public static void main(String[] args) {
		System.out.println("Welcome to the Change Calculator");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("Y")){
			System.out.println("Enter number of cents (0-99):");
			double numberOfCents = sc.nextDouble();
			double quarter = 25;
			double dime = 10;
			double nickel= 5;
			double penny = 1;
			
			 double totalQuarter = (numberOfCents / quarter);
			 numberOfCents %= quarter;
			 double totalDime = (numberOfCents/ dime);
			 numberOfCents%= dime;
			 double totalNickel = (numberOfCents / nickel);
			 numberOfCents%=  nickel;
			 double totalPenny = (numberOfCents / penny);
			 numberOfCents%=  penny;
			 
			 System.out.println(totalQuarter);
			 System.out.println(totalDime);
			 System.out.println(totalNickel);
			 System.out.println(totalPenny);





			 
            
			
			
			
		}
				
	}

}
