
public class Employee extends Person {
	private String ssn;
	
	
	public Employee(String first, String last, String ssn) {
		super(first, last);
		this.ssn = ssn;
		
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn= ssn;
	}
	public String getDisplayText() {
		return super.toString() + "\nSocial Security Number: " + ssn + "\n";
	}
	

}
