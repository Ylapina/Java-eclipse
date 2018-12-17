
public class Person {
	 private  String firstName;
	 private String lastName;
	 private int age;
	 
	 public String getFirstName() {
			return firstName;
		}
		
		public void setFirstName(String firstName) {
			if(firstName.isEmpty()) {
				System.out.println("Please type valid entry");
			}else {
				this.firstName = firstName;	
			}
			
		}
		
		public String getLastName() {
			return lastName;
		}
		
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		
		public int getAge() {
			return age;
		}
		
		public void setAge(int age) {
			if( age <0) {
				System.out.println("Please type valid age");
			}else {
			}this.age = age;
		}
	 
	 
	 
	public void tell() {
		 System.out.println("My name is"+ " "+ firstName + " " +lastName);
		 
	 }
	public void yearsTillRetirements() {
		int years = 65 - age;
		System.out.println("It is"+ years + "years"+ " " + "till retirement");
	}
	
	public int calculateYearsTillRetirement() {
		int years2 = 65 - age;
		return years2;
	}
	
	
	
}
