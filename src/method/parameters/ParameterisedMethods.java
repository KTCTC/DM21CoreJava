package method.parameters;

public class ParameterisedMethods {
	int ab = 45;
	float pq = 67.89f;
	

	public static void main(String[] args) {
		int pp = 890;
	
		ParameterisedMethods obj = new ParameterisedMethods();
		
		obj.substraction(obj.pq, obj.ab);
		obj.addition(pp,45);
		obj.addition(2,78);
		obj.substraction(45.45f, 23);
		obj.substraction(45, 23);
		obj.sample(34, "KTCTC", 45.45f);
		ParameterisedMethods.sample(34, "ANT", 45.56f);
		

	}
	
	
	public void addition(int a, int b)
	{		
		int c = a+b;
		System.out.println(c);
	}
	
	public void substraction(float x, int b)
	{
		float c = x-b;
		System.out.println(c);
	}
	
	public static void sample(int a, String data, float c)
	{
		System.out.println(a+data+c);
		
	}

}
