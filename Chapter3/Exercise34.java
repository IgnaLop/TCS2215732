package capitulo3;

import java.util.Scanner;

public class Exercise34 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		System.out.print("Enter three points for p0, p1, and p2: ");

		double x0 = inp.nextDouble();
		
		double y0 = inp.nextDouble();
		
		double x1 = inp.nextDouble();
		
		double y1 = inp.nextDouble();
		
		double x2 = inp.nextDouble();
		
		double y2 = inp.nextDouble();

		boolean on = !(((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) > 0 || ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) < 0 || (x2 < x0) || (y2 < y0) || (x2 > x1) || (y2 > y1));

		System.out.print("(" + x2 + ", " + y2 + ") is ");

		if (!on)
			System.out.print("not ");
		
		System.out.println("on the line segment from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
	}

}
