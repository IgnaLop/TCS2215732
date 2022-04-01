package capitulo3;

import java.util.Scanner;

public class Exercise12 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter a three-digit integer: ");
		
		int num = inp.nextInt();

		int d1 = (int)(num / 100);
		int rem = num % 100;
		int d3 = (int)(rem % 10);

		// Display result
		System.out.println(num + ((d1 == d3) ? " is a " : " is not a ") + "palindrome");
	}

}
