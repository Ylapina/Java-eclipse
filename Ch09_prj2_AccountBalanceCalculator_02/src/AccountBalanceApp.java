
public class AccountBalanceApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Account application");
		System.out.println();
		
		CheckingAccount ch= new CheckingAccount(0);
		ch.setBalance(1000);
		SavingsAccount sa = new SavingsAccount(0);
		sa.setBalance(1000);
		System.out.println("Starting Balances");
		displayBalances(ch,sa);
		System.out.println("Enter the transactions for the month");
		
		Console console = new Console();
		String choice = "y";
		while(choice.equalsIgnoreCase("y")) {
			String transType = console.getString("Withdraw or deposit? (w/d): ");
			String accType = console.getString("Checking or savings? (c/s)");
			double amount = console.getDouble("Amount? ");
			
			//update the balance
			Account a = null;
			if(accType.equalsIgnoreCase("c")){
				a=ch;
			}
			else if(accType.equalsIgnoreCase("s")){
				a=sa;
				
			}
			if(transType.equalsIgnoreCase("w")){
				a.withdraw(amount);
			}else
				a.deposit(amount);
			
			choice = console.getString("Continue? y/n");
		}
			//apply interest and fees
			ch.substractMonthlyFeefromBalance();
			sa.applyPaymentToBalance();
			
			System.out.println("Monthly Payments and Fees");
			System.out.println("Cheking fee: "+ch.getMonthlyFee());
			System.out.println("Savings interest payment:  "+ sa.getMonthlyInterestPayment());
			
			
			System.out.println("Final Balances");
			System.out.println("Checking"+ ch.getBalance());
			System.out.println("Savings: "+sa.getBalance());
			
		}
		private static void displayBalances(CheckingAccount ch, SavingsAccount sa) {
			System.out.println("Checking: "+ch.getBalance());
			System.out.println("Savngs: "+ sa.getBalance());
	}
	 }

