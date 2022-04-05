package capitulo4;

import java.util.Scanner;

public class Exercise7 {
	 public static void main(String[] args) {

	        Scanner inp = new Scanner(System.in);
	        System.out.print("Enter the radius of the bounding circle: ");
	        double rad = inp.nextDouble();
	        inp.close();

	        System.out.println("The coordinates of five points on the pentagon are...");
	        for (int i = 0; i < 5; i++) {

	            double x = rad * Math.sin(2.0 * Math.PI / 5.0 * i);
	            
	            double y = rad * Math.cos(2.0 * Math.PI / 5.0 * i);
	            System.out.println(x + " " + y);
	        }

	    }

}
