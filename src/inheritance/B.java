package inheritance;

public class B extends A{
	int bb = 67;
	static int stBB = 34;
	
	public B()
	{
		System.out.println("Defauls B constructor");
	}
	
	
	public void nonstaticMethodFromB()
	{
		System.out.println("nons tatic Method From B");
		System.out.println(bb);
		System.out.println(stBB);
		System.out.println(aa);
		System.out.println(stAA);
	}
	
	public static void staticMethodFromB()
	{
		System.out.println("static Method From B");
		System.out.println(stAA);
		System.out.println(stBB);
	}
	

}
