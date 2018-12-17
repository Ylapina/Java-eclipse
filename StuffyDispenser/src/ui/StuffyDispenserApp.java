package ui;

import java.io.Console;

import db.StuffyDB;

public class StuffyDispenserApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Stuffy Dispenser Application");
		System.out.println();
		
		Console console = new Console();
		StuffyDB st = new stuffyDB();
		
		String choice = "y";
		while(choice.equalsIgnoreCase("y"));
		
		    System.out.println("Menu");
		    System.out.println("1 - Grab Stuffy");
		    System.out.println("2 - Add Stuffy");
		    System.out.println("Exit");
		    
		    String category = console.getString("Enter an option: ");
		    ArrayList<Stuffy>

	}

}
