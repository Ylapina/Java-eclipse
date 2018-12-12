
public class Customer extends Person {
	
	private String number;
	
	public Customer(String firstName, String lastName, String number) {
		super(firstName, lastName);
	    this.number= number;	
	}
	
	public String getCustomerNumber() {
		return number;
	}
	public void setCustomerNumber(String number) {
		this.number = number;
	}
	public String getDisplayText() {
		return super.toString() + "\nCustomer Number: " + number + "\n";
	}


}
