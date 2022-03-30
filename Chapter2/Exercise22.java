package capitulo2;

import java.util.Scanner;

public class Exercise22 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter an amount as integer, example 1353 = 13.53: ");
		
		int am = inp.nextInt();
		int rA = am;

		int nD = rA / 100;
		rA %= 100;

		int nC = rA / 1;
		rA %= 1;

		System.out.println("Your amount " + am / 100.0 + " consists of");
		
		System.out.println(" " + nD + " dollars");
		
		System.out.println(" " + nC + " cents");
		
	}

}
