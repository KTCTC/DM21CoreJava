package objectclass;

public class AObjectClass {

	public static void main(String[] args) {
		ArithMaticCalculations acobj = new ArithMaticCalculations();
		ArithMaticCalculations acobj2 = new ArithMaticCalculations();
		HumenBeing hbObj = new HumenBeing();
		hbObj.name = "Madhuri";		
		System.out.println(hbObj.name);
		hbObj.cantalk();
		
		acobj.a = 67;
		acobj.b = 55;
		acobj2.a = 7;
		acobj2.b = 4;
		
		acobj2.addition();
		acobj2.substraction();
		acobj.addition();
		acobj.substraction();
		
		

	}

}
