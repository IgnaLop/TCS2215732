package capitulo4;

import java.util.Scanner;

public class Exercise17 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		System.out.print("Enter a year: ");
		
		int year = inp.nextInt();
		System.out.print("Enter a month: ");
		
		String month = inp.next();

		boolean lY =	((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);

		// Display the number of day in the month
		System.out.print(month + " " + year + " has ");
		
		if ( month.equals("Jan") || month.equals("Mar") || month.equals("May") || month.equals("Jul") || month.equals("Aug") || month.equals("Oct") || month.equals("Dec"))
			System.out.println(31 + " days");
		
		else if (month.equals("Apr") || month.equals("Jun") ||	month.equals("Sep") || month.equals("Nov"))
			System.out.println(30 + " days");
		
		else
			System.out.println(((lY) ? 29 : 28) + " days");	
	}

}
