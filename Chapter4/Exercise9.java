package capitulo4;

import java.util.Scanner;

public class Exercise9 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		System.out.print("Enter a character: ");

		String s = inp.nextLine();
		char ch = s.charAt(0);

		System.out.println((int)ch);
	}

}
