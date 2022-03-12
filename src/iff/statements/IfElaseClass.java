package iff.statements;

public class IfElaseClass {

	public static void main(String[] args) {
		System.out.println("Statrting code");

		int a = 90;
		boolean fl = true;
		int age = 19;
		
		if (age>=18)
		{
			System.out.println("You are eligible for voting");
		}
		else
		{
			System.out.println("You are not eligible for voting");
		}
		
		
		if (false)
		{
			System.out.println("IF");
		}else
		{
			System.out.println("ELSE");
		}
		
		if (true)
		{
			System.out.println("IF");
		}else
		{
			System.out.println("ELSE");
		}
		

		if (a < 45) {
			System.out.println("Inside if 1");
			System.out.println("Inside if 2");
			System.out.println("Inside if 3");
		} else {
			System.out.println("Inside else 1");

			System.out.println("Inside else 2");
			System.out.println("Inside else 3");

		}

		System.out.println("ending code");

	}

}
