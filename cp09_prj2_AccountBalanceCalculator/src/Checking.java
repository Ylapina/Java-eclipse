
public class Checking extends Account {
private double monthlyFee;

/**
 * @param monthlyfee
 */
public Checking(double monthlyFee) {
	super();
	this.monthlyFee = monthlyFee;
}


public double getMonthlyfee() {
	return monthlyFee;
}


public void setMonthlyfee(double monthlyFee) {
	this.monthlyFee = monthlyFee;
}
public void substractMonthlyFeeFromBalance() {
	setBalance(getBalance()- monthlyFee);
}
}
