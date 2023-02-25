package Interview;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter radius of circle");
		double radius = input.nextDouble();
		double area = Math.PI*radius*radius;
		System.out.println("The area of circle is "+area);
	}

}
