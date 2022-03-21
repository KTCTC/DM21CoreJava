package constructor;

public class ConstructorClass {
	int rollNumber;
	String name;
	
	public ConstructorClass(int a, String nn)
	{
		rollNumber = a;
		name = nn;
	}
	public ConstructorClass()
	{
		
	}

	public static void main(String[] args) {
		
		// Object states are initialized through constructor
		ConstructorClass obj = new ConstructorClass(23, "Ajay");
		System.out.println(obj.rollNumber);
		System.out.println(obj.name);
		obj.display();
		obj.setStatesofObject(33, "Ajay");
		
		
		// Objects states are changed/updated by using object name
		ConstructorClass obj1 = new ConstructorClass();
		obj1.rollNumber = 22;
		obj1.name = "Amit";
		System.out.println(obj1.rollNumber);
		System.out.println(obj1.name);
		obj1.display();
		
		// Object states can be changed/updated by using method
		obj1.setStatesofObject(44, "Sanket");

	}
	
	public void setStatesofObject(int a, String nt)
	{
		rollNumber = a;
		name = nt;
		
	}
	
	public void display()
	{
		System.out.println("Roll Number = " +rollNumber);
		System.out.println("Student Name = "+name);
	}
	

}
