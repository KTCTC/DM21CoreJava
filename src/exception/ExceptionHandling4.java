package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling4 {

	public static void main(String[] args) {

		sample1();
		try {
			sample2();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("After exception");

	}
	
	public static void sample1()  
	{
		File f = new File("C:\\Users\\91992\\DM21\\FirstJavaProject\\javasyllabus.docx");
		
		try {
			FileInputStream fis = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			System.out.println("Provided file is not found");
			e.printStackTrace();
		}
		
		System.out.println("After file not found line");
	}
	
	public static void sample2() throws ClassNotFoundException
	{
		Class.forName("exception.UncheckedExceptions");
		System.out.println("After class not found exception");
		
	}

}
