package capitulo2;

import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] Strings) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter miles: ");
        double mill = inp.nextDouble();

        double km = mill * 1.6;
        System.out.println(mill + " miles is: " + km + " kilometers.");
    }

}
