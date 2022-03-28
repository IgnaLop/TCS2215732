package capitulo2;

import java.util.Scanner;

public class Exercise16 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter the side: ");
		
		double sd = inp.nextDouble();

		
		double a = ((3 * Math.pow(3, 0.5)) / 2) * Math.pow(sd, 2);

		
		System.out.println("The area of the hexagon is " + a); 
	}

}
