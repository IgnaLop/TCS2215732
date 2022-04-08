package capitulo5;

import java.util.Scanner;

public class Exercise50 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		
		String str = inp.nextLine();

		int ct = 0;		
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i)))
				ct++;
		}

		System.out.println("Tne number of uppercase letters is " + ct);
	}

}
