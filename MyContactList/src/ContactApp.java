
public class ContactApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Contact List application");
		System.out.println();
		
		String choice = "y";
		while(choice.equalsIgnoreCase("y"));
		//Create a new contact object
		Contact contact = new Contact();
		
		//get contact data from the user
		String first = Console.getString("Enter first name: ");
		contact.setFirstName(first);
		
		String last = Console.getString("Enter last name: ");
		contact.setLastName(last);
		
		String email = Console.getString("Enter email address here: ");
		contact.setEmail(email);
		
		String phone = Console.getString("Enter you address here: ");
		contact.setPhone(phone);
		
		// display the contact
        System.out.println();
        System.out.print(contact.DisplayContact());
        System.out.println();

        // see if the user wants to continue
        choice = Console.getString("Continue? (y/n): ");
        System.out.println();
    }








		
			

	}

