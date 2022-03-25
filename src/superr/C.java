package superr;

public class C extends B{
	int aa = 5555;
	static int stAA = 777777;
	int aaa = 89;
	
	public C()
	{
		super(2);
		System.out.println("default concstructor of C");
	}
	
	public C(int a)
	{
	super(56);
		System.out.println("Parameterized constructor of C");
	}
	
public C(int a, int b)
{
	
	System.out.println("2 Parameterized constructor of C");
}
	
	public static void ac()
	{
		System.out.println("ac from C");
	}
	
	
	public void nonStatic()
	{
		System.out.println("Non static method from C");
		System.out.println(aa);
		System.out.println(stAA);
		System.out.println(super.aa);
		System.out.println(super.stAA);
		System.out.println(super.aaa);
		super.nonStatic();
		ac();
		super.ac();
	
		
	}
	
	public static void staticMethod()
	{
		System.out.println(" static method from C");
	}
	
	public void sample()
	{
		System.out.println("Sample method from C");
	}
	
	public static void main(String[] args) {
		A oo = new C();
		oo.nonStatic();
		
	}
	

}
