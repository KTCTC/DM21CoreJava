package poly.methodoverriding;

public class B extends A{
	int aa = 22;
	static int stAA = 23;
	
	public void nonstaticA(int a)
	{
		System.out.println("Method from B");
	}
	
	
	public void nonstaticMethodforAddition(int a, int b)
	{
		System.out.println("non static Method for addition from B");
		System.out.println("BBBBBBBBBBBBBBBBBB");
		int c = a+b;
		System.out.println("Addition is = "+c);
	}
	
	public static  void staticMethodforSubstraction(int a, int b)
	{
		System.out.println(" static Method for addition from B");
		int c = a-b;
		System.out.println("Substraction is = "+c);
	}
	
	public static void main(String[] args) {					
		
		A ab = new B();
		ab.nonstaticA();		
		System.out.println(ab.aa);
		System.out.println(ab.stAA);
		ab.staticMethodforSubstraction(67, 12);
		ab.nonstaticMethodforAddition(12, 12);
		
		
		
		
		
		
		A aa = new A();
		
		System.out.println(aa.aa);
		System.out.println(aa.stAA);
		aa.staticMethodforSubstraction(23, 444);
		aa.nonstaticMethodforAddition(45, 2);
		
		
		
		
		B bb = new B();
		System.out.println(bb.aa);
		System.out.println(bb.stAA);
		bb.nonstaticMethodforAddition(23, 33);
		bb.staticMethodforSubstraction(45, 22);
		
	}
	

}
