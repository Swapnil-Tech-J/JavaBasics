package Array;

public class MyDemoClass {

	public static void main(String[] args) {
		
		//2D Array
		int [][] myArray = {
				             {2,45,6,32},
				             {4,65,34,9}, 
				             {7,8,12,15}
				            };
		
		//r for Row and c for coloumn
		
	        for (int r = 0; r<myArray.length; r++)  {
			for (int c=0; c<myArray[r].length; c++) {
				System.out.print(myArray[r][c] + " ");
			}
			System.out.println();
		}
	        //WAP to find sum
	        
	        int sum = 0;
	        
	        for(int i=0; i<myArray.length; i++) {
	        	
	        	for (int j=0; j<myArray[i].length; j++) {
	        		sum = sum+myArray [i] [j];
	        	}
	        	
	        }
	        System.out.println("Sum is " + sum);
	}

}
