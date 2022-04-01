package capitulo3;

public class Exercise16 {
	public static void main(String[] args) {
		int width = (int)((Math.random() * (0 + 50)) -50);
		int height = (int)((Math.random() * (100 + 50)) -50);

		System.out.println("Random coordinate in rectangle centered at (0,0)");
		System.out.println(
			"with width 50 and height 150: (" + width + ", " + height + ")");
	}

}
