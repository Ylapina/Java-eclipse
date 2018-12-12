
public class ContactListApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Contact List application");
		System.out.println();
		
		String choice = "y";
		while(choice.equalsIgnoreCase("y")) {
			// create a new contact object
			Contact contact = new Contact();
			
			// get contact data from the user
			String first = Console.getString("Enter first name: ");
			contact.setFirstName(first);
			
			String last  = Console.getString("Enter last name: ");
			contact.setLastName(last);
			
			String email = Console.getString("Enter email: ");
			contact.setEmail(email);
			
			String phone = Console.getString("Enter phone: ");
			contact.setPhone(phone);
			
			//display the contact
			System.out.println();
			System.out.println(contact.displayContact());
			System.out.println();
			//see if user wants to continue
			choice = Console.getString("Continue? y/n");
			System.out.println();
					
			
			
			
			
			
			
		}

	}

}
