package wrapper;

public class WrapperClass {

	public static void main(String[] args) {
		WrapperClass oo = new WrapperClass();
		WrapperClass obj = oo;
		System.out.println(oo);
		String data = "34ewfsfwef";
		byte bt = 34;
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		
		System.out.println(Integer.valueOf(bt));
		
		
		int zx = Integer.valueOf(data);
		int zz = Integer.parseInt(data);
		System.out.println(zz);
System.out.println(zx);
		int a = 78;

		Integer aa = new Integer(34);

		Integer ab = Integer.valueOf(a);

		int ba = aa.intValue();

		System.out.println(ba);

		aa = 55;

		int z = aa;

		System.out.println(aa);
		System.out.println(ab);

	}

}
