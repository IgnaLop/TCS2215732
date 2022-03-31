package capitulo3;

import java.util.Scanner;

public class Exercise6 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		
		System.out.print("Enter weight in pounds: ");
		double w = inp.nextDouble();
		System.out.print("Enter feet: ");
		double f = inp.nextDouble();
		System.out.print("Enter inches: ");
		double i = inp.nextDouble();

		final double Km = 0.45359237;
		final double Mt = 0.0254;
		final double Ft = 0.0833333;

		
		w *= Km; 
		double h = (i += f / Ft) * Mt;
		double bmi = w / (Math.pow(h, 2));

		System.out.println("BMI is " + bmi);

		if (bmi < 18.5)
			System.out.println("Underweight");
		
		else if (bmi < 25)
			System.out.println("Normal");
		
		else if (bmi < 30)
			System.out.println("Overweight");
		
		else
			System.out.println("Obese");
	}

}
