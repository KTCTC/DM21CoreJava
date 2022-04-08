package collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {

	public static void main(String[] args) {
// As set does not maintain incertion order, set does not have get(int index) method
		HashSet<Integer> data = new HashSet<>();
		
		Integer a ;
        data.add(null);
		data.add(12);
		data.add(34);
		data.add(12);
		data.add(5);
		data.add(5675);
		data.add(67);
		data.add(656);
		data.add(5);
		data.add(null);
		data.add(null);
		System.out.println(data);
		// remove method takes object as parameter (not index number).
		data.remove(12);
		System.out.println(data);
		System.out.println(data.size());
		
		Iterator<Integer> itr = data.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		for (Integer ch:data)
		{
			System.out.println(ch);
		}

	}

}
