package Array;

public class App4 {

	public static void main(String[] args) {
		int value = 10;
		System.out.println("Current value of variable in main method is "+value);
		App4 app = new App4();
		app.displayValue(value);
		System.out.println("Current value of variable in main method is "+value);
		

	}
	void displayValue(int value) {
		System.out.println("Current value of variable in displayValue is "+value);
		value = 20;
		System.out.println("Current value of varible in displayValue method is "+value);
	}

}
