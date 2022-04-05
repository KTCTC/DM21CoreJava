package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CheckedException {
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, SQLException  {
		sample1();
		sample2();
		sample3();
		
	}
	
	
	public static void sample1() throws FileNotFoundException 
	{
		File f = new File("C:\\Users\\91992\\DM21\\FirstJavaProject\\javasyllabus.docx");
		
		FileInputStream fis = new FileInputStream(f);
		
		System.out.println("After file not found line");
	}
	
	public static void sample2() throws ClassNotFoundException
	{
		Class.forName("exception.UncheckedExceptions");
		System.out.println("After class not found exception");
		
	}
	
	public static void sample3() throws SQLException
	{
		DriverManager.getConnection("123.34.23.13", "sdfsf", "4545");
	}
	
	public void sample4() throws Exception
	{
		DriverManager.getConnection("123.34.23.13", "sdfsf", "4545");
		Class.forName("exception.UncheckedExceptions");
		
		
	}

}
