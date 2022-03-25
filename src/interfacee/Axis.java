package interfacee;

public class Axis implements ReserveBank {

	@Override
	public void homeLoadInterestRate() {
		System.out.println("Axis car loan interest rate = 8.8 pa");

	}

	@Override
	public void carLoanInterestRate() {
		System.out.println("Axis car loan interest rate = 7.5 pa");

	}

	public void goaldLoan() {
		System.out.println("Axis car loan interest rate = 9 pa");
	}


	@Override
	public void fixedDepositeInterestRate() {
		System.out.println("Axis fixed deposite  interest rate = 4 pa");
	}
	public static void main(String[] args) {

		ReserveBank obj = new Axis();

		System.out.println(obj.abcd);
		System.out.println(obj.pqrs);
		obj.carLoanInterestRate();
		obj.homeLoadInterestRate();
	}

}
