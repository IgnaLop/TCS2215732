package capitulo5;

public class Exercise33 {
	public static void main(String[] args) {
		
		System.out.println("The four perfect number less than 10,000:");

		int sum;

		for (int i = 1; i < 10000; i++) {
			sum = 0;

			for (int k = 1; k < i; k++) {

				if (i % k == 0)
					sum += k;
			}

			if (i == sum)
				System.out.printf("%20d\n", i);

		for (int num = 1; num <= 10000; num++) {
			Boolean isPNum = i == sum;
			
				
		}
	}
}

}
