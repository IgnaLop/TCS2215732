package capitulo3;

import java.util.Scanner;

public class Exercise8 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		System.out.print("Enter three integers: ");
		int n1 = inp.nextInt();
		int n2 = inp.nextInt();
		int n3 = inp.nextInt();

		// Sort numbers
		int temp;
		if (n2 < n1 || n3 < n1)
		{
			if (n2 < n1)
			{
				temp = n1;
				n1 = n2;
				n2 = temp; 
			}
			if (n3 < n1)
			{
				temp = n1;
				n1 = n3;
				n3 = temp;
			}
		}
		if (n3 < n2)
		{
			temp = n2;
			n2 = n3;
			n3 = temp;
		}

		System.out.println(n1 + " " + n2 + " " + n3);
	}

}
