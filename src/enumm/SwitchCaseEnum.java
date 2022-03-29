package enumm;

import java.io.ObjectInputStream.GetField;

public class SwitchCaseEnum {

	public enum color {Red, Green, Blue}
	public static void main(String[] args) {

color abc = color.Green;


		getColorInfo(abc);
		

	}
	
	
	public static void getColorInfo(color pqr)
	{
		switch (pqr) {
		case Red:
			System.out.println("You have selected red color");
			
			break;
		case Green:
			System.out.println("You have selected green color");
			break;
		case Blue:
			System.out.println("You have selected blue color");
			break;

		default:
			System.out.println("You have selected color which is not present in datatype");
			break;
		}
				
	}

}
