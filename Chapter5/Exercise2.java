package capitulo5;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		final int NOQ = 10;	
		int cCt = 0;	
		int ct = 0;
		long sT = System.currentTimeMillis();
		String out = " ";
		Scanner inp = new Scanner(System.in);

		while (ct < NOQ) {
			int n1 = 1 + (int)(Math.random() * 12);
			
			int n2 = 1 + (int)(Math.random() * 12);

			System.out.print("What is " + n1 + " + " + n2 + "? ");
			
			int ans = inp.nextInt();

			if (n1 + n2 == ans) {
			
				System.out.println("You are correct!");
			
				cCt++;
			}
			else
			
				System.out.println("Your answer is wrong.\n" + n1 + " + " + n2 + " should be " + (n1 + n2));
			
			ct++;

			out += "\n" + n1 + "+" + n2 + "=" + ans + ((n1 + n2 == ans) ? " correct" : " wrong");
		}

		long eT = System.currentTimeMillis();
		long tT = eT - sT;

		System.out.println("Correct count is " + cCt + "\nTest time is " + tT / 1000 + " seconds\n" + out);
	}

}
