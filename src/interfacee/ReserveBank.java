package interfacee;

public interface ReserveBank extends WorldBank, IndianGov{
	
	public static final int ABCD = 89;
	int PQRS = 90;	
	
	 void homeLoadInterestRate(); // this method also has public and abstract keyword
	
	public abstract void carLoanInterestRate();
	
	public abstract void fixedDepositeInterestRate();
	
	public abstract void sameNameMethod();
	
	// We can have static method in interface from java 8. Static method can not be abstract. 
	// This method can be called only by Interfacename.methodName
	public static void staticMethodFromInterface()
	{
		System.out.println("Sample static method in interface");
	}
	
	// This can be called by using object only
	public default void sampleDefaultMethodFromInterface()
	{
		System.out.println("sample Default Method From Interface");
	}
	

}
