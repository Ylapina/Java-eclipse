
public class PrimeNumberCkeckerApp {

	public static void main(String[] args) {
		System.out.println("Prime Number Checker\n");
		int number = Console.getInt("Please enter an integer between 1 and 100");

		PrimeNumberCkeckerApp primeNumberCheck = new PrimeNumberCkeckerApp();
		for (int ii = 0; ii < number; ii++) {
			boolean isPrimeNumber = primeNumberCheck.isPrime(ii);

			System.out.println(ii + " is " + (isPrimeNumber == true ? "prime." : "not prime."));
		}
	}

	private boolean isPrime(int numberToCheck) {
		boolean isPrime = true;

		if (numberToCheck < 2) {
			isPrime = false;
		}

		for (int ii = 2; ii < numberToCheck; ii++) {
			if (numberToCheck % ii == 0) {
				isPrime = false;
				break;
			}
		}

		return isPrime;
	}

}
