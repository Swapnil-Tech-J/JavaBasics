package Array;

public class DefiningArray {

	public static void main(String[] args) {
		//type[] arrayName = new type[size];
		/*
		 * What is an array?
		 * What is length of array?
		 * how to update array elements?
		 * Iterating on array elements using For Loop.
		 */
		
		String [] DaysOfWeek = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat","Sun"};
		System.out.println(DaysOfWeek.length);
		System.out.println(DaysOfWeek[2]);
		
		for(int i=0; i<=DaysOfWeek.length-1; i++)
		{
			System.out.println(DaysOfWeek[i]);
		}
		
		int [] arr1 = {12,34,34,65,765,678,87654,456};
		System.out.println (arr1 [5]);
		for (int i=0; i<=arr1.length-1; i++)
		{
			System.out.println(arr1[i]);
		}
		
		char [] arr2 = {'a','e','i'};
		System.out.println(arr2 [1]);
		
		for(char i=0; i<=arr2.length-1; i++)
		{
			System.out.println(arr2[i]);
		}
	}
}
	
