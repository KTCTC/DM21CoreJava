package collection;

public class Student {
	
	int rollnum;
	String name;
	
	public Student(int a, String str)
	{
		rollnum = a;
		name = str;
	}
	
	public void displayStudentInformation()
	{
		System.out.println("Student roll num = "+rollnum);
		System.out.println("Student name = "+name);
	}
	

}
