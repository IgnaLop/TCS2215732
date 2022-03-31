package capitulo3;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		
		int d1 = (int)(Math.random() * 10);
		int d2 = (int)(Math.random() * 10);
		int d3 = (int)(Math.random() * 10);

		System.out.print("What is " + d1 + " + " + d2 + " + " + d3 + "? ");
		int ans = inp.nextInt();
		
		System.out.println(d1 + " + " + d2 + " + " + d3 + " = " + ans + " is " +(d1 + d2 + d3 == ans));
	}

}
