package breaks.statement;

public class BreakClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before code");
		int a = 90;
		
		
		do
		{
			System.out.println("Value of a = "+a);
			a--;
			if (a==88)
			{
				break;
			}
			
			
		}while(a>80);
		
		
		
		
		while(a<100)
		{
			System.out.println("Value of a = "+a);
			a++;
			if (a==95)
			{
				break;
			}
			
		}
		
		
		
		System.out.println("After code");


	}

}
