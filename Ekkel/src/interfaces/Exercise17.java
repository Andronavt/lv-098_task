/**
 * 
 */
package interfaces;

/**
 * @author orecto
 * 
 */
/* Prove that the fields in an interface are implicitly static and final */
public class Exercise17 {
	public static void main(String[] args) {
		// Without any objects, static fields exist:
				System.out.println("SUNDAY = " + Size.S);
				System.out.println("MONDAY = " + Size.M);
				Wardrobe w0 = new Wardrobe();
				Wardrobe w1 = new Wardrobe();
				// w0.S = 2;
				// w1.M = w0.M;
	}
}

interface Size {
	int S = 30, M = 35, L = 40, XL = 50; 
}

class Wardrobe implements Size {
	private static int count = 0;
	private int id = count++;
	public Wardrobe() { System.out.println("Wardrobe() " + id); }
}
