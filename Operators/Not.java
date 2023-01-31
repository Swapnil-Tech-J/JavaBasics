package Operators;

public class Not {

	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		
		if(!((x < y) || (x == y))) {
			System.out.println("Condition is true");
		} else {
			System.out.println("Condition is false");
		}

	}

}
