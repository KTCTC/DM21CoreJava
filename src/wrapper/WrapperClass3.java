package wrapper;

public class WrapperClass3 {

	public static void main(String[] args) {
		
		String dd = "er";
		Character ch = new Character('f');
		
		Character ch1 = 'A';
		
		System.out.println(ch1);
		char ch2 = Character.valueOf(dd.charAt(0));
		
		System.out.println(ch2);
		
		boolean f1 = Character.isDigit(ch);
		boolean f2 = Character.isLetter(ch);
		boolean f3 = Character.isLowerCase(ch);
		boolean f4 = Character.isUpperCase(ch);
		
		
		

	}

}
