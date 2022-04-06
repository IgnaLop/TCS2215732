package capitulo5;

public class Exercise12 {
	public static void main(String[] args) {
		int n = 0;


		while (Math.pow(n, 3) <= 12000) {

		while (Math.pow(n, 3) < 12000) {
			n++;
		}

		System.out.println(
			"The smallest integer n such that n^2 is greater than 12,000: " + n);
	}

	}

}