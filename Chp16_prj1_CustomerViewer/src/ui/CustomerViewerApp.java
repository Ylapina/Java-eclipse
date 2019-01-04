package ui;

import java.io.ObjectInputStream.GetField;

import business.Customer;
import db.CustomerDB;

public class CustomerViewerApp {

	public static void main(String[] args) throws NoSuchCustomerException {
		System.out.println("Customer Viewer");
		boolean cnumber = true;
		while (cnumber) {
			int getCustomerNumber = Console.getIntWithinRange("Enter a customer number:", 1000, 1004);
			Customer c = CustomerDB.getCustomer(getCustomerNumber);
			System.out.println("\n" + c.getNameAndAddress());
			cnumber = Console.askToContinue("\nDisplay another customer? (y/n): ");
			System.out.println("Bye");
		}

	}

}
