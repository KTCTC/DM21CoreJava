package forr.loop;

public class ForEachLoop {

	public static void main(String[] args) {
		int arr[] = {23,45,2,1,56,78,65};
		char chArr[] = {'a','g','C','r'};
		String dataArr[] = {"Hello ", "Welcome to", " KTCTC"};
		
		int a=90;
		
		for ( String each:dataArr)
		{
			System.out.println(each);
		}
		
		
		
		for (char each:chArr)
		{
			System.out.println(each);
		}
		
		
		
		for (int each :arr)
		{
			System.out.println(each);
		}

	}

}
