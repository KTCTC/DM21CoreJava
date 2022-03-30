package encapsulation;

public class AA {

	public static void main(String[] args) {
		Encap oo = new Encap();
		
		oo.setBb(105);
		
		System.out.println(oo.getBb());
		
		oo.setA(-45);
		int z = oo.getA();
		System.out.println(z);
		
		EncapReadOnly obj = new EncapReadOnly();
		System.out.println(obj.getA());
		System.out.println(obj.getBb());
		System.out.println(obj.getName());
		
		EncapWriteOnly ob = new EncapWriteOnly();
		ob.setA(23);
		ob.setBb(34.3f);
		ob.setName("ref");
	  
		

	}

}
