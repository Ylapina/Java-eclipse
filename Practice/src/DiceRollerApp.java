import java.util.Scanner;

public class DiceRollerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Dice Roller!");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		//create the dice object
		Dice dice = new Dice();
		//start the dice rolling
		System.out.println("Roll the dice? y/n");
		String choice = sc.next();
		 // continue until choice isn't equal to "y" or "Y"
        while (choice.equalsIgnoreCase("y")) {
            dice.roll();
            dice.printRoll();

            // see if the user wants to continue
            System.out.print("Roll again? (y/n): ");
            choice = sc.next();
        }
        sc.close();        
      }
	}


