package operators;

public class ShoftOperators {

	public static void main(String[] args) {
		// Shift Operators   <<,>>
		
		int a =5;// 0000 0000 0000 0000 0000 0000 0000 0101
		int b =4;// 0000 0000 0000 0000 0000 0000 0000 0100
		
	
		
		
		int d = a>>2;// 000000 0000 0000 0000 0000 0000 0000 01 // a / 2^2
		System.out.println(d);
		
		int c = a<<670; // 00 0000 0000 0000 0000 0000 0000 010100 // a * 2^4
		System.out.println(c);
		 

	}

}
