package exception;

public class ExceptionHandling2 {

	public static void main(String[] args) {

		int a = 23;
		int b = 0;
		int c =0;;
		String str1 = "ere";
		String nn = null;
		try {			
			int z = Integer.parseInt(str1); 
			c = a / b;
			 System.out.println(nn.charAt(3));
		} catch (ArithmeticException e) {
			
			c = a;

		}
		catch (NullPointerException e) {

        System.out.println("We have null string plese check string once");
		}

		System.out.println("Value of c = " + c);

		System.out.println("After exception");

	}

}
