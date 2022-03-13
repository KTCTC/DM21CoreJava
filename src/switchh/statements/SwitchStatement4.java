package switchh.statements;

public class SwitchStatement4 {

	public static void main(String[] args) {

		// fall through switch

		System.out.println("Before code");
		String str = "Math";

		switch (str) {
		case "Math":
			System.out.println("Math book price is = 230");
			break;
		case "English":
			System.out.println("English book price is = 130");
			break;

		case "Science":
			System.out.println("Science book price is = 2300");
			break;			
		

		default:
			System.out.println("Provided booke is not available");
			break;

		}

		System.out.println("After code");

	}

}
