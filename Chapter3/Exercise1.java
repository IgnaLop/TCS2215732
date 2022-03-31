package capitulo3;

import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter a, b, c: ");

		double a = inp.nextDouble();
		double b = inp.nextDouble();
		double c = inp.nextDouble();

		double dis = Math.pow(b, 2) - 4 * a * c;

		System.out.print("The equation has ");

		if (dis > 0)
		{
			double r1 = (-b + Math.pow(dis, 0.5)) / (2 * a);  
			double r2 = (-b - Math.pow(dis, 0.5)) / (2 * a);  
			System.out.println("two roots " + r1 + " and " + r2);
		}
		else if (dis == 0)
		{
			double r1 = (-b + Math.pow(dis, 0.5)) / (2 * a);
			System.out.println("one root " + r1);
		}
		else
			System.out.println("no real roots");
	}

}
