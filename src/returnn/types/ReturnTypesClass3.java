package returnn.types;



public class ReturnTypesClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		

	}
	
	// We can not add return in method with void return type
	public void sm()
	{
		int a = 90;
		
		return a;
	}
	// We should add return statment for method with non void return type
	public int sm1()
	{
		int a = 90;
		
	}
	// Return statement should be last statement in method. return statement will break execution of method.
	public float sm2()
	{
		float d = 33.45f;
		float g = 55.55f;
		
		return d;
		System.out.println(g);		
		
	}
	// Method should reach to return statement; So, it will return value. if a< 40 then we will not reach to return statement
	public String sm3()
	{
		int a = 20;
		
		if (a>40)
		{
			return "You are pass";
		}
	}
	// we can write multiple return statements in method. But, only one return statement should get executed
	public String sm4()
	{
      int a = 45;
		
		if (a>40)
		{
			return "You are pass";
		}
		else
		{
			return "You are not pass";
		}
	}
	
	public char sm5()
	{
		return 'A';
		return 'b';
	}
	

}
