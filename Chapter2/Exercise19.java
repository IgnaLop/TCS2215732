package capitulo2;

import java.util.Scanner;

public class Exercise19 {
	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter three points for a triangle: ");
		
		double x1 = inp.nextDouble();
		
		double y1 = inp.nextDouble();
		
		double x2 = inp.nextDouble();
		
		double y2 = inp.nextDouble();
		
		double x3 = inp.nextDouble();
		
		double y3 = inp.nextDouble();

		
		
		double s1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
		
		double s2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
		
		double s3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);
		
		double s = (s1 + s2 + s3) / 2;
		
		double a = Math.pow(s * (s - s1) * (s - s2) * (s - s3), 0.5);

		System.out.println("The area of the triangle is " + a);
	}

}
