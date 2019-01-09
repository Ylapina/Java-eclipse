package ui;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import business.Country;

import db.CountryDB;
import util.Console;

public class CountryManagerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Country Manager/n");
		Console console = new Console();

		int choice = 0;
		CountryDB ct = new CountryDB();
		while (choice != 4) {
			displayMenu();
			choice = Console.getInt("Enter menu number: ", 0, 4);
			if (choice == 1) {
				try {
					List<Country> countries = ct.getAll();
					System.out.println("Countries list:");
					for (Country c : countries) {
						System.out.println(c.toString());
					}
				} catch (SQLException e) {
					System.out.println("Exception occured getting all countries.");
					e.printStackTrace();
				}

			} else if (choice == 2) {
				System.out.println("Add a new country:");
				int id = Console.getInt("Country Id ");
				String name = Console.getString("Country name ");

				Country c = new Country(id, name);
				try {
					if (ct.add(c))
						System.out.println("Country successfully added.");
				} catch (SQLException e) {
					System.out.println("Error adding Country");
					e.printStackTrace();
				}
			}

		}

		System.out.println("Good Bye");

	}

	private static void displayMenu() {
		System.out.println("Country Options");
		System.out.println("1-List countries");
		System.out.println("2-Add a country");
		System.out.println("3-Update a country");
		System.out.println("4-Exit");

	}

}
