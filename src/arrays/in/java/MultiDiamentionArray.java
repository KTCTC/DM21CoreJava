package arrays.in.java;

import java.util.Arrays;

public class MultiDiamentionArray {

	public static void main(String[] args) {
		
		int arrMulti[][] = {{2,4},{6,3}, {23,56}, {3,6}};
		
		
		int[] pq = arrMulti[1];
		
		System.out.println(pq[0]);
		System.out.println(pq[1]);
		
		Arrays.sort(pq);
		Arrays.sort(arrMulti); // it will not sort multidimentional array
		
		boolean flag = Arrays.equals(arrMulti[1], arrMulti[3]);
		System.out.println(flag);
		
		int a = arrMulti[0][1];
		System.out.println(a);
		
		int b = arrMulti[1][0];
		System.out.println(b);
		
		int lng = arrMulti.length;
		System.out.println(lng);
		
		
		

	}

}
