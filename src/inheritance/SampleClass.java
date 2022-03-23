package inheritance;

public class SampleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	A<--B<--C
	
// We can not create reference of child class and object(constructor) of parent class
// object can access methods and variables according to reference not based on constructor
		
		
		C oo = new C();
		
		System.out.println(oo.aa);
		System.out.println(oo.bb);
		System.out.println(oo.cc);
		
		
		
		
   A aa = new A();
   A ab = new B();
   A ac = new C();
     
   
  B ba = new A(); 
  
  
   B bb = new B();
   B bc = new C();
   
   
  C ca = new A();
   C cb = new B();
   C cc = new C();
 
		

	}

}
