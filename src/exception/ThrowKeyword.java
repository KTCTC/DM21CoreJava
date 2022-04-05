package exception;

import java.sql.SQLDataException;

public class ThrowKeyword {
	
	
	public static void main(String[] args) throws IllegalAgeException {
		
		ThrowKeyword obj = new ThrowKeyword();
		int age = 3;
		
		if (age>=18)
		{
			System.out.println("You can vote");
		}
		else
		{
			System.out.println("You can not vote");
			
			IllegalAgeException oo = new IllegalAgeException();
			
			throw oo;
			
			//throw new IllegalAgeException();
		}
	}

}
