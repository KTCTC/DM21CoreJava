package inheritance;

public class RunableClass {

	public static void main(String[] args) {
		
	//	A<--B<--C, A<--D
		
		
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
		
		
		C oc = new C();
		
		oc.aa = 90;		
		oc.stAA = 78;		
		oc.nonstaticMethodFromA();
		oc.staticMethodFromA();
		
		oc.bb = 78;
		oc.stBB = 65;
		oc.nonstaticMethodFromB();
		oc.staticMethodFromB();
		
		oc.cc = 76;
		oc.stCC = 23;
		
		oc.staticMethodFromC();
		oc.nonstaticMethodFromC();
		
		D od = new D();
		
		od.aa = 90;		
		od.stAA = 78;		
		od.nonstaticMethodFromA();
		od.staticMethodFromA();
		
		od.dd = 66;
		od.stDD = 67;
		od.staticMethodFromD();
		od.nonstaticMethodFromD();

	}

}
