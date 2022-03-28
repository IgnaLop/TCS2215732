package capitulo2;

import java.util.Scanner;

public class Exercise8 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		System.out.print("Enter the time zone offset to GMT: ");
		
		int offset = inp.nextInt();
		long milSec = System.currentTimeMillis();
		long totalSec = milSec / 1000;
		long cSec = totalSec % 60;
		long totalMin = totalSec / 60;
		long cMin = totalMin % 60;
		long totalH = totalMin / 60;

	
		long currentHour = totalH % 24; 
		
		currentHour = currentHour + offset;

	
		System.out.println("Current time is " + currentHour + ":" + cMin + ":" + cSec);
	}

}
