package thiss.keyword;

public class InstanceVeriableThis {
	
	int rollNum = 45;
	String name = "Amit";
	
	static String clgName = "ABC";
	
	
	public InstanceVeriableThis(int rollNum, String name)
	{
		this.rollNum = rollNum;
		this.name = name;
	}
	
	public InstanceVeriableThis()
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InstanceVeriableThis obj = new InstanceVeriableThis(12, "HRT");
		
		
		
		
		InstanceVeriableThis oo = new InstanceVeriableThis();
		
		oo.rollNum = 88;
		oo.name = "Sanjay";
		
		oo.nonStaticMethod();

	}
	
	
	public void nonStaticMethod()
	{
		int rollNum = 66;
		String name = "HYT";
		System.out.println(" non Static Method");
		System.out.println(rollNum);
		System.out.println(name);
		System.out.println(this.rollNum);
		System.out.println(this.name);
		System.out.println(this.clgName);
	}
	
	public static void staticMethod()
	{
		System.out.println("Static Method");
		System.out.println(this.rollNum);
		System.out.println(this.name);
		System.out.println(clgName);
	}
	
	public void nonStaticMethod2()
	{
		
		System.out.println(this.rollNum);
		System.out.println(this.name);
		System.out.println(clgName);
	}

}
