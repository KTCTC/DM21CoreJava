package exception;

public class ExceptionHandling {

	public static void main(String[] args) {

		int a = 23;
		int b = 3;
		int c;
		
		String nn = null;
		try {			
			 c = a / b;
			 System.out.println(nn.charAt(3));
		} catch (ArithmeticException e) {
			
			c = a;

		}

		System.out.println("Value of c = " + c);

		System.out.println("After exception");

	}

}
