package capitulo2;

import java.util.Scanner;

public class Exercise23 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		
		System.out.print("Enter the driving distace: ");
		double d = inp.nextDouble();
		
		System.out.print("Enter miles per gallon: ");
		double mG = inp.nextDouble();

		System.out.print("Enter price per gallon: ");
		double pG = inp.nextDouble();

		double cD = (d / mG) * pG;

		System.out.println("The cost of driving is $" + cD);
	}

}
