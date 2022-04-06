package capitulo5;

public class Exercise15 {
	public static void main(String[] args) {
		final int NPL = 10;
		
		int ct = 0;

		for (int i = 33; i <= 126; i++) {
			ct++;

			if (ct % 10 == 0)
				System.out.println((char)i);

			else
				System.out.print((char)i + " ");	
		
		}
		
		System.out.println();
	}

}
