package capitulo3;

import java.util.Scanner;

public class Exercise15 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		int lot = (int)(Math.random() * 1000);


		System.out.print("Enter a three-digit number: ");
		int g = inp.nextInt();


		int lD1 = lot / 100;
		int rD = lot % 100;
		int lD2 = rD / 10;
		int lD3 = rD % 10;


		int gD1 = g / 100;
		int rD2 = g % 100;
		int gD2 = rD2 / 10;
		int gD3 = rD2 % 10;

		System.out.println("The lottery number is " + lot);


		if (g == lot)
			System.out.println("Exact match: you win $12,000");
		if (gD1 == lD2)
			System.out.println("All digits: you win $5,000");
		else 
			System.out.println("One digit: you win $2,000" );
		{

		}
	}

}
