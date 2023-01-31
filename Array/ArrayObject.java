package Array;

public class ArrayObject {

	public static void main(String[] args) {
		//Default value for integer is zero
		int [] arr1 = new int [10];
		
		arr1[0] = 20;
		arr1[1] = 40;
		arr1[2] = 800;
		arr1[3] = 20;
		arr1[4] = 960;
		arr1[5] = 70;
		
		for (int i=0; i<=arr1.length-1; i++)
		{
			System.out.println(arr1[i]);
		}

	}

}
