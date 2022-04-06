package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> data = new ArrayList<>();
		
		Student obj1 = new Student(1, "Ajay");
		Student obj2 = new Student(2, "Amit");
		
		data.add(obj2);		
		data.add(obj1);
		data.add(new Student(44, "Sanket"));
		
		Student oo = data.get(1);
		
		oo.displayStudentInformation();
		
		System.out.println(oo.rollnum);
		
		System.out.println(data.get(2).name);
		
		data.get(2).displayStudentInformation();
		
		System.out.println(data);
		
		

	}

}
