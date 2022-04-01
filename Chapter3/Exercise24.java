package capitulo3;

public class Exercise24 {
	public static void main(String[] args) {
		int r = (int)((Math.random() * (14 - 1)) + 1);

		int s = (int)(Math.random() * 4);

		System.out.print("The card you picked is ");

		switch(r) {
			case 1: System.out.print("Ace"); break;
			
			case 2: System.out.print(r); break;
			
			case 3: System.out.print(r); break;
			
			case 4: System.out.print(r); break;
			
			case 5: System.out.print(r); break;
			
			case 6: System.out.print(r); break;
			
			case 7: System.out.print(r); break;
			
			case 8: System.out.print(r); break;
			
			case 9: System.out.print(r); break;
			
			case 10: System.out.print(r); break;
			
			case 11: System.out.print("Jack"); break;
			
			case 12: System.out.print("Queen"); break;
			
			case 13: System.out.print("King"); 
		}
		System.out.print(" of ");

		switch (s){
			case 0: System.out.println("Clubs"); break;
			
			case 1: System.out.println("Diamonds"); break;
			
			case 2: System.out.println("Hearts"); break;
			
			case 3: System.out.println("Spades"); 
		}
	}

}
