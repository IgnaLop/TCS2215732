package capitulo6;

public class Exercise38 {
	public static void main(String[] args) {
		final int numUP = 100;
		final int numDigits = 100;	
		final int numLine = 10; 

		for (int i = 1; i <= numUP; i++) {
			System.out.print(RandomCharacter.getRandomUpperCaseLetter());
			System.out.print(i % numLine == 0 ? "\n" : " ");
		}

		for (int i = 1; i <= numUP; i++) {
			System.out.print(RandomCharacter.getRandomDigitCharacter());
			System.out.print(i % numLine == 0 ? "\n" : " ");
		}
	}

}
