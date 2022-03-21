package scanner;

import java.util.Scanner;

public class ScannerClass2 {

	public static void main(String[] args) {

		
		System.out.println("This code is for addition of two integer number");

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter first integer value...");
		int a = sc.nextInt();
		System.out.println("Please enter second integer value...");
		int b = sc.nextInt();
		
		int c = a+b;
		System.out.println("Addition is = "+c);
		

	}

}
