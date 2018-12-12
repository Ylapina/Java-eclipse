import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

public class InterestCalculator {

	private static final int HALF_UP = 0;

	public static void main(String[] args) {
		System.out.println("Welcome to the Interest Calculator");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while(choice.equalsIgnoreCase("y")) {
			
			System.out.println("Enter loan amount: ");
			BigDecimal loanAmount = sc.nextBigDecimal();
			System.out.println("Enter interest rate: ");
			BigDecimal interestRate = sc.nextBigDecimal();
			
			BigDecimal interestAmount= loanAmount.multiply(interestRate);
			
			interestAmount= interestAmount.setScale(HALF_UP);
			
			NumberFormat loanAmt = NumberFormat.getCurrencyInstance();
			NumberFormat IntRate= NumberFormat.getPercentInstance();
			
			IntRate.setMinimumIntegerDigits(3);
			
			System.out.println("Loan Amount: "+ loanAmt.format(loanAmount));
			System.out.println("Interest rate: "+IntRate.format(interestRate) );
			System.out.println("Interest: "+ loanAmt.format(interestAmount));
			
			
			
		}

	}

}
