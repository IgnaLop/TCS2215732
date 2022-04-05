package capitulo4;

import java.util.Scanner;

public class Exercise5 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		System.out.print("Enter the number of sides: ");

		int numberOfSides = inp.nextInt();
		System.out.print("Enter the side: ");
		
		double s = inp.nextDouble();
		double a = (numberOfSides * Math.pow(s, 2) / (4 * Math.tan(Math.PI / numberOfSides)));

		System.out.println("The area of the polygon is " + a);
	}

}
