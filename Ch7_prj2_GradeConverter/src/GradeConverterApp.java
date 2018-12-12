
public class GradeConverterApp {

	
		public static void main(String[] args) {
	        
	        System.out.println("Welcome to the Letter Grade Converter");
	        System.out.println(); 
	        
	        String choice = "y";
	        while (choice.equalsIgnoreCase("y")) {
	            // get a grade from user
	            int number = Console.getInt("Enter numerical grade: ");
	            Grade grade = new Grade(number);

	            
	            System.out.println("Letter grade: " + grade.getLetter() + "\n");

	           
	            choice = Console.getString("Continue? (y/n): ", "y", "n");
	            System.out.println();
	        }
	    }
	    
	}
