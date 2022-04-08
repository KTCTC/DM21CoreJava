package collection;

import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {


		Stack<Integer> data = new Stack<>();
		data.add(34);
		data.push(5);
		data.push(9);
		data.push(2);
		data.push(4);
		data.push(7);
		
		int z = data.pop();
		System.out.println(z);
		data.get(2);
		System.out.println(data);

	}

}
