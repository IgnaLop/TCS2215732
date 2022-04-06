package capitulo5;

public class Exercise20 {
	public static void main(String[] args) {
		final int NPL = 8;
		int ct = 0;

		System.out.println(
			"The prime numbers between 2 and 1,000, inclusive are \n");


		for (int num = 2; num <= 1000; num++) {

			boolean isP = true;

			for (int div = 2; div <= num / 2; div++) {
				if (num % div == 0)	{
					isP = false;	
					break;
				}
			}

			// Display the prime number and increase the count
			if (isP) {
				ct++;	// Increase the count

				if (ct % NPL == 0) {

					System.out.println(num);
				}
				else
					System.out.print(num + " ");
			}
		}
	}
}
