package capitulo3;

import java.util.Scanner;

public class Exercise27 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter a point's x- and y-coordinates: ");
		
		double x = inp.nextDouble();
		
		double y = inp.nextDouble();

		double intersectx = (-x * (200 * 100)) / (-y * 200 - x * 100);

		double intersecty = (-y * (200 * 100)) / (-y * 200 - x * 100);

		
		System.out.println("The point " + ((x > intersectx || y > intersecty) ? "is not " : "is " ) + "in the triangle");
	}

}
