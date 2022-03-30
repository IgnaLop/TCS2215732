package capitulo2;

import java.util.Scanner;

public class Exercise20 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
		
		double bL = inp.nextDouble();
		
		double aI = inp.nextDouble();

		double iN = bL * (aI / 1200);

		// Display result
		System.out.println("The interest is " + iN);
	}
	

}
