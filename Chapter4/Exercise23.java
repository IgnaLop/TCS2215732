package capitulo4;

import java.util.Scanner;

public class Exercise23 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		System.out.print("Enter employee’s name: ");
		
		String name = inp.next();	

		System.out.print("Enter number of hours worked in a week: ");
		
		double hoursWorked = inp.nextDouble();
		
		System.out.print("Enter hourly pay rate: ");
		
		double hourlyPayRate = inp.nextDouble();
		
		System.out.print("Enter federal tax withholding rate: ");
		
		double federalTaxRate = inp.nextDouble();
		
		System.out.print("Enter state tax withholding rate: ");
		
		double stateTaxRate = inp.nextDouble();

		double grossPay, federal, state, totalDeduction;
		System.out.printf("Employee Name: " + name + "\nHours Worked: " + hoursWorked +	"\nPay Rate: $" + hourlyPayRate +
			"\nGross Pay: $" + (grossPay = hoursWorked * hourlyPayRate) +
			"\nDeductions:\n   Federal Witholding (20.0%): $" +
			(federal = grossPay * federalTaxRate) +
			"\n   State Witholding (9.0%): $" + (state = grossPay * stateTaxRate) +
			"\n   Total Deduction: $" + (totalDeduction = federal + state) +
			"\nNet Pay: $" + (grossPay - totalDeduction)
			);
	}

}
