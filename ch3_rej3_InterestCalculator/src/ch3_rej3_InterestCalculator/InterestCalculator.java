package ch3_rej3_InterestCalculator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class InterestCalculator {

	public static void main(String[] args) {
		System.out.println("Welcome to the Interest Calculator");
		Scanner sc = new Scanner (System.in);
		
		String choice= "y";
		while(choice.equalsIgnoreCase("Y")){
			
			System.out.println("Enter loan amount: ");
			BigDecimal amt = sc.nextBigDecimal();
			
			System.out.println("Enter interest rate: ");
			BigDecimal rate = sc.nextBigDecimal();
			
			BigDecimal interestAmt= amt.multiply(rate);
			//we have reassign interestAmt because setScale returns a new
			//big decimal ..it does not affect the variable it is called on
			interestAmt=interestAmt.setScale(2, RoundingMode.HALF_UP);
			
			NumberFormat cInstance = NumberFormat.getCurrencyInstance();
			NumberFormat pInstance = NumberFormat.getPercentInstance();
			
			pInstance.setMinimumFractionDigits(3);
			
			System.out.println("Loan Amount: "+ cInstance.format(amt));
			System.out.println("Interest rate:"+ pInstance.format(rate));       
			System.out.println("Interest: "+ cInstance.format(interestAmt));

			
			
			
			
			System.out.println("Continue?");
			choice = sc.next();
			
			
			
			
		}
				
		
		
		
		
		System.out.println("Bye!");
		

	}

}
