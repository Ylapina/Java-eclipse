import java.util.Arrays;

public class StudentScoreApp {

	public static void main(String[] args) {
		
		System.out.println("The student Scores application\n");
		
		int n = Console.getInt("Number of students: ",0, Integer.MAX_VALUE);
		
		Student[] students = new Student[n];
		for(int i=0; i< n; i++) {
		System.out.println("STUDENT\t"+ (i+1));
		String ln = Console.getString("Last Name:");
		String fn = Console.getString("First Name:");
		int sc = Console.getInt("Score: ",-1,101);
		Student student = new Student(ln, fn, sc);
		students[i]=student;
		}
		Arrays.sort(students);
		
		System.out.println("SUMMARY");
		for (Student s : students) {
			System.out.println(s);
		}
		System.out.println("Bye");
		
		
		
	}
	

}
