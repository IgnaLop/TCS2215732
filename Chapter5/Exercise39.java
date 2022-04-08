package capitulo5;

public class Exercise39 {
	public static void main(String[] args) {

		final double cS = 30000; 
		double sAm, com, bal;
		sAm = 0;
		do {	
			bal = com = 0;
			sAm += 0.01;


			if (sAm > 10000)
				com += (bal = sAm - 10000) * 0.10;


			if (sAm > 5000)
				com += (bal -= bal - 5000) * 0.08;


			if (sAm > 0)
				com += bal * 0.06;


		} while (com < cS);


		System.out.printf("Minimum sales to earn $30,000: $%.0f\n", sAm);
	}
}
