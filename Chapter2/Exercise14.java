package capitulo2;

import java.util.Scanner;

public class Exercise14 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		final double kg = 0.45359237;
		final double met = 0.0254;

		System.out.print("Enter weight in pounds: ");
		double weight = inp.nextDouble();

		
		System.out.print("Enter height in inches: ");
		double height = inp.nextDouble();

		
		weight = weight * kg;

		
		height = height * met;

		
		double bm = weight / Math.pow(height, 2);

		
		System.out.println("BMI is " + bm);
	}
}
