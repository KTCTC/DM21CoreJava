package iff.statements;

public class NestedIfElse3 {

	public static void main(String[] args) {
		System.out.println("Starting code");
		int a = 2;

		int b = 560;

		boolean fl = false;		

			if (b > 100) {
				System.out.println("Inside if statement of if else");
				
				int marks = 60;
				
				if (marks>=66)
				{
					System.out.println("You are passed with distingction");
					
				}else if(marks<66 && marks>=55)
				{
					System.out.println("You are passed with first class");
					
					if (marks>40)
					{
						System.out.println("You are passed with sport quata");
					}
					
				}
				else if (marks<55 && marks>40)
				{
					System.out.println("You are passed with second class");
					
				}
				else if (marks>=40)
				{
					System.out.println("You are passed the exam");
					
				}
				else
				{
					System.out.println("Sorry!! Yor are failled exam");
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
