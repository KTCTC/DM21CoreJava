package accessmodifiersB;

import accessmodifiersA.AccessClass;
import accessmodifiersA.AccessClass2;

public class AccessBB extends AccessClass{
	
	public AccessBB()
	{
		super(23,34,44);
	}

	public static void main(String[] args) {
		  AccessClass obj = new AccessClass();
			
			System.out.println(obj.publicInt);
			System.out.println(obj.privateInt);
			System.out.println(obj.defaultInt);
			System.out.println(obj.protectedInt);
			
			obj.publicMethod();
			obj.privateMethod();
			obj.defaultMethod();
			obj.protectedMethod();
			
			AccessBB obj1 = new AccessBB();
				
				System.out.println(obj1.publicInt);
				System.out.println(obj1.privateInt);
				System.out.println(obj1.defaultInt);
				System.out.println(obj1.protectedInt);
				
				obj1.publicMethod();
				obj1.privateMethod();
				obj1.defaultMethod();
				obj1.protectedMethod();
				
				
				AccessClass2 oo1 = new AccessClass2();
				AccessClass2 oo2 = new AccessClass2(23);		
				AccessClass2 oo3 = new AccessClass2(22, 45);
				AccessClass2 oo4 = new AccessClass2(22, 45, 67);
			
			

	}

}
