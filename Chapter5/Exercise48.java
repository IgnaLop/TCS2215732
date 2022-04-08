package capitulo5;

import java.util.Scanner;

public class Exercise48 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = inp.nextLine();

		String oddP = "";

		for (int i = 1; i < str.length(); i+=2) {
			oddP += str.charAt(i);
		}

		System.out.println(oddP);
	}

}
