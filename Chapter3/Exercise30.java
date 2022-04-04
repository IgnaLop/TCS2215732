package capitulo3;

import java.util.Scanner;

public class Exercise30 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		System.out.print("Enter the time zone offset to GMT: ");
		int offset = inp.nextInt();

		long tMil = System.currentTimeMillis();

		long tSec = tMil / 1000;

		long cSec = tSec % 60;

		long tMin = tSec / 60;

		long cMin = tMin % 60;

		long tH = tMin / 60;

		long cH = tH % 24;
		cH = cH + offset;

		System.out.println("Current time is " + ((cH > 12) ? cH - 12 : cH) + ":" + cMin + ":" + cSec +	((cH > 12) ? " PM" : " AM"));
	}

}
