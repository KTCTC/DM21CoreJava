package breaks.statement;

public class ContinueClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =90;
		while(a<100)
		{
			
			if (a==95)
			{
				a++;
				continue;
			}
			System.out.println("Value of a = "+a);
			a++;
			
		}

	}

}
