package capitulo4;

import java.util.Scanner;

public class Exercise8 {
	public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter an ASCII code: ");
        
        int num = inp.nextInt();
        
        inp.close();

        System.out.println("The character for ASCII code " + num + " is " + (char) num);
    }

}
