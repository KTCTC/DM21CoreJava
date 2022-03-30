package encapsulation;

public class Encap {

	private int a;
	private String name;
	private float bb;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		
		if (a<0)
		{
			this.a = 0;
			
		}
		else
		{
			this.a = a;
		}		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBb() {
		return bb;
	}
	public void setBb(float bb) {
		
		if (bb<0)
		{
			this.bb = 0;
		}
		else if (bb>100)
		{
			this.bb = 100;
		}
		else
		{
			this.bb = bb;
		}
		
		
	}
	
	
}
