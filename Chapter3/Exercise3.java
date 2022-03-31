package capitulo3;

import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		System.out.print("Enter a, b, c, d, e, f: ");
		double a = inp.nextDouble();
		double b = inp.nextDouble();
		double c = inp.nextDouble();
		double d = inp.nextDouble();
		double e = inp.nextDouble();
		double f = inp.nextDouble();

		if (a * d - b * c == 0)
			System.out.println("The equation has no solution.");
		
		else {
			double x = (e * d - b * f) / (a * d - b * c);
			double y = (a * f - e * c) / (a * d - b * c);
			System.out.println("x is " + x + " and y is " + y);
		}
	}

}
