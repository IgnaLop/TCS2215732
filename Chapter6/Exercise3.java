package capitulo6;

import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);


		System.out.print("Enter an integer: ");
		int num = inp.nextInt();


		System.out.println(num + (isPalindrome(num) ? " is " : " is not ") +
			"a palindrome.");
	}


	public static boolean isPalindrome(int num) {
		return num == reverse(num) ? true : false;
	}

	
	public static int reverse(int num) {
		String rev = "";
		String n = num + "";

		for (int i = n.length() - 1; i >= 0; i--) {
			rev += n.charAt(i);
		}
		return Integer.parseInt(rev);
	}

}
