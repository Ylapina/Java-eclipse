

public class Payment {

	public static void main(String[] args) {
		// Create a person object
		Person person = new Person();
				person.setFirstName("Viktor");
		        person.setLastName("Lapin");
		        person.setHourlyRate(70);
		 //print the state of the current object       
		        System.out.println(person.toString());
		 //get and print the weekly payment
		        System.out.println(person.getPayment(40));
		       

	}

}