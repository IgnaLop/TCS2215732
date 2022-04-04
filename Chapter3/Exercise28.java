package capitulo3;

import java.util.Scanner;

public class Exercise28 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		System.out.print("Enter r1's center x-, y-coordinates, width and height: ");

		double r1x = inp.nextDouble();
		
		double r1y = inp.nextDouble();
		
		double r1W = inp.nextDouble();
		
		double r1H = inp.nextDouble();
		
		System.out.print("Enter r2's center x-, y-coordinates, width and height: ");
		
		double r2x = inp.nextDouble();
		
		double r2y = inp.nextDouble();
		
		double r2W = inp.nextDouble();
		
		double r2H = inp.nextDouble();

		
		if	((Math.pow(Math.pow(r2y - r1y, 2), .05) + r2H / 2 <= r1H / 2) && (Math.pow(Math.pow(r2x - r1x, 2), .05) + r2W / 2 <= r1W / 2) && (r1H / 2 + r2H / 2 <= r1H) && (r1W / 2 + r2W / 2 <= r1W))
			System.out.println("r2 is inside r1");
		
		else if ((r1x + r1W / 2 > r2x - r2W) || (r1y + r1H / 2 > r2y - r2H))
			System.out.println("r2 overlaps r1");
		
		else
			System.out.println("r2 does not overlap r1");
	}

}
