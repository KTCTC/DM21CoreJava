package iff.statements;

public class NestedIfElse {

	public static void main(String[] args) {
		System.out.println("Starting code");
		int a = 2;

		int b = 56;

		boolean fl = false;

		if (a > 4) {
			System.out.println("Inside if statement");
			System.out.println("Inside if statement");

			if (b > 100) {
				System.out.println("Inside if statement of if else");
			} else {
				System.out.println("Inside else statement of if else ");
			}

			System.out.println("Inside if statement");

		}

		System.out.println("After code");

	}

}
