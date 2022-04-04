package exception;

import java.io.FileNotFoundException;

public class Sample {
	
	public static void sm() throws FileNotFoundException
	{
		System.out.println("Sample method");
		
		CheckedException.sample1();
		}
	
	public static void main(String[] args) throws FileNotFoundException {
		sm();
	}

}
