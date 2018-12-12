import java.util.Scanner;

public class GuessingWordApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String secretWord = "cat";
		String guess= "";
		int guessLimit = 3;
		int guessCount=0;
		boolean outOfGuesses = false;
		
		while(!guess.equals(secretWord) && !outOfGuesses) {
			
			if (guessCount< guessLimit) {
				System.out.println("Enter guess word");
				guess= sc.nextLine();
				guessCount++;
			}
			else {
				outOfGuesses= true;
			}
				
		}
		if(outOfGuesses) {
			System.out.println("You lose!No more guesses");
		}else {
			System.out.println("You win!");
		}
		
	}

}
