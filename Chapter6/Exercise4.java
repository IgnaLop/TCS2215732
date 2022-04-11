package capitulo6;

import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		System.out.println("Display and integer reversed:");
		
		System.out.print("Enter an integer: ");
		int num = inp.nextInt();

		reverse(num);
	}
 
	public static void reverse(int num) {
		while (num > 0) {
			System.out.print((num % 10));
			num /= 10;
		}
		System.out.println();
	}

}
