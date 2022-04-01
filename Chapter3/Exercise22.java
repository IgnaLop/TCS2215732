package capitulo3;

import java.util.Scanner;

public class Exercise22 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		System.out.print("Enter a point with two coordinates: ");

		double x = inp.nextDouble();
		
		double y = inp.nextDouble();

		boolean wC= (Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5) <= 10);

		System.out.println("Point (" + x + ", "+ y + ") is " + ((wC) ? "in " : "not in ") + "the circle"); 
	}

}
