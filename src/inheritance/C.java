package inheritance;

public class C extends B{
	int cc = 67;
	static int stCC = 34;
	
	public C()
	{
		System.out.println("Defauls C constructor");
	}
	
	
	public void nonstaticMethodFromC()
	{
		System.out.println("nons tatic Method From C");
	}
	
	public static void staticMethodFromC()
	{
		System.out.println("static Method From C");
	}
	

}
