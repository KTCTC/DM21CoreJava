package veriables.scope;

public class VeriableScopeClass {
	int age = 89;
	static float height = 89.45f;

	public static void main(String[] args) {
		System.out.println(age);
		System.out.println(height);

	}

	public void sample() {
		int a = 90;

		System.out.println(age);
		System.out.println(height);
		System.out.println(a);

		if (age > 12) {
			int b = 78;
			System.out.println(a);
			System.out.println(height);
			System.out.println(b);

			for (; a > 12;) {
				System.out.println(forVeri);// variable can not be used before declaration and initialization
				int forVeri = 88;
				System.out.println(forVeri);
				System.out.println(b);
				System.out.println(a);

			}

			System.out.println(forVeri);

		}
		System.out.println(b);

	}

}
