package Array;

public class Array_2D {

	public static void main(String[] args) {
		/*
		 * What is 2D Array?
		 * How to get length of 2D Array?
		 * How add elements to 2D Array?
		 * How to update elements of 2D Array?
		 * How to iterate over 2D Array using modified for loop?
		 */
		
		String [] [] arr = {
				              {"A","B", "C"},
				              {"E","F"}, 
				              {"SDF", "FG", "JH"} 
				           };
		System.out.println(arr.length);
		System.out.println(arr[0].length); //Gives length of an array at zeroth index
		System.out.println(arr[2].length); //Gives length of an array at second index
		System.out.println(arr[2][1]);
		arr[2][1] = "AAAA";
		System.out.println(arr[2][1]);
		
		for (String [] x : arr) {
			for (String y : x) {
				System.out.println(y);
			}
			System.out.println("---------------");
		}

	}

}
