import java.util.Scanner;

public class RectangleCalculator {

	public static void main(String[] args) {
		System.out.println("Welcome to the Area and Perimeter Calculator");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		String choice= "y";
		while(choice.equalsIgnoreCase("y")) {
			
			System.out.println("Enter length: ");
			double length = sc.nextDouble();
			System.out.println("Enter width: ");
			double width = sc.nextDouble();
			
			double area = width * length;
			double perimetr= 2 * width + 2 * length;
			
			System.out.println("Area: "+area);
			System.out.println("Perimetr: "+ perimetr);
			System.out.println("Continue? y/n");
			choice = sc.next();
			System.out.println();
			
			
			
			
			
		}

	}

}
