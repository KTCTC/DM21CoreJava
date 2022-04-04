package string;

public class StringClass2 {

	public static void main(String[] args) {
		// charAt(), length(),endsWith(" "),startsWith(),replace(),trim(),split(" "),subString(),contains(),equals(),
				//concate(),equalsIgnoreCase(String another),toLowerCase(),toUpperCase()
		String data = "Showing 5 results of total 26054645";
		String str1 = "Welcome to KTCTC";
		String str3 = "   Welcome to KTCTC   ";
		String str2 = "     Welcome     to    KTCTC    ";
		
		String dd10 = str1.toUpperCase();
		System.out.println(dd10);
		
		String dd9 = str1.toLowerCase();
		System.out.println(dd9);
		System.out.println(str1);
		
		
		boolean f7 = str1.equalsIgnoreCase("Welcome to ktctc");
		System.out.println(f7);
		
		String dd8 = str1.concat(" Hello");		
		System.out.println(dd8);
		System.out.println(str1);
		
		
		boolean f6 = str1.equals(str3.trim());
		System.out.println(f6);
		
		boolean f5 = str1.contains("Welcome ");
		System.out.println(f5);
		
		boolean f4 = str2.contains(str1);
		System.out.println(f4);
		
		boolean f3 = str1.contains("to");
		System.out.println(f3);
		
		String dd7 = str1.substring(4, 8);
		System.out.println(dd7);
		
		String dd6 = str1.substring(5);
		System.out.println(dd6);
		
		String[] dd5 = data.split(" ");
		System.out.println(dd5[5]);
		Integer aa = Integer.valueOf(dd5[5]);
		System.out.println(aa);
		
		
		String[] dd4 = str1.split(" ");
		System.out.println(dd4[1]);
		
		String dd3 = str2.trim();
		System.out.println(dd3);
		System.out.println(str2);
		
		String dd2 = str1.replace("to ", "2");
		System.out.println(dd2);
		System.out.println(str1);
		
		String dd1 = str1.replace('o', '0');
		System.out.println(dd1);
		System.out.println(str1);
		
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
