
public class Person {

	private String FirstName;
	private String LastName;
	private double HourlyRate;
	/**
	 * 
	 */
	public Person() {
		this.FirstName = "John";
		this.LastName = "Doe";
		this.HourlyRate = 10; 
	}
	/**
	 * @param firstName
	 * @param lastName
	 * @param hourlyRate
	 */
	public Person(String firstName, String lastName, double hourlyRate) {
		FirstName = firstName;
		LastName = lastName;
		HourlyRate = hourlyRate;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return FirstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return LastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	/**
	 * @return the hourlyRate
	 */
	public double getHourlyRate() {
		return HourlyRate;
	}
	/**
	 * @param hourlyRate the hourlyRate to set
	 */
	public void setHourlyRate(double hourlyRate) {
		HourlyRate = hourlyRate;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [FirstName=" + FirstName + ", LastName=" + LastName + ", HourlyRate=" + HourlyRate + "]";
	}
	public double getPayment (int hours) {

       return this. HourlyRate * hours;}
}
