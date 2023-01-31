package Array;

import java.util.ArrayList;

class intWraper {
	public int intValue;

	public intWraper(int intValue) {
		super();
		this.intValue = intValue;
	}

	/**
	 * @return the intValue
	 */
	public int getIntValue() {
		return intValue;
	}

	/**
	 * @param intValue the intValue to set
	 */
	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}
	
}

public class Autoboxing {

	public static void main(String[] args) {
		/*ArrayList<Integer> studentNumbers = new ArrayList<>();
		studentNumbers.add(25); //Autoboxing
		System.out.println(studentNumbers.get(0));
		
		ArrayList<intWrapper> studentNumbers = new ArrayList<>();
		studentNumbers.add(new intWrapper(12)); //boxing-> converting primitive data type into an object
		System.out.println(studentNumbers.get(0).getIntValue()); //unboxing */
		
		ArrayList<Double> demoList = new ArrayList<>();
		//demoList.add(25.5);
		//demoList.add(new Double(25.2));
		demoList.add(Double.valueOf(10.0)); //This is done while autoboxing
		//System.out.println(demoList.get(0));
		System.out.println(demoList.get(0).doubleValue()); //This is done while unboxing

		

	}

}
