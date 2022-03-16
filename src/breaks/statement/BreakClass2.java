package breaks.statement;

public class BreakClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before code");
		
		
		
		
		outer : for (int i = 0; i < 2; i++) {

			System.out.println("For integer value i = " + i);

			inner : for (int j = 0; j < 2; j++) {
				System.out.println("For integer value j = " + j);
				if (i==j)
				{
					break outer;
					
				}
				
			}
		
		}
		
		
		
		outer : for (int i = 0; i < 2; i++) {

			System.out.println("For integer value i = " + i);

			inner : for (int j = 0; j < 2; j++) {
				System.out.println("For integer value j = " + j);
				break;
				
			}
		
		}
		
		
		outer : for (int i = 0; i < 2; i++) {

			System.out.println("For integer value i = " + i);

			inner : for (int j = 0; j < 2; j++) {
				System.out.println("For integer value j = " + j);
				
				
			}
			break;
		
		}
		System.out.println("After code");


	}

}
