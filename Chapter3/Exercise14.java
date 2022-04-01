package capitulo3;

import java.util.Scanner;

public class Exercise14 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		int c = (int)(Math.random() * 2);

		System.out.print("Enter a guess 0-head or 1-tail: ");
		int g = inp.nextInt();

		System.out.println(((g == c) ? "Correct" : "Incorrect") + " guess."); 
	
	}

}
