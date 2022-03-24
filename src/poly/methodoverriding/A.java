package poly.methodoverriding;

public class A {
	int aa = 220;
	static int stAA = 230;
	
	public void nonstaticMethodforAddition(int a, int b)
	{
		System.out.println("non static Method for addition from A");
		int c = a+b;
		System.out.println("Addition is = "+c);
	}
	
	public static  void staticMethodforSubstraction(int a, int b)
	{
		System.out.println("non static Method for addition from A");
		int c = a-b;
		System.out.println("Substraction is = "+c);
	}
	
	public void nonstaticA()
	{
		System.out.println("Method from A");
	}
	

}
