package switchh.statements;

public class SwitchStatement5 {

	public static void main(String[] args) {

		// fall through switch

		System.out.println("Before code");
		String str = "Math";
		char a = 'B';

		switch (str) {
		case "Math":
			System.out.println("Math book price is = 230");
			switch (a) {
			case 'A':
				System.out.println("Provided character is vowel");
				break;
			case 'E':
				System.out.println("Provided character is vowel");
				break;

			case 'O':
				System.out.println("Provided character is vowel");
				break;			
			case 'U':
				System.out.println("Provided character is vowel");
				break;
			case 'I':
				System.out.println("Provided character is vowel");
				break;

			default:
				System.out.println("Provided character is not vowel");
				break;

			}
			
			
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
