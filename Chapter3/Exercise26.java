package capitulo3;

import java.util.Scanner;

public class Exercise26 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int num = inp.nextInt();

		System.out.println("Is 10 divisible by 5 and 6? " +	((num % 4 == 0) && (num % 5 == 0)));
		
		System.out.println("Is 10 divisible by 5 or 6? " + ((num % 4 == 0) || (num % 5 == 0)));
		
		System.out.println("Is 10 divisible by 5 of 6, but not both? " + ((num % 4 == 0) ^ (num % 5 == 0)));
	
	}

}
