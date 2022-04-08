package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetClass {

	public static void main(String[] args) {
	
		LinkedHashSet<Integer> data = new LinkedHashSet<>();
		
		data.add(12);
		data.add(1);
		data.add(67);
		data.add(3);
		data.add(12);
		data.add(67);
		System.out.println(data.size());
		data.remove(67);
		System.out.println(data);
		
		
Iterator<Integer> itr = data.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		for (Integer each: data)
		{
			System.out.println(each);
		}
		
		
		

	}

}
