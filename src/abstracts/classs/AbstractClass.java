package abstracts.classs;

public abstract class AbstractClass extends AbstractSampleClass{
	
	int abcd = 78;
	static float dfg = 67;
	static final int PQRS = 78;
	public AbstractClass()
	{
		System.out.println("Default constructor");
	}
	
	public AbstractClass(int a, float b)
	{
		System.out.println("This is parametrized constructor");
		abcd = a;
		dfg = b;
	}
	public abstract void abstractMethod1();
	
	public void samplreNonstaticMethosd()
	{
		System.out.println("samplre Nons tatic Methosd");
	}
	
	public static void sampleStaticMethod()
	{
		System.out.println("sample Static Method");
	}
	
	public static void main(String[] args) {
		
		
	}
	

}
