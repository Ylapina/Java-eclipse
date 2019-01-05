package ui;

import java.sql.SQLException;
import java.util.List;

import business.Stuffy;
import db.StuffyDB;
import util.Console;

public class StuffyDispenserDBApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Suffy Dispenser App");
		Console console = new Console();
		
		
		int choice =0;
		StuffyDB sdb = new StuffyDB();
		while (choice!=6){
			displayMenu();
			choice =Console.getInt("Enter option:", 0,6);
			if(choice==1) {
				//get a list of all stuffies
				try {
					List<Stuffy> stuffies = sdb.getAll();
					System.out.println("Stuffies List:");
					for(Stuffy s: stuffies) {
						System.out.println(s.toString());
					}
				} catch (SQLException e) {
					System.out.println("Exception occured getting all stuffies.");
					e.printStackTrace();
				}
			}
			else if(choice==2) {
				//grab a stuffy
				try {
				//1-get all list of stuffies
				List<Stuffy> stuffies = sdb.getAll();
				//2-generate a random # from size of stuffy list
				int size =stuffies.size();
				int rand=(int)((Math.random()*size)+1);
				
				//3-get that instance of stuffy from the list
				Stuffy s = stuffies.get(rand);
				//4- delete it
				
					if(sdb.delete(s)) {
						System.out.println("You got a "+s);
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			
			else if(choice ==3) {
			//add a Stuffy
				//prompt user for type color and size
				System.out.println("Add a new stuffy:");
				String type = Console.getString("Stuffy Type: ");
				String color = Console.getString("Stuffy Color: ");
				String size = Console.getString("Stuffy size: ");
				Stuffy s = new Stuffy(0,type, size, color);
				try {
				if(sdb.add(s))
					System.out.println("Stuffy successfully added.");
				}catch(SQLException e) {
					System.out.println("Error adding Stuffy");
				e.printStackTrace();
				
						
			}
			
		}
		
		}	
		
		System.out.println("Goodbye");

	}
private static void displayMenu() {
	System.out.println("Stuffy Dispenser Options");
	System.out.println("1-List all Stuffies");
	System.out.println("2-Grab a stuffy");
	System.out.println("3-Add a Stuffy");
	System.out.println("4-Update a Stuffy");
	System.out.println("5-Exit");
}
}
