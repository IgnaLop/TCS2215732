package capitulo5;

import java.util.Scanner;

public class Exercise51 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		System.out.print("Enter the first string: ");
		String str1 = inp.nextLine();
		System.out.print("Enter the second string: ");
		String str2 = inp.nextLine();

		int ind = 0;
		String pref = "";


		while (str1.charAt(ind) == str2.charAt(ind)) {
			pref += str1.charAt(ind);
			ind++;
		}


		if (pref.length() > 0)
			System.out.println("The commmon prefix is " + pref);

		else
			System.out.println(str1 + " and " + str2 + " have no commmon prefix");
	}

}
