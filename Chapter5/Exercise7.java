package capitulo5;

public class Exercise7 {
	public static void main(String[] args) {
		int tC = 0;
		int t = 10000;
		int tTY = 0;

		for (int year = 1; year <= 14; year++) {

			t += (t * 0.06);  

			if (year > 10)
				tC += t;


			if (year == 10)
				tTY = t; 
		}

		System.out.println("Tuition in ten years: $" + tTY);


		System.out.println("Total cost for four years' worth of tuition" +
			" after the tenth year: $" + tC);
	}

}
