package hashmap;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapClass3 {

	public static void main(String[] args) {

		HashMap<String, String> data = new HashMap<>();

		data.put("FirstName", "Amit");
		data.put("LastName", "Patil");
		data.put("City", "Pune");
		data.put("Indian", "Yes");
		
		
		System.out.println(data.get("Indian"));
		
		data.remove("Indisgfsfswfan");
		
		for (Entry<String, String> each:data.entrySet())
		{
			System.out.println(each.getKey());
			System.out.println(each.getValue());
			
		}
		
		
		

	}

}
