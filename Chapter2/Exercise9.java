package capitulo2;

import java.util.Scanner;

public class Exercise9 {
	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);

		System.out.print("Enter v0, v1 and t: ");
		
		double v0 = inp.nextDouble();
		double v1 = inp.nextDouble();
		double t = inp.nextDouble();

		
		double a = (v1 - v0) / t;

		System.out.println("The average acceleration is " + a);
	
	}

}
