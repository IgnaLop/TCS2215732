package capitulo6;

import java.util.Scanner;

public class Exercise21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String string = input.nextLine();
		
		for (int i = 0; i < string.length(); i++) {
			if (Character.isLetter(string.charAt(i)))
				System.out.print(getNumber(Character.toUpperCase(string.charAt(i))));
			else
				System.out.print(string.charAt(i));
		}
		System.out.println();
	}
	
	public static int getNumber(char upLetter) {
		// Return the character's number reference in the international 
		// standard letter/number mapping for telephones
		if (upLetter >= 'W')
			return 9;
		else if (upLetter >= 'T')
			return 8;
		else if (upLetter >= 'P')
			return 7;
		else if (upLetter >= 'M')
			return 6;
		else if (upLetter >= 'J')
			return 5;
		else if (upLetter >= 'G')
			return 4;
		else if (upLetter >= 'D')
			return 3;
		else 
			return 2;
	}

}
