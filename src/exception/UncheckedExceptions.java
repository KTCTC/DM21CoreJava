package exception;

public class UncheckedExceptions {
	static String name = null;
	
	static Sample obj;

	public static void main(String[] args) {
		
		int a = 56;
		int b = 0;
		String str1 = "abc";
		int arr[] = {34,4554,67678,3434,234};
		
		char ch = str1.charAt(7);
		System.out.println(ch);
		
		System.out.println(arr[56]);
		
		
		int d = Integer.parseInt(str1);
		System.out.println(d);		
		
		
		obj.sm();
		
		String str = name.toUpperCase();
		
		System.out.println(str);
		int c = a/b;
		System.out.println(c);
		

	}

}
