package capitulo7;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		int[] array = new int[11];

		System.out.print("Enter eleven integers: ");

		fill(array);

		for (int i = array.length - 1; i >= 0; i--)
			System.out.print(array[i] + " ");
		System.out.println();
	}

	public static void fill(int[] array) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) 
			array[i] = input.nextInt();
	}

}
