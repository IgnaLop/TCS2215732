package capitulo5;

import java.util.Scanner;

public class Exercise9 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		System.out.print("Enter the number of students: ");
		int nOS = inp.nextInt();

		int score, highest = 0, sH = 0;
		
		String name = "", s1 = "", s2 = "";
		
		System.out.println("Enter each students' name and score:");
		
		for (int i = 0; i < nOS; i++) {
			System.out.print("Student: " + (i + 1) + "\n   Name: ");
			
			name = inp.next();
			
			System.out.print("   Score: ");
			
			score = inp.nextInt();

			if (i == 0) {
				highest = score;
				s1 = name;
			}
			else if (i == 1 && score > highest) {
				sH = highest;
				highest = score;
				s2 = s1;
				s1 = name;
			}
			else if (i == 1) {
				sH = score;
				s2 = name;
			}		
			else if (i > 1 && score > highest && score > sH) { 
				sH = highest;
				s2 = s1;
				highest = score;
				s1 = name;
			}
			else if (i > 1 && score > sH) {
				s2 = name;
				sH = score;
			}
		}

		System.out.println("Higest scoring student: " + s1 + "\nSecond Higest scoring student: " + s2);
	}

}
