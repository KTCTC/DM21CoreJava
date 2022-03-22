package thiss.keyword;

public class ReturnThis {
	
	int a = 90;
	int b = 66;
	
	public static void main(String[] args) {
		
		
		ReturnThis oo = new ReturnThis();
		oo.a = 11;
		
		ReturnThis oo1 = new ReturnThis();
		oo1.a = 22;
		
		ReturnThis oc = oo.sample();
		System.out.println(oc.a);
		System.out.println(oc.b);
		
		
	}

	public ReturnThis sample()
	{
		//ReturnThis oo = new ReturnThis();
		
		return this;
		
	}
	
}
