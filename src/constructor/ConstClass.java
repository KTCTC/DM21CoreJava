package constructor;

public class ConstClass {
	
	int a;
	String name;

	public ConstClass()
	{
	
	}
	
	public ConstClass(int b)
	{
		System.out.println("This is one parameter constructor");
		
		display();
		a = b;
		display();
		
	}
	public  ConstClass(int b, int y)
	{
		System.out.println("This is one parameter constructor");
		a = b;
	}
	
	public ConstClass(int b, String nn)
	{
		a= b;
		name = nn;
		System.out.println("This is two parameterized constructor");
	}
	
	public ConstClass(float v)
	{
		
	}
	public ConstClass(String nn, int z)
	{
		a= z;
		name = nn;
		System.out.println("This is two parameterized constructor");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstClass obj = new ConstClass();		
		
		ConstClass oo = new ConstClass();
		ConstClass obj1 = new ConstClass(23);
		
		
		ConstClass obj2 = new ConstClass(33, "KTCTC");
		obj.display();
		obj1.display();
		obj2.display();
		obj.display();
		obj.display();
		obj.display();
		obj.ConstClass();
		obj.ConstClass();
		obj.ConstClass();
		obj.ConstClass();		
		obj.sample();
		
	

	}
	
	
	public void display()
	{
		System.out.println("Integer value  = " +a);
		System.out.println("Strin gvalue = "+name);
	}
	
	// we can create method of class name. But, it is not recommended
	public void ConstClass()
	{
		System.out.println("THis is sample method of class name");
		
	}
	
	public void sample()
	{
		display();
	}

}
