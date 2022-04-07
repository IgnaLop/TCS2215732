package capitulo5;

import java.util.Scanner;

public class Exercise30 {
	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);

		System.out.print("Enter an amount (e.g., 100): ");
		double amon = inp.nextDouble();

		System.out.print("Enter the annual interest rate (e.g., 5): ");
		double aIR = inp.nextDouble();
		
		System.out.print("Enter the number of months (e.g., 6): ");
		int month = inp.nextInt();

		double mIR = aIR / 1200;

		
		double cValue = 0;
		for (int m = 1; m <= month; m++) {cValue = (amon + cValue) * (1 + mIR);
		}


		System.out.printf("Amount in savings account after " + month + " months: $%.2f\n", cValue);
	}

}
