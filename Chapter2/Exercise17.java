package capitulo2;

import java.util.Scanner;

public class Exercise17 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		System.out.print("Enter the temperature in Fahrenheit " +			"between -58ºF and 41ºF: ");
		double temp = inp.nextDouble();
		
		System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
		double sp = inp.nextDouble();

		double wC = 35.74 + 0.6215 * temp - 35.75 * Math.pow(sp, 0.16) + 0.4275 * temp * Math.pow(sp, 0.16);

		System.out.println("The wind chill index is " + wC);
	}

}
