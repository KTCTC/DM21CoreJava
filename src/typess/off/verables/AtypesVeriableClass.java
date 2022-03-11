package typess.off.verables;

public class AtypesVeriableClass {
	
  static StaticKeyword obj = new StaticKeyword();
  int a = 89;
  
	public static void main(String[] args) {
		StaticKeyword.abcd = 89;
		StaticKeyword.sampleStaticMethod();
		//StaticKeyword obj = new StaticKeyword();
		
		System.out.println(obj.name);
		System.out.println(obj.abcd);
		obj.sampleStaticMethod();
		obj.sampleNonStaticMethod();
		System.out.println(a);
		

	}
	
	public void sample()
	{
		
		System.out.println(obj.name);
		System.out.println(obj.abcd);
		obj.sampleStaticMethod();
		obj.sampleNonStaticMethod();
	}

}
