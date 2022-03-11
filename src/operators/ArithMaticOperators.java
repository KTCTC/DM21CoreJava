package operators;

public class ArithMaticOperators {

	public static void main(String[] args) {
		// Arithmatic operator +,-,*,/,%
		int a = 89;
		int b = 56;	
		String str1 = "Welcome";		
		String str2 = "Hello";
		float x = 56.55f;
		float y = 22.34f;
		
		
		float k = x%y;
		System.out.println(k);
		System.out.println("--------------------------");
		int j = a%b;		
		System.out.println(j);
		System.out.println("--------------------------");
		float i = x/b;
		System.out.println(i);		
		System.out.println("--------------------------");
		float h = a/y;
		System.out.println(h);
		System.out.println("--------------------------");
		float g = x/y;
		System.out.println(g);
		System.out.println("--------------------------");
		int f = a/b;
		System.out.println(f);
		
		System.out.println("--------------------------");
		int e = a*b;
		System.out.println(e);		
		System.out.println("--------------------------");
		int d = a-b;
		System.out.println(d);		
		System.out.println("--------------------------");
		
		String str3 = str1+str2;
		System.out.println(str3);	
				
		int c = a+b;
		System.out.println(c);		
		System.out.println(str3+str1);
		System.out.println(a+b);
		System.out.println(a+str1);
		System.out.println(a+b+str2);
		System.out.println(str2+a+b);

	
	}

}
