package capitulo5;

import java.util.Scanner;

public class Exercise34 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		int comWins, uWins;
		comWins = uWins = 0;

		do {

			int comp = (int)(Math.random() * 3);
	

			System.out.print("scissor (0), rock(1), paper (2): ");
			int user = inp.nextInt();
	
			System.out.print("The computer is ");

			switch (comp)
			{
				case 0: System.out.print("scissor."); break;
			
				case 1: System.out.print("rock."); break;
				
				case 2: System.out.print("paper."); break;
			}
	
			System.out.print(" You are ");
			switch (user)
			{
				case 0: System.out.print("scissor"); break;
				
				case 1: System.out.print("rock"); break;
				
				case 2: System.out.print("paper"); break;
				
				default : System.out.println("disqualified for entering an invalid number.");
					System.exit(1);
			}
	

			if (comp == user)
				System.out.println(" too, It is a draw");
			else
			{
				boolean win = (user == 0 && comp == 2) || (user == 1 && comp == 0) || (user == 2 && comp == 1);
				if (win)
				{
					System.out.println(". You won");
					comWins++;
				}
				else
				{
					System.out.println(". You lose");
					uWins++;
				}
				
			}

			System.out.println("Computer wins: " + comWins + "\nUser wins: " + uWins);

		} while (Math.abs(comWins - uWins) <= 2);
	}
}
