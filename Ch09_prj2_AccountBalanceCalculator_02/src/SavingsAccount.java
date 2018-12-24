
public class SavingsAccount extends Account {
	private double monthlyInterestRate;
	private double MonthlyInterestPayment;
	
	public SavingsAccount(double monthlyInterestRate) {
		this.monthlyInterestRate = monthlyInterestRate;
	}
	
	

	public double getMonthlyInterestRate() {
		return monthlyInterestRate;
	}

	public void setMonthlyInterestRate(double monthlyInterestRate) {
		this.monthlyInterestRate = monthlyInterestRate;
	}

	public double getMonthlyInterestPayment() {
		return MonthlyInterestPayment;
	}

	public void setMonthlyInterestPayment(double monthlyInterestPayment) {
		MonthlyInterestPayment = monthlyInterestPayment;
	}
	
	public void applyPaymentToBalance() {
		setMonthlyInterestPayment(getBalance()*monthlyInterestRate);
		setBalance(getBalance() + MonthlyInterestPayment);
	}
	
	
	
	

}
