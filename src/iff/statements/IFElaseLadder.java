package iff.statements;

public class IFElaseLadder {

	public static void main(String[] args) {
		int marks = 60;
		
		if (marks>=66)
		{
			System.out.println("You are passed with distingction");
			
		}else if(marks<66 && marks>=55)
		{
			System.out.println("You are passed with first class");
			
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
		

	}

}
