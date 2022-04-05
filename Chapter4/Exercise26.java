package capitulo4;

import java.util.Scanner;

public class Exercise26 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		System.out.print("Enter an amount, for example 11.56: ");
		String am = inp.nextLine();

		String numberOfOneDollars = am.substring(0, am.indexOf('.'));

		int cents = Integer.parseInt(am.substring(am.indexOf('.') + 1));

		int numberOfQuarters = cents / 25;
		cents %= 25;

		int numberOfDimes = cents / 10;
		cents %= 10;

		int numberOfNickels = cents / 5;
		cents %= 5;

		System.out.println("Your amount " + am + " consists of\n " 			+ numberOfOneDollars + " dollars\n " 			+ numberOfQuarters + " quarters\n "			+ numberOfDimes + " dimes\n "			+ numberOfNickels + " nickels\n "			+ cents + " pennies\n "
			);
	}

}
