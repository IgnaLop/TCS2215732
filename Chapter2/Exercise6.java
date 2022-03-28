package capitulo2;

import java.util.Scanner;

public class Exercise6 {
	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);		

		
		System.out.print("Enter a number between 0 and 1000: ");
		int num = inp.nextInt();

		
		int less = num % 10;
		
		num /= 10;							
		
		int ten = num % 10;				
		
		num /= 10;							
		
		int hund = num % 10;		
		
		num /= 10;			
		
		int sum = hund + ten + less;	

		
		System.out.println("The sum of the digits is :" + sum);
	}

}
