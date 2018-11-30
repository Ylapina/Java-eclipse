
public class Calculator1 {

	public static void main(String[] args) {
		Calculator cl = new Calculator();
		Calculator cl2 = new Calculator();
		
		cl.name= "Great";
		cl2.name="Perfect";
		
		System.out.println(cl.name +" calculated"+ cl.add(3, 4));
		System.out.println(cl2.name+" calculated"+ cl2.modulus(29,5));
		System.out.println(cl.name+ " calculated"+ cl.divide(10, 2));
        System.out.println(cl2.name + " calculated"+ cl2.multiply(2, 5));
        
	}

}
