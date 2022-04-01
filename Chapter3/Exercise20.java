package capitulo3;

import java.util.Scanner;

public class Exercise20 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		System.out.print("Enter the temperature in Fahrenheit " + "between -58F and 41F: ");
		
		double temp = inp.nextDouble();
		
		System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
		
		double sp = inp.nextDouble();

		if (temp <= -58 || temp >= 41 || sp < 2) {
			System.out.print("The ");
			
			if (temp <= -58 || temp >= 41)
				System.out.print("temperature ");
			
			if ((temp <= -58 || temp >= 41) && sp < 2)
				System.out.print("and ");
			
			if (sp < 2)
				System.out.print("wind speed ");
			
			System.out.println("is invalid");
			
			System.exit(1);
		}

		double windChill = 35.74 + 0.6215 * temp - 35.75 * Math.pow(sp, 0.16) + 0.4275 * temp * Math.pow(sp, 0.16);

		System.out.println("The wind chill index is " + windChill);
	}

}
