package hashmap;

import java.util.HashMap;
import java.util.Map.Entry;

import collection.Student;

public class HashMapClass2 {

	public static void main(String[] args) {
		
		Student obj1 = new Student(1, "Ajay");
		Student obj2 = new Student(2, "Amit");

		HashMap<Character, Student> data = new HashMap<>();

		data.put('a', obj1);
		data.put('b', obj2);
		data.put('c', new Student(44, "DilipKumar"));
		//data.put(null, null);
		//data.put(null, obj1);
		//data.put(null, null);
		//data.put('d', null);
		
	Student oo = data.get('b');
	System.out.println(oo.name);
	oo.displayStudentInformation();
		
		
		
		for (Entry<Character, Student> each:data.entrySet())
		{
			System.out.println(each.getKey());
			System.out.println(each.getValue().rollnum);
			System.out.println(each.getValue().name);
			
			
		}
		
		
		

	}

}
