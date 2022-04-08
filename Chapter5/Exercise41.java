package capitulo5;

import java.util.Scanner;

public class Exercise41 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		System.out.print("Enter numbers: ");
		int mx = inp.nextInt();
		int ct = 1;
		int num = 0;


		while (num > 0) {
			num = inp.nextInt();
			if (num > mx) {
				mx = num;
				ct = 1;
			}
			if (num == mx)
				ct++;
		} 

		System.out.println("The largest number is " + mx);
		System.out.println("The occurrence count of the largest number is " + ct);
	}

}
