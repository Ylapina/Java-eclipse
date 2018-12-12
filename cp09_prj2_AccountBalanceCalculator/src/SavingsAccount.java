
public class SavingsAccount extends Account {
private double monthlyInterestRate;
private double monthlyInterestPmt;
/**
 * @param monthlyInterestRate
 */
public SavingsAccount(double monthlyInterestRate) {
	this.monthlyInterestRate = monthlyInterestRate;
}
/**
 * @return the monthlyInterestRate
 */
public double getMonthlyInterestRate() {
	return monthlyInterestRate;
}
/**
 * @param monthlyInterestRate the monthlyInterestRate to set
 */
public void setMonthlyInterestRate(double monthlyInterestRate) {
	this.monthlyInterestRate = monthlyInterestRate;
}
/**
 * @return the monthlyInterestPmt
 */
public double getMonthlyInterestPmt() {
	return monthlyInterestPmt;
}
/**
 * @param monthlyInterestPmt the monthlyInterestPmt to set
 */
public void setMonthlyInterestPmt(double monthlyInterestPmt) {
	this.monthlyInterestPmt = monthlyInterestPmt;
}
public void applyPmtToBalance() {
	setMonthlyInterestPmt(getBalance()*monthlyInterestRate);
	setBalance(getBalance() + monthlyInterestPmt);
}

}
