package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> data = new ArrayList<>();
		
		Integer a = new Integer(230);
		Integer b = new Integer(330);		
		int c = 56;		
		Integer d = new Integer(56);		
		data.add(a);		
		data.add(b);
		
		int siz = data.size();
		System.out.println(siz);		
		data.add(new Integer(44));
		data.add(c);
		data.add(55);
		data.add(a);		
		data.remove(0);		
		siz = data.size();
		System.out.println(siz);		
	  	Integer z = data.get(2);
	  	System.out.println(z);	  	
	  	int y = data.get(4);	  	
	  	Collections.sort(data);		
	  	System.out.println(y);
		System.out.println(data);
		
		for (int i=0; i<data.size();i++)
		{
			System.out.println(data.get(i));
		}
		
		for (Integer each:data)
		{
			System.out.println(each);
		}
		
		
		

	}

}
