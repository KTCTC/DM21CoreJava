package inheritance;

public class D extends A{
	int dd = 67;
	static int stDD = 34;
	
	
	public void nonstaticMethodFromD()
	{
		System.out.println("nons tatic Method From D");
	}
	
	public static void staticMethodFromD()
	{
		System.out.println("static Method From D");
	}
	

}
