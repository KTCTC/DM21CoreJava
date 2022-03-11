package operators;

public class UneryOperator {

	public static void main(String[] args) {
		//Unary operator exp++,exp--,++exp,--exp,~,!
		
		int a = 5;//-4,-5
		int b = 7;//8,7
		
		
		boolean f2 = !(a<b);
		System.out.println(f2);
		
		boolean fl = false;
		
		boolean f1 = !fl;
		System.out.println(f1);
		
		int i = ~a;  // a*-1 -1 
		System.out.println(i);
		
		int h = ++a-++b+--a+--b+--a;// -4-8-5+7-6
		System.out.println(h);
		
		
		int g = --a+--b-++a+--b;
		
		System.out.println(g);
		
		int f = --b;
		System.out.println(f);
		System.out.println(b);
		
		int e = ++a;
		System.out.println(e);
		System.out.println(a);
		
		
		int d = b--;
		System.out.println(d);
		System.out.println(b);
		
		int c = a++;
		System.out.println(c);
		System.out.println(a);
		   

	}

}
