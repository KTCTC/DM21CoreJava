package abstracts.classs;

public class SampleConcrateClass extends AbstractClass{

	public static void main(String[] args) {
		
		AbstractClass oo = new SampleConcrateClass();
		
		oo.abstractMethod1();
		
		SampleConcrateClass obj = new SampleConcrateClass();
		obj.abstractMethod1();
		obj.samplreNonstaticMethosd();
		obj.abcd = 78;
		System.out.println(obj.abcd);

	}

	@Override
	public void abstractMethod1() {

        System.out.println("This is abstract method from abstract class. Implemented by concrate class");
		
	}

	@Override
	public void sampleAbstractMethodFromAbstractSampleClass() {
		System.out.println("Implemented method in concrate class");
		
	}

}
