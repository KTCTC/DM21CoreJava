package objectclass;

public class HumenBeing {

	 String name;
	int age;
	float weight = 89.55f;

	public static void main(String[] args) {
		
		byte bt = 89;
		
		HumenBeing obj = new HumenBeing();
		HumenBeing obj2 = new HumenBeing();
		HumenBeing obj3 = obj;
		
		obj.name = "Ganesh";
		obj.age = 15;
		obj.weight = 44.45f;
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.weight);
		obj2.age = 78;
		
		System.out.println(obj2.name);
		System.out.println(obj2.age);
		System.out.println(obj2.weight);		
		obj2.age = obj.age;
		
		System.out.println(obj3.name);
		System.out.println(obj3.age);
		System.out.println(obj3.weight);
		
		obj.cantalk();
		obj2.eats();
		
		

	}

	public static void cantalk() {
		System.out.println("THis human being can talk");
	}

	public static void eats() {
		System.out.println("This human being eats pizza");
	}

}
