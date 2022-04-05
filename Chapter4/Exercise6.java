package capitulo4;

public class Exercise6 {
	public static void main(String[] args) {
		final double rad = 40;
		
		double a1 = (Math.random() * (2 * Math.PI));
		
		double a2 = (Math.random() * (2 * Math.PI));
		
		double a3 = (Math.random() * (2 * Math.PI));

		
		double x1 = rad * Math.cos(a1);

		double y1 = rad * Math.sin(a1);
		
		double x2 = rad * Math.cos(a2);
		
		double y2 = rad * Math.sin(a2);
		
		double x3 = rad * Math.cos(a3);
		
		double y3 = rad * Math.sin(a3);

		
		double a = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
		
		double b = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
		
		double c = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));


		double aA = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
		
		double aB = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
		
		double aC = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));

		System.out.println("The three angles are " + Math.round(aA * 100) / 100.0 + " " + Math.round(aB * 100) / 100.0 + " " + Math.round(aC * 100) / 100.0);	
	}

}
