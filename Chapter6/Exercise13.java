package capitulo6;

public class Exercise13 {
	public static void main(String[] args) {
		double sStart  =  1.0;
		double numRows = 20.0;

		System.out.println("\ni         m(i)     ");
		System.out.println("-------------------");

		for (double i = sStart; i <= numRows; i++) {
			System.out.printf("%-10.0f", i);
			System.out.printf("%7.4f\n", sumSeries(i));
		}
	}

	public static double sumSeries(double n) {
		double sum = 0;
		for (double i = 1; i <= n; i++) {
			sum += i / (i + 1);
		}
		return sum;
	}

}
