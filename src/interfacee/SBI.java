package interfacee;

public class SBI implements ReserveBank{

	@Override
	public void homeLoadInterestRate() {
	
		System.out.println("SBI home loan interest rate = 7.9 pa");
	}

	@Override
	public void carLoanInterestRate() {
		
		System.out.println("SBI car loan interest rate = 8 pa");
		
	}
	
	public void personalLoan()
	{
		System.out.println("SBI personal loan interest rate = 9 pa");
	}
	
	public static void main(String[] args) {
		
		ReserveBank.staticMethodFromInterface();
		
		
		ReserveBank obj = new SBI();
		obj.sampleDefaultMethodFromInterface();		
		System.out.println(obj.ABCD);
		System.out.println(obj.PQRS);
		obj.carLoanInterestRate();
		obj.homeLoadInterestRate();
		
		
		
		
		SBI oo = new SBI();		
		System.out.println(oo.ABCD);
		oo.homeLoadInterestRate();
		oo.carLoanInterestRate();
		oo.personalLoan();
	}

	@Override
	public void fixedDepositeInterestRate() {
		System.out.println("SBI fixed deposite  interest rate = 9 pa");
	}

	@Override
	public void currancyConverter() {

		System.out.println("SBI currancy converter  rate = 1 %");
		
	}

	@Override
	public void sampleFromIndianGov() {
	System.out.println("Sample from Indian Gov");
		
	}

	@Override
	public void sameNameMethod() {
	System.out.println("Same Name method");
		
	}

}
