import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemoApp {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		ArrayList<String> students = new ArrayList<>();
		students.add("yelena");
		students.add("Nick");
		students.add("Katrina");
		students.add(1,"Lisa");
		
		//for (String student: students) {
			//System.out.println(students);
		
		System.out.println(students);
		System.out.println(students.get(3));
		System.out.println("Nick is "+students.indexOf("Nick"));
		System.out.println("Sort it");
	    Collections.sort(students);
	    System.out.println(students);
		System.out.println("Bye");
		
		
		
				
		
				

	}

}
