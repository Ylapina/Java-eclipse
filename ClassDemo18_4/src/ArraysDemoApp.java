import java.util.Arrays;

public class ArraysDemoApp {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		int [] numbers = new int[5];
		
		numbers[0] = 100;
		numbers[1]= 90;
		numbers[2]= 80;
		numbers[3] = 70;
		numbers[4] =60;
		
		for (int i=0; i <numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		String[] names = new String[7];
		names[0]= "Yelena";
		names[2]= "Nick";
		names[3]="Katrina";
		names[4]= "Eric";
		names[5]="Boris";
		
		for(int i=0; i<names.length; i++) {
			System.out.println("names[i]");
			
		}
		System.out.println("An array of prices..");
		double[] prices = {5750, 60.00, 45.67, 99.99};
		double sum = 0.0;
		for (int i=0; i <prices.length; i++) {
			System.out.println(prices[i]);
			sum += prices[i];
			
			prices[1]=5;
			prices[3]=2;
			
			for (double p: prices) {
				System.out.println(p);
			}
			int idx = Arrays.binarySearch(prices, 45.67);
			Arrays.sort(prices);
			System.out.println(idx);
			System.out.println("\nsorted list");
		    for(double p:prices) {
		    	
		    
		    System.out.println("p");
		}
		}
		double[] newArray = Arrays.copyOf(prices, 6);
		for(double p: newArray) {
			System.out.println(p);
		}
		System.out.println("Average price = " +sum/prices.length);
		} }

		

	


