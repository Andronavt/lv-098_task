/**
 * 
 */
package polymorphism;

/**
 * @author orecto
 * 
 */
public class Exercise14 {
	public static void main(String[] args) {
		Rodent[] rodArr = { new Rodent(), new Mouse(), new Gerbil(),
				new Hamster() };
		int i = 0;
		for (Rodent r : rodArr) {
			System.out.println("r" + i++ + " ID = > " + r.getId());
		}
	}
}
/*
 * Modify Exercise 12 so that one of the member objects is a shared object with
 * reference counting, and demonstrate that it works properly
 */
