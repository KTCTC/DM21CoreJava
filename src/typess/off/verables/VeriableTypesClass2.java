package typess.off.verables;

public class VeriableTypesClass2 {
	int a = 89;
	String name = "KTCTC";
	
	static int abcd;
	static char ch ;
	
	public static void sampleStaticMethod()
	{
		System.out.println("sample Static Method");
		System.out.println(name);
		System.out.println(abcd);
		
		VeriableTypesClass2 oo = new VeriableTypesClass2();
		
		System.out.println(oo.a);
		System.out.println(a);
		
	}
	
	public  void sampleNonStaticMethod()
	{
		System.out.println("sample Non Static Method");
		System.out.println(abcd);
		System.out.println(name);
		
	}
	
	public static void main(String[] args) {
		
		//VeriableTypesClass2.sampleStaticMethod();
		VeriableTypesClass2 obj = new VeriableTypesClass2();
		obj.name = "PPPPPPPP";
		obj.sampleNonStaticMethod();
		
		
	}
	

}
