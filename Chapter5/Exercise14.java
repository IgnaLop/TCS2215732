package capitulo5;

import java.util.Scanner;

public class Exercise14 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		
		int n1 = inp.nextInt();
		
		System.out.print("Enter second integer: ");
		
		int n2 = inp.nextInt();


		int gcd = n1 < n2 ? n1 : n2;


		while (n1 % gcd != 0 || n2 % gcd != 0) {
			gcd--;
		}


		System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);
	}
}