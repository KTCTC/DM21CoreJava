package poly.methodoverloading;

public class MethodOverloadingClass {
	
	int a = 90;
	int b = 88;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloadingClass obj = new MethodOverloadingClass();
		obj.addition();
		obj.addition(23, 33);
		obj.addition(23.34f, 22.34f);
		obj.substraction(23, 44);
		obj.substraction(34.3f, 33.4f);		
		substraction(34.55f, 67.45f);
		

	}
	
	
	public void addition()
	{
		int c = a +b;
		System.out.println("Thisd is non parameterized method");
		System.out.println("Addition is = "+c);
	}
	
	public void addition(int a, int b)
	{
		System.out.println("This method uses two int parameters");
		int c = a + b;
		System.out.println("Addition is = "+c);
	}
	
	public void addition(float a, float b)
	{
		System.out.println("This method uses two float parameters");
		float c = a + b;
		System.out.println("Addition is = "+c);
	}
	
	
	public static void addition(String a, String xx)
	{
		System.out.println("This method uses two String parameters");
		
		System.out.println("concatenation of strings = "+ a+xx);
	}
	
	public static void substraction(int a, int b)
	{
		System.out.println("This method uses two int parameters");
		int c = a - b;
		System.out.println("Substraction is = "+c);
	}
	
	public static void substraction(float a, float b)
	{
		System.out.println("This method uses two float parameters");
		float c = a - b;
		System.out.println("Substraction is = "+c);
	}
	

}
