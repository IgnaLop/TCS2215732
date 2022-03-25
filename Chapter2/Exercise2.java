package capitulo2;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String args[]) 
    {   
        Scanner input = new Scanner(System.in); 
		double area;
        System.out.println("Enter length of sides and height of the Equilateral triangle: ");
        double lengthOfSides = input.nextDouble();

        area = (Math.sqrt(3) / 4) * (lengthOfSides * lengthOfSides);
        double volume = area * lengthOfSides;

        System.out.println("The area is " + area);
        System.out.print("The volume of the Triangular prism is " + volume);
     }

}
