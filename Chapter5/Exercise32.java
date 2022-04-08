package capitulo5;

import java.util.Scanner;

public class Exercise32 {
	public static void main(String[] args) {

		int lD1, lD2;
		lD1 = (int)(Math.random() * 10);

		do {
			lD2 = (int)(Math.random() * 10);
		} while (lD1 == lD2);


		Scanner inp = new Scanner(System.in);
		System.out.print("Enter your lottery pick (two distinct digits): ");
		int guess = inp.nextInt();


		int gD1 = guess / 10;
		int gD2 = guess % 10;

		System.out.println(
			"The lottery number is " + lD1 + lD2);


		if (gD1 == lD1 &&
			 gD2 == lD2)
			System.out.println("Exact match: you win $10,000");
		
		else if (gD2 == lD1
				&& gD1 == lD2)
			System.out.println("Match all digits: you win $3,000");
		
		else if (gD1 == lD1
				|| gD1 == lD2
				|| gD2 == lD1
				|| gD2 == lD2)
			System.out.println("Match one digit: you win $1,000");
		
		else
			System.out.println("Sorry, no match");
	}

}
