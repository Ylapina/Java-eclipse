package db;

import java.util.ArrayList;


import business.Stuffy;

    public class StuffyDB {
	private ArrayList <Stuffy> stuffies;
	
	public StuffyDB() {
		populateStuffies();
		
	}
	
	private ArrayList<Stuffy> populateStuffies(){
		stuffies = new ArrayList<>();
		stuffies.add(new Stuffy(123, "Cat", "small", "white"));
		stuffies.add(new Stuffy(456, "Dog", "medium", "brown"));
		stuffies.add(new Stuffy(742, "Bird", "small", "red"));
		return stuffies;
		
	}
	
	public ArrayList<Stuffy>grabStuffy(int id){
    	Stuffy s;
    	
    	for (Stuffy s: stuffies) {
    		String bonus = y;
    	if (s.getId()== y) {
    	}
    	}
    	return  Stuffy;
    	

}
