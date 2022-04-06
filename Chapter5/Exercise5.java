package capitulo5;

public class Exercise5 {
	public static void main(String[] args) {
		System.out.println(
			"Celsius     Fahrenheit     |     Fahrenheit     Celsius\n" +
			"----------------------------------------------------------");
		for (double c = 40.0, f = 120.0; 
			  c >= 31.0; c--, f -= 10) {
			System.out.printf("%-12.1f", c);
			System.out.printf("%-15.1f|", cTf(c));
			System.out.printf("     %-15.1f", f);
			System.out.printf("%-7.2f\n\n", fTc(f));
		}
	}

	public static double cTf(double celsius) {
		return (9.0 / 5) * celsius + 32;
	}

	public static double fTc(double fahrenheit) {
		return (5.0 / 9) * (fahrenheit - 32);
	}

}
