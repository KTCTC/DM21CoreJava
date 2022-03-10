package typess.off.verables;

public class StaticKeyword {
	
	int a = 89;
	String name = "KTCTC";
	
	static int abcd;
	static char ch ;
	
	public static void sampleStaticMethod()
	{
		System.out.println("sample Static Method");
		
	}
	
	public  void sampleNonStaticMethod()
	{
		System.out.println("sample Non Static Method");
		
	}
	
	
	
	public static void main(String[] args) {	
		
		StaticKeyword.abcd = 89;
		System.out.println(StaticKeyword.ch);
		System.out.println(StaticKeyword.abcd);		
		StaticKeyword.sampleStaticMethod();
		//StaticKeyword.sampleNonStaticMethod(); // not possible to call non static method by using class name
		
		StaticKeyword obj = new StaticKeyword();
		
		System.out.println(obj.name);
		System.out.println(obj.abcd);
		
		obj.sampleStaticMethod();
		obj.sampleNonStaticMethod();
		
	}
	

}
