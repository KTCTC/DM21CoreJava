package switchh.statements;

public class SwitchStatement3 {

	public static void main(String[] args) {

		// fall through switch

		System.out.println("Before code");
		char a = 'A';

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

		System.out.println("After code");

	}

}
