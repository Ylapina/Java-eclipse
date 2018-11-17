import java.util.Scanner;

public class TabeOfPowersApp {

	public static void main(String[] args) {
		String choice = "y";
		while (choice.equalsIgnoreCase("Y")) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Welcome to the Squares and Cubes table");
		System.out.println("Enter an integer: ");
		int num = sc.nextInt();
		//create the header row and add it to the table
		String table = "";
		String headerRow = "Number   "+ "Squared  "+ "Cubed";
		
		table += headerRow + "\n";
		
		
		for(int i= 1; i<=num; i++){
			int squared = i*i;
			int cubed = i*i*i;
			System.out.println(i+"\t"+squared+ "\t"+ cubed);
			System.out.println(table);
			System.out.println("Continue? (y/n)");
			

				
				
			
		}
           
				
		
		
		

	}
	}
}
