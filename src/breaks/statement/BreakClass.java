package breaks.statement;

public class BreakClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before code");
		
		char chArr[] = {'r','a','e','C','r','z','k','x'};
		
		
		for (int i = 0; i <= 5; i++) {

			System.out.println("for loop for i = " + i);
			break;
			System.out.println("Hello"); // unreachable code

		}
		
		for (char each:chArr)
		{
			if (each=='r')
			{
				System.out.println("r is present in provided array");
				break;
			}
		}
		
		
		
		
		for (int i = 0; i<chArr.length;i++)
		{
			
			if (chArr[i]=='r')
			{
				System.out.println("r is present in provided array");
				break;
			}
			
		}
		
		
		
		
		System.out.println("After code");


	}

}
