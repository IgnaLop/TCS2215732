package capitulo5;

public class Exercise40 {
	public static void main(String[] args) {
		int hs, ts, c;
		hs = ts = 0; 

		System.out.println("Fipping a coin one millon times..");
		for (int i = 0; i < 1000000; i++) {
			
			c = (int)(Math.random() * 2) == 0 ? hs++ : ts++; 
		}

		System.out.println("Heads: " + hs + "\nTails: " + ts);
	}

}
