package capitulo6;

public class Exercise9 {
	public static void main(String[] args) {
		System.out.println(
			"\nKilograms     Pounds     |     Pounds     Kilograms\n" +
			"----------------------------------------------");
		for (double kg = 1.0, pp = 20.0; kg <= 10.0; kg++, pp += 5) {
			System.out.printf("%4.1f     ", kg);
			System.out.printf("%6.3f", kgToP(kg));
			System.out.print("     |     ");
			System.out.printf("%-11.1f", pp);
			System.out.printf("%7.3f\n", pToKg(pp));
		}
	}
	
	public static double kgToP(double kg) {
		return 2.204 * kg;
	}

	public static double pToKg(double pp) {
		return 0.453 * pp;
	}

}
