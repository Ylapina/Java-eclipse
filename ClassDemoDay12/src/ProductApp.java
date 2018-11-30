
public class ProductApp {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		Product yelenasBook = new Product();
		yelenasBook.setCode("java");
		yelenasBook.setDescription("Murach Java");
		yelenasBook.setPrice(57.50);
		
		System.out.println("Yelenas book = "+ yelenasBook.getCode()+
				"," +yelenasBook.getDescription()+
                    ","+ yelenasBook.getPrice());	
		Product garysBook = new Product ();
		System.out.println(garysBook);
		System.out.println(Math.PI);
		System.out.println("Bye");
	}

}
