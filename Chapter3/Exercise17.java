package capitulo3;

import java.util.Scanner;

public class Exercise17 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int com = (int)(Math.random() * 3);

		System.out.print("scissor (0), rock (1), paper (2): ");
		
		int us = inp.nextInt();

		System.out.print("The computer is ");
		switch (com)
		{
			case 0: System.out.print("scissor."); break;
			case 1: System.out.print("rock."); break;
			case 2: System.out.print("paper.");
		}

		System.out.print(" You are ");
		switch (us) {
			case 0: System.out.print("scissor"); break;
			
			case 1: System.out.print("rock"); break;
			
			case 2: System.out.print("paper ");
		}

		if (com == us)
			System.out.println(" too. It is a draw");
		
		else {
			boolean win = (us == 0 && com == 2) || (us == 1 && com == 0) || (us == 2 && com == 1);
			
			if (win)
				System.out.println(". You won");
			
			else
				System.out.println(". You lose");
		}
	}

}
