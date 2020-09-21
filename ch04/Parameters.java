/**
 * Write and invoke a method that takes parameters. 
 */
public class Parameters {
    
	public static void zool(int i, String s, String s1) {
	    System.out.println(i);
		System.out.println(s);
		System.out.println(s1);
		
	}
	
	public static void main(String[] args) {
		int num = 11;
		String pet = "Lassie";
		String street = "High St.";
		
		zool(num, pet, street);
		
	}
	
}
