package enumm;

public class EnumDataClass {
	static int a=67;
	
	public enum workingDays {MON,TUE,WED,THR,FRI}
	
	 enum month {Jan, Feb, March, Apr}

	public static void main(String[] args) {
		
		System.out.println(YearsOfEngg.forthyear);

    System.out.println(workingDays.MON);
    
    System.out.println(month.Jan);
    
    for (workingDays each: workingDays.values())
    {
    	System.out.println(each);
    }
    navigateTorequiredPage(workingDays.MON);
    

	}
	
	
	public static void navigateTorequiredPage(workingDays vari)
	{
		System.out.println(vari);
	}

}
