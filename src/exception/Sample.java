package exception;

import java.io.FileNotFoundException;

public class Sample {
	
	public static void sm() throws FileNotFoundException
	{
		System.out.println("Sample method");
		
		CheckedException.sample1();
		}
	
	public static void main(String[] args) throws FileNotFoundException {
		
		int z = getIntValue();
		System.out.println(z);
		
	}
	
	
	public static int getIntValue()
	{
		
		try {
			
			return 2;
			
		} catch (Exception e) {
			return 5;
			
		}
		
		
		finally {			
		
			return 99;
		}
		
	}

}
