package capitulo3;

import java.util.Scanner;

public class Exercise33 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		System.out.print("Enter weight and price for package 1: ");
		
		double w1 = inp.nextDouble();
		
		double p1 = inp.nextDouble();
		
		System.out.print("Enter weight and price for package 2: ");
		
		double w2 = inp.nextDouble();
		
		double p2 = inp.nextDouble();

		if (p1 / w1 < p2 / w2)
			System.out.println("Package 1 has a better price.");
		
		else if (p1 / w1 > p2 / w2)
			System.out.println("Package 2 has a better price.");
		
		else
			System.out.println("Two packages have the same price.");
	}

}
