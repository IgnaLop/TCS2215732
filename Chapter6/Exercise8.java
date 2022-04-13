package capitulo6;

public class Exercise8 {
		public static void main(String[] args) {
			System.out.println(
				"\nMiles     Kilometers     |     Kilometers     Miles\n" +
				"----------------------------------------------");
			for (double mile = 1.0, kmeters = 20.0; mile <= 10.0; mile++, kmeters += 5) {
				System.out.printf("%4.1f     ", mile);
				System.out.printf("%6.3f", mileToKilometer(mile));
				System.out.print("     |     ");
				System.out.printf("%-11.1f", kmeters);
				System.out.printf("%7.3f\n", kilometerToMile(kmeters));
			}
		}
		
		public static double mileToKilometer(double mile) {
			return 1.609 * mile;
		}

		public static double kilometerToMile(double kilometer) {
			return 0.6213 * kilometer;
		}
}
