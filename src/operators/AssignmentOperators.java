package operators;

public class AssignmentOperators {

	public static void main(String[] args) {
		// Assignment Operators = ,+= ,-= ,*= ,/= ,%= , <<= ,>>= 
		
		int a = 5;
		int b = 4;
		float x = 34.4f;
		float y = 22.23f;
		
		b>>=a; // b = b>>a; // 4/2^5
		System.out.println(b);
		
		b<<=a; // b= b<<a; // 4 * 2^5
		System.out.println(b);
		
		b%=a; // b = b%a;
		System.out.println(b);
		
		
		x/=y; // x = x/y;
		System.out.println(x);
		
		
		b/=a; b = b/a; // b = b/a;
		System.out.println(b);
		
		b*=a; // b = b*a;
		System.out.println(b);
		
		b-=a; // b = b-a;
		System.out.println(b);
		
		b +=a; // b = b+a;
		System.out.println(b);
		System.out.println(a);
		
		a=b;
		    

	}

}
