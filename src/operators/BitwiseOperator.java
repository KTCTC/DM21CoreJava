package operators;

public class BitwiseOperator {

	public static void main(String[] args) {
		// Bitwise Operators  &,^,|
		
		int a =5;// 0000 0000 0000 0000 0000 0000 0000 0101
		int b =4;// 0000 0000 0000 0000 0000 0000 0000 0100
		
		int e = a^b; // 0000 0000 0000 0000 0000 0000 0000 0001
		System.out.println(e);
		
		int d = a|b;// 0000 0000 0000 0000 0000 0000 0000 0101
		System.out.println(d);
		
		int c = a&b; // 0000 0000 0000 0000 0000 0000 0000 0100 
		System.out.println(c);
		
		

	}

}
