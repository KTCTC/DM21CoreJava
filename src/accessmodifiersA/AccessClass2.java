package accessmodifiersA;

public class AccessClass2 {

	public AccessClass2() {

	}

	AccessClass2(int a) {

	}

	private AccessClass2(int a, int b) {

	}

	protected AccessClass2(int a, int b, int c) {

	}
	
	
	public static void main(String[] args) {
		AccessClass2 oo1 = new AccessClass2();
		AccessClass2 oo2 = new AccessClass2(23);		
		AccessClass2 oo3 = new AccessClass2(22, 45);
		AccessClass2 oo4 = new AccessClass2(22, 45, 67);
	}

}
