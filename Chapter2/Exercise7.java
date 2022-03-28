package capitulo2;

import java.util.Scanner;

public class Exercise7 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		
		System.out.print("Enter the number of minutes: ");
		
		int min = inp.nextInt();

		
		int year = min/525600;
		
		int day = (min%525600)/1440;

		
		System.out.println(min + " minutes is approximately " + year + " years and " + day + " days");
	}

}
