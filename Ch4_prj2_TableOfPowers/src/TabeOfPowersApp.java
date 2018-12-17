import java.util.Scanner;

public class TabeOfPowersApp {
    
    public static void main(String[] args) {
        // display a welcome message
        System.out.println("Welcome to the Squares and Cubes table\n");

        // create the Scanner object
        Scanner sc = new Scanner(System.in);

        // perform conversions until choice isn't equal to "y" or "Y"
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get an int from the user
            System.out.print("Enter an integer: ");
            int num = sc.nextInt();
            System.out.println();

            // define the table and append the header rows
            String table = "";
            table += "Number\tSquared\tCubed\n";
            table += "======\t=======\t=====\n";

            // append the rest of the rows to the table
            for (int i = 1; i <= num; i++) {
                int square = i * i;
                int cube = i * i * i;
                table += i + "\t" + square + "\t" + cube + "\n";
            }

            // display the table
            System.out.println(table);

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
        sc.close();        
    }
}


				
				
			
		
