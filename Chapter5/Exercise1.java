package capitulo5;

import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter your score: ");
		int num = inp.nextInt();
		
		if (num >= 60) {
			System.out.println("You pass the exam.");

		}
		
		if (num <=-1) {
			System.out.println("No numbers are entered except 0");

		}
		
		else {
			System.out.println("You dont pass the exam.");
		}
	}
}
