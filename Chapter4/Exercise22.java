package capitulo4;

import java.util.Scanner;

public class Exercise22 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		System.out.print("Enter string s1: ");
		String s1 = inp.nextLine();
		System.out.print("Enter string s2: ");
		String s2 = inp.nextLine();

		System.out.println(s2 + ((s1.contains(s2)) ? " is " : " is not ") + "a substring of " + s1);
	}

}
