package wrapper;

public class WrapperClass2 {

	public static void main(String[] args) {
		String dd = "dfsdfsdg";	
		
		Boolean f1 = new Boolean(false);
		
		boolean f2 = Boolean.valueOf(f1);
		System.out.println(f2);
		
		boolean f3 = Boolean.valueOf(dd);
		System.out.println(f3);
		
		boolean f4 = f1;
		System.out.println(f4);

	}

}
