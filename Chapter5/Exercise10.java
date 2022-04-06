package capitulo5;

public class Exercise10 {
	public static void main(String[] args) {
		final int NPL = 10;
		int ct = 0;

		for (int i = 100; i <= 1000; i++) {
			if (i % 3 == 0 && i % 4 == 0) {
				ct++; 
				if (ct % NPL == 0) 
					System.out.println(i);
				else
					System.out.print(i + " ");		
			}
		}
	}

}
