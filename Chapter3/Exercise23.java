package capitulo3;

import java.util.Scanner;

public class Exercise23 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		System.out.print("Enter a point with two coordinates: ");

		double x = inp.nextDouble();
		
		double y = inp.nextDouble();


		boolean wR = (Math.pow(Math.pow(x, 2), 0.5) <= 10 / 2 ) || (Math.pow(Math.pow(y, 2), 0.5) <= 5.0 / 2);

		System.out.println("Point (" + x + ", " + y + ") is " +	((wR) ? "in " : "not in ") + "the rectangle");
	}

}
