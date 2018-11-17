import java.math.BigDecimal;
import java.util.Scanner;
import java.text.NumberFormat;
public class TipCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("Y")) {

			System.out.println("Tip calculator");
			System.out.println("Cost of meal: ");
			BigDecimal costOfMeal = sc.nextBigDecimal();

			for(double i = 0.15; i<=0.25; i+= 0.5) {
				BigDecimal tipPercent = new BigDecimal(i);
				BigDecimal tipAmount = costOfMeal.multiply(tipPercent);
				BigDecimal totalAmount = costOfMeal.multiply(tipPercent).add(costOfMeal);
				NumberFormat currency = NumberFormat.getCurrencyInstance();
				String message = "Tip amount: " + currency.format(tipAmount) + "\n" + "Total amount" + currency.format(totalAmount);
				System.out.println(message);
				System.out.println("Continue? y/n");
				choice = sc.next();
		}

	}
	}
}
