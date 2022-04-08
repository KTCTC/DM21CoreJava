package collection;

import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {

		TreeSet<Integer> data = new TreeSet<>();

		data.add(23);
		data.add(6);
		data.add(33);
		data.add(2);
		//data.add(null); // if tree set has null value then java can not sort it. So, at run time exception will be displayed

		System.out.println(data);
		
		for (Integer each: data)
		{
			System.out.println(each);
		}
		

	}

}
