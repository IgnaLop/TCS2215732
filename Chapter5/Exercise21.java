package capitulo5;

import java.util.Scanner;

public class Exercise21 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		System.out.print("Loan Amount: ");

		double lA = inp.nextDouble();
		
		System.out.print("Number of Years: ");
		
		int nY = inp.nextInt();


		System.out.println(
			"Interest Rate    Monthly Payment    Total Payment");
		
		for (double i = 5.0; i <= 10; i += 0.25) {
			System.out.printf("%-5.3f", i);
			
			System.out.print("%           ");
			
			double mI = i / 1200;
			
			double mP = lA * mI / (1 - 1 / Math.pow(1 + mI, nY * 12));
			System.out.printf("%-19.2f", mP);
			
			System.out.printf("%-8.2f\n",(mP * 12) * nY);
		}
	}

}
