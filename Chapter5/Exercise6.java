package capitulo5;

public class Exercise6 {
	public static void main(String[] args) {
		System.out.println(
			"Ping     Square Meter     |     Square Meter     Ping\n" +
			"----------------------------------------------------------");
		for (double c = 15.0, f = 100.0; 
			  c >= 1; c--, f -= 10) {
			System.out.printf("%-12.1f", c);
			System.out.printf("%-15.1f|", cTf(c));
			System.out.printf("     %-15.1f", f);
			System.out.printf("%-7.2f\n\n", fTc(f));
		}
	}

	public static double cTf(double p) {
		return p * 3.305;
	}

	public static double fTc(double sq) {
		return sq / 3.305;
	}


}
