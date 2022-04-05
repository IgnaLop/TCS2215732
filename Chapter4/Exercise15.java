package capitulo4;

import java.util.Scanner;

public class Exercise15 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		System.out.print("Enter a letter: ");
		String s = inp.nextLine();
		char ch = s.charAt(0);
		ch = Character.toUpperCase(ch);
		
		int num = 0;
		if (Character.isLetter(ch))
		{
			if (ch >= 'W')
				num = 9;
		
			else if (ch >= 'T')
				num = 8;
			
			else if (ch >= 'P')
				num = 7;
			
			else if (ch >= 'M')
				num = 6;
			
			else if (ch >= 'J')
				num = 5;
			
			else if (ch >= 'G')
				num = 4;
			
			else if (ch >= 'D')
				num = 3;
			
			else if (ch >= 'A')
				num = 2;
			
			System.out.println("The corresponding number is " + num);
		}
		
		else
			System.out.println(ch + " is an invalid input");
	}

}
