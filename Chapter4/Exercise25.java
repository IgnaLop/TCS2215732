package capitulo4;

public class Exercise25 {
	public static void main(String[] args) {

		int l1 = 65 + (int)(Math.random() * (90 - 65));
		int l2 = 65 + (int)(Math.random() * (90 - 65));
		int l3 = 65 + (int)(Math.random() * (90 - 65));	

		int n1 = (int)(Math.random() * 10);
		int n2 = (int)(Math.random() * 10);
		int n3 = (int)(Math.random() * 10);
		int n4 = (int)(Math.random() * 10);

		System.out.println("" + (char)(l1) + ((char)(l2)) + ((char)(l3)) + n1 + n2 + n3 + n4);
	}

}
