package Interview;

public class ExampleNS {
	public void nonstaticMethod() {
		System.out.println("This is a nonstatic method.");
	}

	public static void main(String[] args) {
//Needs to create an object as we have created nonStaticMethod
		
		ExampleNS obj = new ExampleNS();
		obj.nonstaticMethod();

	}

}
