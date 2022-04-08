package capitulo5;

import java.util.Scanner;

public class Exercise44 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);


		System.out.print("Enter an integer: ");
		short num = inp.nextShort();

		String bts = "";

 
		for (int i = 0; i < 8; i++) {
			bts = (num & 1) + bts;
			num >>= 1;
		}

		System.out.println("The bits are " + bts);
	}

}
