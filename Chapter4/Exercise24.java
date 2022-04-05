package capitulo4;

import java.util.Scanner;

public class Exercise24 {
	public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        String s1 = inp.nextLine();
        System.out.print("Enter the second city: ");
        String s2 = inp.nextLine();
        System.out.print("Enter the third city: ");
        String s3 = inp.nextLine();
        inp.close();

        // NOTE: For the purpose of this assignment, I'm not using an ArrayList/Array
        String temp;
        if (s1.compareTo(s2) < 0) {
            temp = s1;
            s1 = s2;
            s2 = temp;
        }
        if (s2.compareTo(s3) < 0) {
            temp = s2;
            s2 = s3;
            s3 = temp;
        }
        if (s1.compareTo(s2) < 0) {
            temp = s1;
            s1 = s2;
            s2 = temp;
        }

        System.out.println("The three cities in alphabetical order are: ");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }

}
