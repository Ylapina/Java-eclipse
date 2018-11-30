import java.util.Scanner;

public class MyRectanglecaculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Welcome to my Invoice Calculator");
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter subtotal");
			double subtotal = sc.nextDouble();
			// get the discount percent
			double discountPercent = 0;
			if (subtotal>= 150) {
				discountPercent = 0.2;
			}else if (subtotal <150) {
				discountPercent= 0.1;
			}
			 
			double discountAmount= 0.00;
			discountAmount= subtotal* discountPercent;
			double invoiceTotal=0.00;
			invoiceTotal= subtotal-discountAmount;
			
			System.out.println("Discount percent:"+discountPercent);
			System.out.println("Discount amount:"+ discountAmount);
			System.out.println("Invoice total"+invoiceTotal);
			System.out.println("Continue? y/n");
			choice= sc.next();
			System.out.println();
			 
				
			
			
			
			
			
			
		}
		
		
		
		}
	
	}
		
				

	


