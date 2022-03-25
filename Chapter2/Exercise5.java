package capitulo2;

import java.util.Scanner;

public class Exercise5 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		
		System.out.print("Enter the subtotal and a gratuity rate: ");
		double subt= inp.nextDouble();
		double gRate = inp.nextDouble();

		
		double grat = subt * (gRate / 100);
		double total = subt + grat;

		System.out.println("The gratuity is $" + grat + " and total is $" + total);
	}

}
