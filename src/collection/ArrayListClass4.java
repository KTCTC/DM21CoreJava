package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Object> data = new ArrayList<>();
		
		ArthCal oo = new ArthCal(23, 33);
		
		Student obj1 = new Student(1, "Ajay");
		Student obj2 = new Student(2, "Amit");
		
		data.add(obj2);		
		data.add(obj1);
		data.add(new Student(44, "Sanket"));
		data.add(oo);
		data.add("Hello welcome to KTCTC");
		data.add(34);
		
		Object ao = data.get(1);
		
		Student so = (Student) ao;
		so.displayStudentInformation();
		
		Object gh = data.get(3);
		ArthCal aro = (ArthCal) gh;
		aro.addition();
		
		
		float tt = 78.44f;
		
		int acc = 67;
		
		acc = (int)tt;
		System.out.println(acc);
		
		

	}

}
