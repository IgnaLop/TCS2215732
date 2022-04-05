package capitulo4;

import java.util.Scanner;

public class Exercise20 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		System.out.print("Enter a sting: ");
		String str = inp.nextLine();

		System.out.println(str + " has a length of " + str.length() + " and its first character is " + str.charAt(0));
	}

}
