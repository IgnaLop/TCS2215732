package capitulo7;

import java.util.Scanner;

public class Exercise33 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

	
		String[] zodiacs = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger",
									"rabbit", "dragon", "snake", "horse", "sheep"};

	
		System.out.print("Enter a year: ");
		int year = input.nextInt();

	
		System.out.println(zodiacs[year % 12]);
	}

}
