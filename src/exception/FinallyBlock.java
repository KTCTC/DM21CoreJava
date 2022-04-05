package exception;

public class FinallyBlock {

	public static void main(String[] args) {
		int a = 23;
		int b = 0;
		int c;
		
		String nn = null;
		try {	
			
			
			 c = a / b;
			
		} 
		catch (Exception e) {
			c = a;
		}
		
		finally {
			
			System.out.println("I am inside finally block");
		}
		System.out.println(c);

	}

}
