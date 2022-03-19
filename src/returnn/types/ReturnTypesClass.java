package returnn.types;

import java.util.Arrays;

public class ReturnTypesClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {23,45,11};
		int arr1[] = {23,45,11};
		
		boolean f = Arrays.equals(arr, arr1);
		
		
		ReturnTypesClass.sample1();
		int t = ReturnTypesClass.sample2();
		ReturnTypesClass obj = new ReturnTypesClass();
		
		float g = obj.sample3();
		System.out.println(g);
		System.out.println(obj.sample3());
		
		boolean h = obj.sampleBooleanReturnMethod(2, 34);
		System.out.println(h);
		
		int[] add = obj.getAdditionOfArray(arr, arr1);
		
		for (int i=0; i<add.length;i++)
		{
			System.out.print(add[i]);
		}

		
		

	}
	
	public static void sample1()
	{
		System.out.println("Samplme 1 method");
		
		
		
	}
	public static int sample2()
	{
		System.out.println("Samplme 2 method");
		int a = 99;
		int b = 4;
		int c = a+b;
		float d = 34.55f;	
		System.out.println("Addition is = "+c);
		return c;
	}
	
	public float sample3()
	{
		float b  = 55.6f;
		
		return b;		
		
	}
	
	
	public boolean sampleBooleanReturnMethod(int a, int b)
	{
		
		boolean f = a>b;
		
		return f;
		
	}
	
	public int[] getAdditionOfArray(int[] arr1,int arr2[])
	{
		
		int addarr[] = new int[arr1.length];
		
		for (int i = 0; i<arr1.length;i++)
		{
			addarr[i] = arr1[i] + arr2[i];
			
		}
		
		return addarr;
		
		
	}
	
	

}
