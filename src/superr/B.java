package superr;

public class B extends A{
	
	int aa = 120;
	static int stAA = 770;
	
	
	
	public B(int a)
	{
		
		System.out.println("default para concstructor of B");
	}
	
	public void nonStatic()
	{
		System.out.println("Non static method from B");
		System.out.println(aa);
		System.out.println(stAA);
		System.out.println(super.aa);
		System.out.println(super.stAA);
		System.out.println(super.aaa);
		System.out.println(aaa);
		super.sample();
		staticMethod();		
		super.staticMethod();
	}
	
	public static void staticMethod()
	{
		System.out.println(" static method from B");
		
	}
	
	public void sample()
	{
		System.out.println("Sample method from B");
	}
	
	public static void main(String[] args) {
		
		B obj = new B(23);
		obj.nonStatic();
	}

}
