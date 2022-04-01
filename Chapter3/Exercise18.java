package capitulo3;

import java.util.Scanner;

public class Exercise18 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		System.out.print("Enter the weight of the package: ");
		double w = inp.nextDouble();

		if (w > 20)
			System.out.println("The package cannot be shipped.");
		else
		{
			double cPP; 
			
			if (w > 0 && w <= 2)
				cPP = 2.5;
			
			else if (w > 2 && w <= 4)
				cPP = 4.5;
			
			else if (w > 4 && w <= 10)
				cPP = 7.5;
			
			else 
				cPP = 10.5;
			System.out.println("Shipping cost of package is $" + cPP * w);
		}
	}

}
