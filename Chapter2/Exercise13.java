package capitulo2;

import java.util.Scanner;

public class Exercise13 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		final double mRate = 0.003125;	

		System.out.print("Enter the monthly saving amount: ");
		double sAm = inp.nextDouble();

		
		double total = 100 * (1 + mRate);
		
		double total1 = (100 + total) * (1 + mRate);
		
		double total2 = (100 + total1) * (1 + mRate);
		
		double total3 = (100 + total2) * (1 + mRate);
		
		double total4 = (100 + total3) * (1 + mRate);
		
		double total5 = (100 + total4) * (1 + mRate);

		
		System.out.println("After the first month, the account value is " + total);
		System.out.println("After the second month, the account value is " + total1);
		System.out.println("After the third month, the account value is " + total2);
		System.out.println("After the sixth month, the account value is " + total5);
	}

}
