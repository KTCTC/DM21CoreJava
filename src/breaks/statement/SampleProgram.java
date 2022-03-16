package breaks.statement;

public class SampleProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=1;i<=100;i++)
		{
			if (i%2==0)
			{
				continue;
			}
			
			System.out.println("Odd Numbers are ="+i);
			
		}

	}

}
