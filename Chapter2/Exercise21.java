package capitulo2;

import java.util.Scanner;

public class Exercise21 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter investment amount: ");
		
		double am = inp.nextDouble();
		
		System.out.print("Enter annual interest rate in percentage: ");
		
		double mI = inp.nextDouble();
		
		mI /= 1200;
		
		System.out.print("Enter number of years: ");
		
		int y = inp.nextInt();

		
		double fValue = am * Math.pow(1 + mI, y * 12);
		
		System.out.println("Accumulated value is $" + fValue);
	}

}
