package Operators;

public class BooleanOR {

	public static void main(String[] args) {
		boolean x = true;
		boolean y = false;
		
		/* 
		 * For OR (||) operator if anyone of operands is true then the
		 * condition is true and if all the operands are false then 
		 * the condition is false.
		 */
		
		if (x || y) {
			System.out.println("Condition is true");
		}
		else {
			System.out.println("Condition is false");
		}

	}

}
