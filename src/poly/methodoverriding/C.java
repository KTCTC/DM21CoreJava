package poly.methodoverriding;

public class C extends B{
	int aa = 2200;
	static int stAA = 2300;
	
	public void nonstaticMethodforAddition(int a, int b)
	{
		System.out.println("non static Method for addition from C");
		int c = a+b;
		System.out.println("Addition is = "+c);
	}
	
	public static  void staticMethodforSubstraction(int a, int b)
	{
		System.out.println(" static Method for addition from C");
		int c = a-b;
		System.out.println("Substraction is = "+c);
	}
	
	public void nonstaticA()
	{
		System.out.println("Method from C");
	}
	
	public static void main(String[] args) {
		
		A ab = new B();
		ab.nonstaticMethodforAddition(45, 90);
		
		A ac = new C();		
		ac.nonstaticA();
		ac.nonstaticMethodforAddition(33, 56);
				
		B bc = new C();
		bc.nonstaticMethodforAddition(22, 44);
		
	}
	

}
