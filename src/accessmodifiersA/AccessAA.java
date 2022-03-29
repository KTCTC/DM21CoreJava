package accessmodifiersA;

public class AccessAA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        AccessClass obj = new AccessClass();
		
		System.out.println(obj.publicInt);
		System.out.println(obj.privateInt);
		System.out.println(obj.defaultInt);
		System.out.println(obj.protectedInt);
		
		obj.publicMethod();
		obj.privateMethod();
		obj.defaultMethod();
		obj.protectedMethod();
		
		
		AccessClass2 oo1 = new AccessClass2();
		AccessClass2 oo2 = new AccessClass2(23);		
		AccessClass2 oo3 = new AccessClass2(22, 45);
		AccessClass2 oo4 = new AccessClass2(22, 45, 67);

	}

}
