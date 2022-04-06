package capitulo5;

import java.util.Scanner;

public class Exercise17 {
	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);

		System.out.print("Enter the number of lines: ");
		int nL = inp.nextInt();

		for (int rw = 1; rw <= nL; rw++) {
			// Create spaces in each row
			for (int s = nL - rw; s >= 1; s--) {
				System.out.print("  ");
			}
			for (int l = rw; l >= 2; l--) {
				System.out.print(l + " ");
			}

			for (int r = 1; r <= rw; r++) {
				System.out.print(r + " ");
			}
			// End line
			System.out.println();
		}
	}

}
