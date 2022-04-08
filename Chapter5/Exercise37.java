package capitulo5;

import java.util.Scanner;

public class Exercise37 {
	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);


		System.out.print("Enter a decimial interger: ");
		int dec = inp.nextInt();


		String bin = "";
		for (int i = dec; i > 0; i /= 2) {
			bin = (i % 2) + bin; 
		}


		System.out.println(
			"The binary value of the decimial \"" + dec + "\" is: " + bin);
	}

}
