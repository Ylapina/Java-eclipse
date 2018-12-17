package ui;

import java.util.ArrayList;

import Util.Console;
import business.Movie;
import db.MovieIO;

public class MovieListApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Movie List application");
		System.out.println();
		Console console = new Console();
		MovieIO mIO = new MovieIO();
		 String choice = "y";
		 
		
		 while(choice.equalsIgnoreCase("y")) {
			 System.out.println("Choose from"+ mIO.getMovies().size()+ "movies");
			 System.out.println("Categories: drama | musical | scifi | horror | comedy | animated");
			 
			 String category = console.getString("Enter a category: ");
			 ArrayList<Movie>filteredMovies = mIO.getMovies(category);
			 
			 for(Movie m: filteredMovies) {
				 System.out.println(m.getTitle());
			 }
			 
			 
			 choice = Console.getString("Continue? y/n");
		 }
		

	}

}
