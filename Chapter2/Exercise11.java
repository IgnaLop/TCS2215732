package capitulo2;

import java.util.Scanner;

public class Exercise11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of years: ");
		
		int yr = input.nextInt();
		int pop = 312032486 + (((31536000/7) - (31536000/13) + (31536000/45)) * yr);

		System.out.println("The population in " + yr + " is " + pop);
	}

}
