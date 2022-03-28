package capitulo2;

import java.util.Scanner;

public class Exercise10 {
	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);

		
		System.out.print("Enter the amount of water in kilograms: ");
		double kg = inp.nextDouble();
		
		System.out.print("Enter the initial temperature: ");
		double iTemp = inp.nextDouble();
		
		System.out.print("Enter the final temperature: ");
		double fTemp = inp.nextDouble();

		
		double eG = kg * (fTemp - iTemp) * 4184;

		
		System.out.println("The energy needed is " + eG);
	}

}
