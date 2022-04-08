package capitulo5;

import java.util.Scanner;

public class Exercise47 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
		String isb = inp.nextLine();

		if (isb.length() != 12) {
			System.out.println(isb + " is an invalid input");
			System.exit(1);
		}

		int check = 0;

		for (int i = 0; i < isb.length(); i++) {
			check += i % 2 == 0 ? 3 * Integer.parseInt(isb.charAt(i) + "") 
				: Integer.parseInt(isb.charAt(i) + "");  
		}
		check = 10 - check % 10;

		System.out.println("The ISBN-13 number is " + isb +	(check == 10 ? 0 : check));
	}

}
