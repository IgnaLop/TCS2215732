package capitulo2;

import java.util.Scanner;

public class Exercise12 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter speed and acceleration: ");
		
		double sp = inp.nextDouble();
		double ac = inp.nextDouble();
		double len = Math.pow(sp, 2) / (2 * ac);

		System.out.println("The minimum runway length for this" + " airplane is " + len);
	}

}
