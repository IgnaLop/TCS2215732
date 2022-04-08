package capitulo5;

import java.util.Scanner;

public class Exercise38 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);


		System.out.print("Enter a decimal integer: ");
		int dec = inp.nextInt();


		String oct = "";
		for (int i = dec; i > 0; i /= 8) {
			oct = i % 8 + oct;
		}

		System.out.println("The octal of " + dec + " is " + oct);
	}

}
