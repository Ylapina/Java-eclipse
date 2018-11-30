import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class InterestCalculator {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 String choice = "y";
		 while(choice.equalsIgnoreCase("y")){
			System.out.println("Welcome to the Interest Calculator");
			System.out.println();
			System.out.println("Enter loan amount:");
			BigDecimal loanAmount= sc.nextBigDecimal();
			System.out.println("Enter interest rate:");
			BigDecimal rate = sc.nextBigDecimal();
			
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			System.out.println("Loan Amount:"+ currency.format(loanAmount));
			
			NumberFormat percent = NumberFormat.getPercentInstance();
			percent.setMinimumFractionDigits(3);
		
			System.out.println("Interest Rate:"+ percent.format(rate));
			System.out.println("Interest:"+currency.format(loanAmount. multiply (rate)));
			System.out.println("Continue? y/n");
			choice= sc.next();
			
			 
			 
			 

	  }
	}
}
