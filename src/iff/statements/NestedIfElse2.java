package iff.statements;

public class NestedIfElse2 {

	public static void main(String[] args) {
		System.out.println("Starting code");
		int a = 2;

		int b = 56;

		boolean fl = false;		

			if (b > 100) {
				System.out.println("Inside if statement of if else");
				if (fl)
				{
					System.out.println("Inside if if staement");
				}
				
			} else {
				System.out.println("Inside else statement of if else ");
				
				if (b<450)
				{
					System.out.println("inside else if");
					
					if (a>0)
					{
						System.out.println("Ifffffff");
					}
					else
					{
						System.out.println("elseeeeeeee");
					}
					
					
				}
			}

		

		System.out.println("After code");

	}

}
