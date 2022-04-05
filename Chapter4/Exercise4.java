package capitulo4;

import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		System.out.print("Enter the side: ");
		double s = inp.nextDouble();

		double a = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6));

		System.out.printf("The are of the hexagon is %4.2f\n", a);
	}
	 
}
