package capitulo5;

import java.util.Scanner;

public class Exercise16 {
	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);


		System.out.print("Enter an integer: ");
		int numb = inp.nextInt();
		int ind = 2; 


		while (numb / ind != 1) {

			if (numb % ind  == 0) {
				System.out.print(ind + ", ");

				numb /= ind; 
			}
			
			else
				ind++;
		}
		System.out.println(numb + ".");
	}

}
