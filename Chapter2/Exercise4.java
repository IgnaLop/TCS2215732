package capitulo2;

import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] Strings) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a number in square meters: ");
        double smeter = inp.nextDouble();

        double pings = smeter * 0.3025;
        System.out.println(smeter + " square meters is: " + pings + " pings.");
    }


}
