package capitulo5;

import java.util.Scanner;

public class Exercise45 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		double mn, dev, num;
		
		mn = dev = 0;

		System.out.print("Enter ten numbers: ");

		for (int i = 1; i <= 10; i++) {
			num = inp.nextDouble();
			mn += num;
			dev += Math.pow(num, 2); 
		}
		dev =  Math.sqrt((dev - (Math.pow(mn, 2) / 10)) / (10 - 1));
		mn /= 10;


		System.out.println("The mean is " + mn);
		System.out.printf("The standard deviation is %.5f\n", dev);
	}

}
