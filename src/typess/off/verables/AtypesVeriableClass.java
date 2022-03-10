package typess.off.verables;

public class AtypesVeriableClass {

	public static void main(String[] args) {
		StaticKeyword.abcd = 89;
		StaticKeyword.sampleStaticMethod();
		StaticKeyword obj = new StaticKeyword();
		
		System.out.println(obj.name);
		System.out.println(obj.abcd);
		obj.sampleStaticMethod();
		obj.sampleNonStaticMethod();
		

	}

}
