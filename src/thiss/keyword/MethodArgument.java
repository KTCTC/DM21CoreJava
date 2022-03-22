package thiss.keyword;

public class MethodArgument {
	
	int a = 90;
	String nn = "abcd";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodArgument oo = new MethodArgument();
		oo.a = 555;
		oo.nn = "aeoui";
		oo.smMethod();

	}
	
	public void sampleNonMethod (MethodArgument obj)
	{
		System.out.println(obj.a);
		System.out.println(obj.nn);
		
	}
	
	public void smMethod()
	{
		sampleNonMethod(this);
		staticMethod(this);
	}
	
	public static void staticMethod(MethodArgument obj)
	{
		System.out.println(obj.a);
		System.out.println(obj.nn);
	}

}
