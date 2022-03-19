package returnn.types;



public class ReturnTypesClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnTypesClass2 oo = new ReturnTypesClass2();
		String data = oo.getString("Welcome to ", "KTCTC");
		System.out.println(data);
		
		StudentClassReturn ab = new StudentClassReturn();
		oo.sampleUpdateObject(ab);
		ab.displayStudentInformation();
		
		int a = oo.sample2();		
		
		StudentClassReturn obj = oo.getStdentCLassInstance();
		obj.displayStudentInformation();
		
		

	}
	
	public StudentClassReturn getStdentCLassInstance()
	{
		StudentClassReturn obj = new StudentClassReturn();
		obj.rollNum = 22;
		obj.name = "Amit";		
		return obj;
		
	}
	
	public void sampleUpdateObject(StudentClassReturn o)
	{
		o.rollNum = 55;
		o.name = "Sanjay";
		
		
	}
	
	public  int sample2()
	{
		System.out.println("Samplme 2 method");
		int a = 99;
		int b = 4;
		int c = a+b;
		float d = 34.55f;	
		System.out.println("Addition is = "+c);
		return c;
	}
	
	public String getString(String str1, String str2)
	{
		String data = str1+str2;
		
		return data;
		
	}
	
	
	

}
