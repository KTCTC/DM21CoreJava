package interfacee;

public class Axis implements WorldBank, IndianGov {


	public void homeLoadInterestRate() {
		System.out.println("Axis car loan interest rate = 8.8 pa");

	}

	
	public void carLoanInterestRate() {
		System.out.println("Axis car loan interest rate = 7.5 pa");

	}

	public void goaldLoan() {
		System.out.println("Axis car loan interest rate = 9 pa");
	}


	
	public void fixedDepositeInterestRate() {
		System.out.println("Axis fixed deposite  interest rate = 4 pa");
	}
	public static void main(String[] args) {

		Axis obj = new Axis();

obj.sameNameMethod();
		
	}


	@Override
	public void sampleFromIndianGov() {
		System.out.println("Sample from Indian Gov");
		
		
	}


	@Override
	public void currancyConverter() {
		System.out.println("Axis bank currancy converter rate is  = 1.5%");
	}


	@Override
	public void sameNameMethod() {
		System.out.println("Sample same name method");
		
	}

}
