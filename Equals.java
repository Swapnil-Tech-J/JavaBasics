package string_operations;

public class Equals {

	public static void main(String[] args) {
		/**
		 * Equals
		 * Compare To
		 * Matches
		 */
		String str1 = "ABCDE";
		String str2 = "ABCDe";
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		if (str1.equals(str2)) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are not equal");
		}
		
		
	}

}
