package capitulo6;

public class Exercise1 {

	public static void main(String[] args) {
		final int NOP = 100;
		final int NPL = 10;


		System.out.println("The first 100 pentagonal numbers, ten per line: ");
		for (int i = 1; i <= NOP; i++) {

			if (i % NPL == 0) 
				System.out.printf("%7d\n", getPNum(i));
			else
				System.out.printf("%7d", getPNum(i));
		}
	}


	public static int getPNum(int n) {
		return (n * (3 * n - 1)) / 2;
	}
}
