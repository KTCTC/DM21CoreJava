package exception;

public class IllegalAgeException extends Exception{

	public IllegalAgeException()
	{
		super("Your age is not eligible for voting..");
	}
}
