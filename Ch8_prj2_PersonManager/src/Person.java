
public class Person {
	private String firstName;
    private String lastName;

    /**
     * @param firstName
     * @param lastName
     */
    public Person(String firstName, String lastName) {
    	this.firstName = firstName;
    	this.lastName = lastName;
    }
    
    
    
  
  public String getFirstName() {
      return firstName;
  }
  public void setFirstName(String first) {
	  this.setFirstName(first);
  }
  public String getLastName() {
	  return lastName;
  }
  public void setLastName(String lastName) {
	  this.lastName= lastName;
  }
  public String toString() {
		return "Name: " + firstName + " " + lastName;
	}
  
  
  
}

