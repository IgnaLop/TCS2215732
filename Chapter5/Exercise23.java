package capitulo5;

public class Exercise23 {
	public static void main(String[] args) {

		double sRight = 0.0;
		for (double i = 1.0; i <= 50000.0; i++) {
			sRight += 1 / i;
		}


		System.out.println("Summation of series left to right: " + sRight);
		

		double sLeft = 0.0;
		for (double i = 50000.0; i >= 1.0; i--) {
			sLeft += 1 / i;
		}


		System.out.println("Summation of series right to left: " + sLeft);


		System.out.println("Summation of the series right to left - " + "Summation of the series left to right: " + (sLeft - sRight));
	}

}
