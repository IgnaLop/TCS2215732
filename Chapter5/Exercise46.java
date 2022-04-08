package capitulo5;

import java.util.Scanner;

public class Exercise46 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);


		System.out.print("Enter a string: ");
		String str = inp.nextLine();


		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}


		System.out.println("The reversed string is " + rev);
	}

}
