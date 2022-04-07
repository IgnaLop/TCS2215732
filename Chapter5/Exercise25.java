package capitulo5;

public class Exercise25 {
	public static void main(String[] args) {
		double sum = 0;
		
		double val = 10000.0;
		
		for (double d = 1; d <= (2 * val - 1); d += 2) {
			sum += 1 / d;
			d += 2;
			sum -= 1 / d; 
		}
		
		double pi = 4 * sum;

		System.out.println("PI value for i = 10000: " + pi);

		sum = 0;

		val = 20000.0;
		
		for (double d = 1; d <= (2 * val - 1); d += 2) {
			sum += 1 / d;
			d += 2;
			sum -= 1 / d; 
		}
		pi = 4 * sum;


		System.out.println("PI value for i = 20000: " + pi);


		sum = 0;
		val = 100000.0;
		for (double d = 1; d <= (2 * val - 1); d += 2) {
			sum += 1 / d;
			d += 2;
			sum -= 1 / d; 
		}
		pi = 4 * sum;


		System.out.println("PI value for i = 100000: " + pi);
	}

}
