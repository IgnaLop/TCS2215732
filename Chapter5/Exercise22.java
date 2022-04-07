package capitulo5;

import java.util.Scanner;

public class Exercise22 {
	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);

		System.out.print("Loan Amount: ");
		double lA = inp.nextDouble();

		System.out.print("Number of Years: ");
		int ys = inp.nextInt();
		
		System.out.print("Annual Interest Rate: ");
		double aRate = inp.nextDouble();

		
		double mRate = aRate / 1200;

		
		double mPay = lA * mRate / (1 - 1 / Math.pow(1 + mRate, ys * 12));

		
		System.out.printf("Monthly Payment: %.2f\n", mPay);

		
		System.out.printf("Total Payment: %.2f\n", (mPay * 12) * ys);

		
		double blc = lA, prin, inter;
		
		System.out.println("Payment#     Interest     Principal     Balance");
		
		for (int i = 1; i <= ys * 12; i++) {
			
			inter = mRate * blc;
			
			prin = mPay - inter;
			
			blc = blc - prin;
			System.out.printf("%-13d%-13.2f%-13.2f%.2f\n", i, inter, prin, blc);
		}
	}

}
