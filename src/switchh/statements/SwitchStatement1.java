package switchh.statements;

public class SwitchStatement1 {

	public static void main(String[] args) {

		// fall through switch

		System.out.println("Before code");
		int a = 2;

		switch (a) {
		case 4:
			System.out.println("This is case 4");
			System.out.println("This is case 4");
			System.out.println("This is case 4");
		case 1:
			System.out.println("This is case 1");
			System.out.println("This is case 1");
			System.out.println("This is case 1");

		case 2:
			System.out.println("This is case 2");
			System.out.println("This is case 2");
			System.out.println("This is case 2");
		case 3:
			System.out.println("This is case 3");
			System.out.println("This is case 3");
			System.out.println("This is case 3");

		default:
			System.out.println("No case is matched");
			System.out.println("No case is matched");
			System.out.println("No case is matched");

		}

		System.out.println("After code");

	}

}
