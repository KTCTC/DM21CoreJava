package string;

public class StringClass3 {

	public static void main(String[] args) {
		// charAt(), length(),endsWith(" "),startsWith(),replace(),trim(),split(" "),subString(),contains(),equals(),
				//concate(),equalsIgnoreCase(String another),toLowerCase(),toUpperCase()
		String data = "   Showing 5 results of total 26054645   ";
		String str1 = "Welcome to KTCTC";
		String str3 = "   Welcome to KTCTC   ";
		String str2 = "     Welcome     to    KTCTC    ";
		 
  int tt = Integer.parseInt(data.trim().split(" ")[5]);
		
		System.out.println(tt);
		System.out.println(Integer.parseInt(data.trim().split(" ")[5]));
		
		String d1 = data.trim();
		String[] d2 = d1.split(" ");
		String d3 = d2[5];		
		int a = Integer.parseInt(d3);
		System.out.println(a);
		
		
		
		 str1  = str1.toUpperCase();
		

	}

}
