package inheritance;

public class A {
	int aa = 67;
	static int stAA = 34;
	
	public A()
	{
		System.out.println("Defauls A constructor");
	}
	
	
	public void nonstaticMethodFromA()
	{
		System.out.println("nons tatic Method From A");
		System.out.println(aa);
		System.out.println(stAA);
	}
	
	public static void staticMethodFromA()
	{
		System.out.println("static Method From A");
	}
	
	public static void main(String[] args) {
		A obj = new A();		
		obj.aa = 90;		
		obj.stAA = 78;		
		obj.nonstaticMethodFromA();
		obj.staticMethodFromA();
		// Parent class object can not access child class class members (veriables and methods)
		obj.bb = 78;
		obj.stBB = 65;
		obj.nonstaticMethodFromB();
		obj.staticMethodFromB();
		
		B ob = new B();
		ob.aa = 90;		
		ob.stAA = 78;		
		ob.nonstaticMethodFromA();
		ob.staticMethodFromA();
		
		ob.bb = 78;
		ob.stBB = 65;
		ob.nonstaticMethodFromB();
		ob.staticMethodFromB();
		
		
	}
	

}
