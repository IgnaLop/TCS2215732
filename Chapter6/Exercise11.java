package capitulo6;

public class Exercise11 {
	public static void main(String[] args) {
		System.out.println("\n SalesAmount     Commission");
		System.out.println("-----------------------------");
		for (double sAmount = 10000; sAmount <= 100000; sAmount += 5000) {
			System.out.printf(" %-16.0f", sAmount);
			System.out.printf("%8.1f\n", computeCommission(sAmount));
		}
	}


	public static double computeCommission(double sAmount) {
		double bal, 			
		       com;			
		bal = com = 0.0;


		if (sAmount >= 10000.01)
			com += (bal = sAmount - 10000) * 0.12;


		if (sAmount >= 5000.01)
			com += (bal -= bal - 5000) * 0.10;


		if (sAmount >= 0.01)
				com += bal * 0.08;
			
		return com;
	}

}
