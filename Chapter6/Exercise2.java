package capitulo6;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		System.out.print("Enter a integer: ");
		long num = inp.nextLong();

		System.out.println("The sum of the digits in " + num + " is " +
			sumDigits(num));
	}

	public static long sumDigits(long n) {
		int sum = 0;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}

		return sum;
	}

}
