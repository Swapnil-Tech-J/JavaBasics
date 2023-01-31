package Array;

public class App3 {

	public static void main(String[] args) {
		int value = 10;
		App3 app = new App3();
		app.displayValue(value);
		System.out.println("Current Value of variable in main method is " + value);
		
		
	}
	void displayValue(int value) {
		System.out.println("current value of variable in displayValue method is " + value);
		value = 20;
		System.out.println("current value of variable in displayValue method is " + value);
	}

}
