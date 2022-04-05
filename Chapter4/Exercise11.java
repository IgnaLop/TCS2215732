package capitulo4;

import java.util.Scanner;

public class Exercise11 {
	public static void main(String args[]){
	       Scanner inp = new Scanner( System.in );
	       System.out.print("Enter binary digits (0000 to 1111): ");
	       String binaryString =inp.nextLine();
	       System.out.println("The decimal value is: "+Integer.parseInt(binaryString,2));
	    }

}
