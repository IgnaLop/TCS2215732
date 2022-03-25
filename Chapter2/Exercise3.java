package capitulo2;

import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] Strings) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a value for meter: ");
        double meter = inp.nextDouble();

        double feet = meter * 3.2786;
        System.out.println(meter + " meters is: " + feet + " feet.");
    }

}
