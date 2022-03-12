package operators;

public class TernaryOperator {

	public static void main(String[] args) {
		// Ternery Operators (if-then-else)  ? :
		int age = 170;
		int x = 34;
		int y = 90;
		
		boolean f1 = true;
		boolean f2 = false;
		
		char b = !(x<y)?'A':'B';
		System.out.println(b);
		
		int a = f2?56:67;
		System.out.println(a);
		
		String ab = f1?"Hello":"Hi";
		
		System.out.println(ab);
		
	  boolean f3 = f2? false:true;	
	  System.out.println(f3);
	  
	  String str = age>=18?"You can vote": "You can not vote";
	  System.out.println(str);
	  
		  

	}

}
