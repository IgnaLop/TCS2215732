package capitulo3;

import java.util.Scanner;

public class Exercise10 {
	public static void main(String[] agrs) {
		Scanner inp = new Scanner(System.in);

		int n1 = (int)(Math.random() * 1000);
		int n2 = (int)(Math.random() * 1000);

		System.out.print("What is " + n1 + " * " + n2 + "? ");
		int answer = inp.nextInt();

		// Display result
		if (n1 * n2 == answer)
			System.out.println("You are correct!");
		else
			System.out.println("You are wrong " + n1 + " + " + n2 + " should be " + (n1 + n2));
	}

}
