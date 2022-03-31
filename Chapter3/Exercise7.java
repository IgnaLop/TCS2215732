package capitulo3;

import java.util.Scanner;

public class Exercise7 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		System.out.print("Enter an amount in double, for example 11.56: ");
		double am = inp.nextDouble();

		int rA = (int)(am * 100);


		int numberOfDollars = rA / 100;
		rA %= 100;


		int numberOfQuarters = rA / 25;
		rA %= 25;


		int numberOfDimes = rA / 10;
		rA %= 10;


		int numberOfNickels = rA / 5;
		rA %= 5;


		int numberOfPennies = rA;

		// Display results
		System.out.println("Your amount " + am + " consists of");
		System.out.println(" " + numberOfDollars + (numberOfDollars == 1 ? " dollar" : " dollars"));
		System.out.println(" " + numberOfQuarters + (numberOfQuarters == 1 ? " quarter" : " quarters"));
		System.out.println(" " + numberOfDimes + (numberOfDimes == 1 ? " dime" : " dimes")); 
		System.out.println(" " + numberOfNickels + (numberOfNickels == 1 ? " nickel" : " nickels"));
		System.out.println(" " + numberOfPennies + (numberOfPennies == 1 ? " pennie" : " pennies"));
	}

}
