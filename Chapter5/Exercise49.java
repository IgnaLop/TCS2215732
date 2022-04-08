package capitulo5;

import java.util.Scanner;

public class Exercise49 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = inp.nextLine();

		int vow, con;
		vow = con = 0;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i))) {
				if (Character.toUpperCase(str.charAt(i)) == 'A' ||
					 Character.toUpperCase(str.charAt(i)) == 'E' ||
					 
					 Character.toUpperCase(str.charAt(i)) == 'I' ||
					 
					 Character.toUpperCase(str.charAt(i)) == 'O' ||
					 
					 Character.toUpperCase(str.charAt(i)) == 'U') {
					vow++;
				}

				else
					con++;
			}

		System.out.println("The number of vowels is " + vow);
		System.out.println("The number of consonants is " + con);
	}

}
}
