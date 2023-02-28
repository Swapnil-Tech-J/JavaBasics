package Interview;

public class ExampleSM {
	
	public static void staticMethod() {
		System.out.println("This is a static method.");
	}

	public static void main(String[] args) {
	 //No need to create object as we are using static method
		ExampleSM.staticMethod();

	}

}
