
public class getClass {

	public static void main(String[] args) {
		//below called directly from the methods, better use get/set
   Person Lena = new Person();
//	Lena.firstName = "Yelena";
//	Lena.lastName = "Lapina";
//	Lena.tell();
//	Lena.age= 45;
//	
//	Person Anna = new Person();
//	Anna.firstName = "Anna";
//	Anna.lastName = "Larina";
//	Anna.age = 52;
//	Anna.tell();
//	
//	int years2 = Lena.calculateYearsTillRetirement();
//	System.out.println(years2 + "is left till retirement");	
	
	Lena.setFirstName("Lena");
	System.out.println("My name is"+Lena.getFirstName());
	
	
	}
	}
		