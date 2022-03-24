package capitulo1;

public class Exercise12 {
	public static void main(String[] strings) {

        double horas = 1;
        double minutos = 40;
        double segundos = 35;
        double distanciaMillas = 24;

        double distanciaKm = distanciaMillas * 1.6;

        double tiempoMin = horas * 60.0 + minutos + segundos / 60.0;

        double kmPorHr = 60.0 * distanciaKm / tiempoMin;

        System.out.println(kmPorHr);

    }

}
