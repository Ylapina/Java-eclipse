import java.util.Scanner;

public class TestScoreApp {

	public static void main(String[] args) {
		System.out.println("Enter the scores that range from 0 to 100");
		System.out.println("To end the program, enter 999");
		System.out.println();
		
		//initialize variables and create a scanner object
		int scoreCount= 0;
		int scoreTotal=0;
		int testScore=0;
		Scanner sc = new Scanner(System.in);
		//get a series of test scores from the user
		
		while(testScore <=100) {
			//get the input from the user
			System.out.println("Enter score: ");
			testScore = sc.nextInt();
			//accumulate score count and score total
			if(testScore<=100) {
				scoreCount = scoreCount +1;
				scoreTotal = scoreTotal + testScore;
			}
		}
		double averageScore = (double)scoreTotal / scoreCount;
		String message = "\n"
				+"Score coount: "+ scoreCount + "\n"
				+"Score total: "+ scoreTotal + "\n"
				+"Average score: "+ averageScore + "\n";
		System.out.println(message);
		
		
				
		

	}

}
