package capitulo5;

import java.util.Scanner;

public class Exercise42 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		double com = 0.0, bal, sA;

		System.out.print("Enter the commission sought: ");
		double comS = inp.nextDouble();


		for (sA = 0.01; com < comS; sA += 0.01) {
		 	bal = com = 0.0;	// Set balance and commission to 0


			if (sA >= 10000.01)
				com += (bal = sA - 10000) * 0.12;


			if (sA >= 5000.01)
				com += (bal -= bal - 5000) * 0.10;


			if (sA >= 0.01)
				com += bal * 0.08;

		}


		System.out.printf("Minimum sales to earn $%.0f: $%.0f\n", comS, sA);
	}

}
