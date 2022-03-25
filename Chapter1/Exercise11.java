package capitulo1;

public class Exercise11 {
	public static void main(String[] strings) {

        double nacimientoEnSec = 7.0;
        double muerteEnSec = 13.0;
        double inmiEnSec = 45.0;



        double poblacion = 312032486;

        double segundosEnAños = 60 * 60 * 24 * 365;

        double numCum = segundosEnAños / nacimientoEnSec;
        double numMuertes = segundosEnAños / muerteEnSec;
        double numImmi = segundosEnAños / inmiEnSec;

        for (int i = 1; i <= 5; i++) {
            poblacion += numCum + numImmi - numMuertes;
            System.out.println("Year " + i + " = " + (int)poblacion);

        }


    }

}
