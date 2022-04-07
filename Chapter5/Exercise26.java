package capitulo5;

public class Exercise26 {
	public static void main(String[] args) {
		
		double e = 0.0,
				 val = 10000.0;
		
		for (double i = 1; i <= val; i++) {
		
			double denom = i;
			
			for (double k = i - 1; k >= 1; k--) {
				denom *= k;
			}
			e += 1 / denom;  
		}


		System.out.println("The e value for i = 10000: " + e);


		e = 0.0;
		val = 20000.0;
		
		for (double i = 1; i <= val; i++) {
			double denom = i;
			for (double k = i - 1; k >= 1; k--) {
				denom *= k;
			}
			e += 1 / denom;  
		}


		System.out.println("The e value for i = 20000: " + e);


		e = 0.0;
		val = 100000.0;

		for (double i = 1; i <= val; i++) {
			double denom = i;
			for (double k = i - 1; k >= 1; k--) {
				denom *= k;
			}
			e += 1 / denom;  
		}

		
		System.out.println("The e value for i = 100000: " + e);
	}

}
