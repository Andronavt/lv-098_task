/**
 * 
 */
package polymorphism;

/**
 * @author orecto
 * 
 */
public class Exercise12 {
	public static void main(String[] args) {
		Rodent[] rodArr = { new Rodent(), new Mouse(), new Gerbil(),
				new Hamster() };
		for (Rodent r : rodArr) {
			r.eat();
		}
	}

}
/*
 * Modify Exercise 9 so that it demonstrates the order of initialization of the
 * base classes and derived classes. Now add member objects to both the base and
 * derived classes and show the order in which their initialization occurs
 * during construction
 */