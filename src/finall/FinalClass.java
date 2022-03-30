package finall;

public final  class FinalClass {
	public final int AB = 23;	
	public final static int STINT = 45;
	
	final int PQRS;	
	final static int SDF;
	
	public FinalClass()
	{
		PQRS = 88;		
		
	}
	
	public FinalClass(int a)
	{
		PQRS = 44;		
		
	}
	
	static{
		SDF =78;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalClass obj = new FinalClass();
		FinalClass obj1 = new FinalClass(2);
		final int a;
		a =8;
		//a = 78;		
		System.out.println(FinalClass.STINT);
		//FinalClass.STINT = 99;
		
		//obj.PQRS = 77;
		//obj.AB = 55;

	}
	
	final public  void nonStaticMethod()
	{
		System.out.println("non Static Method");
	}
	public static final void staticMethod()
	{
		System.out.println("Static Method");
	}

}
