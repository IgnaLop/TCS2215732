package capitulo4;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		final double RAD = 6371.01;

		System.out.print("Enter point 1 (latitude and longitude) in degrees: ");

		String xy1 = inp.nextLine();
		
		System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
		
		String xy2 = inp.nextLine();

		int k = xy1.indexOf(',');
	
		double x1 = Double.parseDouble(xy1.substring(0, k - 1));
	
		double y1 = Double.parseDouble(xy1.substring(k + 2));
		
		k = xy2.indexOf(',');
		
		double x2 = Double.parseDouble(xy2.substring(0, k - 1));
		
		double y2 = Double.parseDouble(xy2.substring(k + 2));
		
		x1 = Math.toRadians(x1);
		
		y1 = Math.toRadians(y1);
		
		x2 = Math.toRadians(x2);
		
		y2 = Math.toRadians(y2);

		double dc = RAD * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

		System.out.println("The distance between the two points is " + dc);
	}

}
