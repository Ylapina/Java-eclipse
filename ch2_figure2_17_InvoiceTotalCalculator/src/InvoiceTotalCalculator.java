import java.util.Scanner;

public class InvoiceTotalCalculator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")){
		System.out.println("Enter subtotal");
		Double subTotal = sc.nextDouble();
		// get the discount percent
		Double discountPercent;
		if(subTotal>=200) {
			discountPercent= 0.2;
		}else if(subTotal >=150) {
			discountPercent= 0.1;
			}else {
				discountPercent= 0.00;
			}
				//calculate discount amount
				
				double discountAmount = subTotal* discountPercent;
				double InvoiceTotal = subTotal - discountAmount;
				//display the results
				System.out.println("Discount Percent: "+discountPercent);
				System.out.println("Discount Amount: "+discountAmount);
				System.out.println("Invoice Total: "+InvoiceTotal);
				System.out.println("Continue? y/n");
				choice = sc.next();
				
				
				
		
	}
	}
}

