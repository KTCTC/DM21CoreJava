package scanner;

import java.util.Scanner;

public class ScannerClass3 {

	public static void main(String[] args) {
        int a = 5678;
		
		System.out.println("Please enter your password to login..");

		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		
		if (a==b)
		{
			System.out.println("You hav been successfully logged in to the system...");
		}
		else
		{
			System.out.println("Your password is incorrect. You can not login to system..");
		}
		
		
		

	}

}
