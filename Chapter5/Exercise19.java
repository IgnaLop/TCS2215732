package capitulo5;

public class Exercise19 {
	public static void main(String[] args) { 
		int sR = 0, eS = 7;

		for (int row = 1; row <= 128; row += row) {

			for (int sS = 0; sS < eS; sS++) {
				System.out.print("    ");
			}

			for (int l = 1; l <= row; l += l) {
				System.out.printf("%4d", (l));
			}

			for (int r = sR; r > 0 ; r /= 2 ) {
				System.out.printf("%4d", (r));	
			}

			System.out.println();
			
			eS--; 	
			
			sR = row;
		}
	}

}
