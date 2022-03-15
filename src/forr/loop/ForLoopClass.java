package forr.loop;

public class ForLoopClass {

	public static void main(String[] args) {

		System.out.println("Before for loop");
		int a = 90;
		boolean flag = false;

		for (; a < 150;) {
			System.out.println("For loop executing for a = " + a);
			a = a + 10;
		}

		for (int i = 5; i > 0; i--) {
			System.out.println("for loop for i = " + i);
		}

		for (int i = 0; i <= 5; i++) {

			System.out.println("for loop for i = " + i);

		}

		for (; a < 500;) {
			System.out.println("for loop 1");
			System.out.println("for loop 2");
			System.out.println("for loop 3");

		}

		for (; flag;) {
			System.out.println("for loop 1");
			System.out.println("for loop 2");
			System.out.println("for loop 3");

		}

		System.out.println("After for loop");
		for (; true;) {
			System.out.println("for loop 1");
			System.out.println("for loop 2");
			System.out.println("for loop 3");

		}

	}

}
