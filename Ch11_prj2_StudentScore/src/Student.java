
public class Student implements Comparable {
	String lastName;
	String firstName;
	int score;

	public Student(String lastName, String firstName, int score) {

		this.lastName = lastName;
		this.firstName = firstName;
		this.score = score;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public int compareTo(Object o) {
		Student s = (Student)o;
		int compareValue = this.lastName.compareToIgnoreCase(s.getLastName());
		if(compareValue==0) {
			compareValue= this.firstName.compareToIgnoreCase(s.getFirstName());
		}
		return this.lastName.compareToIgnoreCase(s.getLastName());
	}



		
	}

