package capitulo5;

import java.util.Scanner;

public class Exercise8 {
	public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number of student: ");
        
        int sC = inp.nextInt();
        
        inp.nextLine();
        
        String tSN = null;
        
        double tSS = 0;
        
        for (int i = 0; i < sC; i++) {
            System.out.print("Enter name for student #" + (i + 1) + ": ");
            
            String s = inp.next();
            
            System.out.print("Enter score for student #" + (i + 1) + ": ");
            
            double score = inp.nextDouble();

            if (score > tSS) {
                tSN = s;
                tSS = score;
            }
        }
        System.out.println("Top student " + tSN + "'s score is " + tSS);
    }

}
