package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> data = new ArrayList<>();
		
		String str = "Hello";
		String str1 = new String("KTCTC");
		
		data.add("Welcome ");
		data.add(str1);
		data.add(str);		
		System.out.println(data.get(2));		
		String dd = data.get(1);
		System.out.println(dd);
		
		
		

	}

}
