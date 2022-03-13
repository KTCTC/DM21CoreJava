package switchh.statements;

public class SwitchStatement2 {

	public static void main(String[] args) {

		// fall through switch

		System.out.println("Before code");
		int a = 2;

		switch (a) {
		case 4:
			System.out.println("This is case 4");
			System.out.println("This is case 4");
			System.out.println("This is case 4");
			break;
		case 1:
			System.out.println("This is case 1");
			System.out.println("This is case 1");
			System.out.println("This is case 1");
			break;

		case 2:
			System.out.println("This is case 2");
			System.out.println("This is case 2");
			System.out.println("This is case 2");
			break;			
		case 3:
			System.out.println("This is case 3");
			System.out.println("This is case 3");
			System.out.println("This is case 3");
			break;

		default:
			System.out.println("No case is matched");
			System.out.println("No case is matched");
			System.out.println("No case is matched");
			break;

		}

		System.out.println("After code");

	}

}
