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
		
		
		ReserveBank obj = new SBI();
		
		System.out.println(obj.abcd);
		System.out.println(obj.pqrs);
		obj.carLoanInterestRate();
		obj.homeLoadInterestRate();
		
		
		
		
		SBI oo = new SBI();
		System.out.println(oo.abcd);
		oo.homeLoadInterestRate();
		oo.carLoanInterestRate();
		oo.personalLoan();
	}

	@Override
	public void fixedDepositeInterestRate() {
		System.out.println("SBI fixed deposite  interest rate = 9 pa");
	}

}
