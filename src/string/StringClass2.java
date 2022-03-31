package string;

public class StringClass2 {

	public static void main(String[] args) {
		// charAt(), length(),endsWith(" "),startsWith(),replace(),trim(),split(" "),subString(),contains(),equals(),
				//concate(),equalsIgnoreCase(String another),toLowerCase(),toUpperCase()
		
		String str1 = "Welcome to KTCTC";
		
		boolean f2 = str1.startsWith("Wel");
		System.out.println(f2);
		
		boolean f1 = str1.endsWith("TC");
		System.out.println(f1);
		int lng = str1.length();
		System.out.println(lng);
		char c = str1.charAt(4);
		System.out.println(c);
		
		for (int i=str1.length()-1;i>=0;i--)
		{
			System.out.println(str1.charAt(i));
		}
		
		for (int i=0; i<str1.length();i++)
		{
			System.out.println(str1.charAt(i));
		}
		

	}

}
