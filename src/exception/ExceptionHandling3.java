package exception;

public class ExceptionHandling3 {

	public static void main(String[] args) {

		int a = 23;
		int b = 0;
		int c = 0;
		;
		String str1 = "ere";
		String nn = null;
		try {
			System.out.println("Entered Outer try block");
			int z = 0;

			try {
				System.out.println("Entered inner try block");
				z = Integer.parseInt(str1);
				System.out.println("Executed inner try block");
			} catch (Exception e) {
				z = 0;

				e.printStackTrace();
			}
			c = a / b;
			System.out.println(nn.charAt(3));
			System.out.println("Executed outer try block");
		}

		catch (ArithmeticException e) {

			c = a;

			try {
				System.out.println(nn.charAt(3));
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		} catch (NullPointerException e) {

			System.out.println("We have null string plese check string once");
		}

		catch (Exception e) {
			System.out.println("Unhandaled exception");
		}

		System.out.println("Value of c = " + c);

		System.out.println("After exception");

	}

}
