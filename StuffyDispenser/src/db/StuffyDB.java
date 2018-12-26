package db;

import java.util.ArrayList;
import Util.Console;


import business.Stuffy;

    public class StuffyDB {
	private ArrayList <Stuffy> stuffies= new ArrayList<>();
	
	
	
	public void populateStuffies(){
		
		stuffies.add(new Stuffy(1, "Cat", "small", "white"));
		stuffies.add(new Stuffy(2, "Dog", "medium", "brown"));
		stuffies.add(new Stuffy(3, "Bird", "small", "red"));
		
		
	}
	
	 public void grabStuffy(int i) {
	        
	        Stuffy grabbedStuffy = stuffies.remove(i);
	        Console.displayLine("Woo hoo! You got a " + grabbedStuffy.getColor() + ", " + grabbedStuffy.getSize()
	                + " " + grabbedStuffy.getType() + "!");
	    }

	    public void addStuffy(Stuffy s) {
	        stuffies.add(s);
	        Console.displayLine("A "+stuffies.size()+","+ "has been added to inventory");
	    }

	    public int getStuffyListSize() {
	        return stuffies.size();
	    }

	    public int getLastID() {
	        int lastIndex = stuffies.size() - 1;
	        Stuffy lastStuffy = stuffies.get(lastIndex);
	        int lastID = lastStuffy.getId();
	        return lastID;
	    }

	}