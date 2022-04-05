package capitulo4;

import java.util.Scanner;

public class Exercise10 {
	public static void main(String[] args) {
	String s1 = " 1  3  5  7\n" + " 9 11 13 15\n" + "17 19 21 23\n" + "25 27 29 31";

	String s2 = " 2  3  6  7\n" + "10 11 14 15\n" + "18 19 22 23\n" +	"26 27 30 31";

	String s3 = " 4  5  6  7\n" + "12 13 14 15\n" + "20 21 22 23\n" +	"28 29 30 31";

	String s4 = " 8  9 10 11\n" +	"12 13 14 15\n" + "24 25 26 27\n" + "28 29 30 31";

	String s5 = "16 17 18 19\n" + "20 21 22 23\n" + "24 25 26 27\n" + "28 29 30 31";

	int d = 0;

	Scanner inp = new Scanner(System.in);

	System.out.print("Is your birthday in Set1?\n");

	System.out.print(s1);
	
	System.out.print("\nEnter Y for Yes and N for No: ");
	
	String s = inp.nextLine();
	
	char ans = s.charAt(0);

	if (Character.toUpperCase(ans) == 'Y')
		d += 1;


	System.out.print("Is your birthday in Set2?\n");

	System.out.print(s2);
	
	System.out.print("\nEnter Y for Yes and N for No: ");
	
	s = inp.nextLine();
	
	ans = s.charAt(0);

	if (Character.toUpperCase(ans) == 'Y')
		d += 2;

	// Prompt the user to answer questions
	System.out.print("Is your birthday in Set3?\n");
	System.out.print(s3);
	System.out.print("\nEnter Y for Yes and N for No: ");
	s = inp.nextLine();
	ans = s.charAt(0);

	if (Character.toUpperCase(ans) == 'Y')
		d += 4;

	System.out.print("Is your birthday in Set4?\n");

	System.out.print(s4);
	
	System.out.print("\nEnter Y for Yes and N for No: ");
	s = inp.nextLine();
	
	ans = s.charAt(0);

	if (Character.toUpperCase(ans) == 'Y')
		d += 8;

	System.out.print("Is your birthday in Set5?\n");

	System.out.print(s5);
	
	System.out.print("\nEnter Y for Yes and N for No: ");
	s = inp.nextLine();
	ans = s.charAt(0);

	if (Character.toUpperCase(ans) == 'Y')
		d += 16;

	System.out.println("\nYour birthday is " + d + "!");
}

}
