package accessmodifiersA;

public class AccessClass {

	public int publicInt = 88;
	private int privateInt = 44;
	int defaultInt = 55;
	protected int protectedInt = 77;

	public void publicMethod() {
		System.out.println("public Method");
		
	}

	private void privateMethod() {
		System.out.println("private Method");
	}

	void defaultMethod() {
		System.out.println("default Method");
	}

	protected void protectedMethod() {
		System.out.println("protected Method");
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
		
	}

}
