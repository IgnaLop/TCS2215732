package capitulo3;

import java.util.Scanner;

public class Exercise13 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("(0-single filter, 1-married jointly or " + "qualifying widow(er), 2-married separately, 3-head of " + "houshold) Enter the filing status: ");
		int st = inp.nextInt();

		System.out.print("Enter the taxable income: ");
		double inc = inp.nextDouble();

		double tax = 0;

		switch (st)
		{
			case 0 :
						tax += (inc <= 8350) ? inc * 0.10 : 8350 * 0.10;
						if (inc > 8350)
							tax += (inc <= 33950) ? (inc - 8350) * 0.15 :
							25600 * 0.15;
						if (inc > 33950)
							tax += (inc <= 82250) ? (inc - 33950) * 0.25 :
							48300 * 0.25;
						if (inc > 82250)
							tax += (inc <= 171550) ? (inc - 82250) * 0.28 :
							89300 * 0.28;
						if (inc > 171550)
							tax += (inc <= 372950) ? (inc - 171550) * 0.33 :
							201400 * 0.33;
						if (inc > 372950)
							tax += (inc - 372950) * 0.35;
						break;
			case 1 : 
						tax += (inc <= 16700) ? inc * 0.10 : 16700 * 0.10;
						if (inc > 16700)
							tax += (inc <= 67900) ? (inc - 16700) * 0.15 :
							(67900 - 16700) * 0.15;
						if (inc > 67900)
							tax += (inc <= 137050) ? (inc - 67900) * 0.25 :
							(137050 - 67900) * 0.25;
						if (inc > 137050)
							tax += (inc <= 208850) ? (inc - 137050) * 0.28 :
							(208850 - 137050) * 0.28;
						if (inc > 208850)
							tax += (inc <= 372950) ? (inc - 208850) * 0.33 :
							(372950 - 208850) * 0.33;
						if (inc > 372950)
							tax += (inc - 372950) * 0.35;
						break;
			case 2 :
						tax += (inc <= 8350) ? inc * 0.10 : 8350 * 0.10;
						if (inc > 8350)
							tax += (inc <= 33950) ? (inc - 8350) * 0.15 :
							(33950 - 8350) * 0.15;
						if (inc > 33950)
							tax += (inc <= 68525) ? (inc - 33950) * 0.25 :
							(68525 - 33950) * 0.25;
						if (inc > 68525)
							tax += (inc <= 104425) ? (inc - 68525) * 0.28 :
							(104425 - 68525) * 0.28;
						if (inc > 104425)
							tax += (inc <= 186475) ? (inc - 104425) * 0.33 :
							(186475 - 104425) * 0.33;
						if (inc > 186475)
							tax += (inc - 186475) * 0.35;
						break;
			case 3 :
						tax += (inc <= 11950) ? inc * 0.10 : 11950 * 0.10;
						if (inc > 11950)
							tax += (inc <= 45500) ? (inc - 11950) * 0.15 :
							(45500 - 11950) * 0.15;
						if (inc > 45500)
							tax += (inc <= 117450) ? (inc - 45500) * 0.25 :
							(117450 - 45500) * 0.25;
						if (inc > 117450)
							tax += (inc <= 190200) ? (inc - 117450) * 0.28 :
							(190200 - 117450) * 0.28;
						if (inc > 190200)
							tax += (inc <= 372950) ? (inc - 190200) * 0.33 :
							(372950 - 190200) * 0.33;
						if (inc > 372950)
							tax += (inc - 372950) * 0.35;
						break;
			default : System.out.println("Error: invalid status");
								System.exit(1);
		}

		System.out.println("Tax is " + (int)(tax * 100) / 100.0);
	}

}
