package collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListClass {

	public static void main(String[] args) {

		List<Character> data = new LinkedList<>();

		Character ch1 = new Character('d');
		Character ch2 = new Character('w');
		Character ch3 = new Character('r');
		
		data.add(ch1);
		data.add(ch2);
		data.add(ch3);
		data.add('y');
		data.add('y');
		data.add(ch2);
		
		data.remove(0);
		
		System.out.println(data);
		Collections.sort(data);
		
		for (Character c:data) {
			
			System.out.println(c);
		}

	}

}
