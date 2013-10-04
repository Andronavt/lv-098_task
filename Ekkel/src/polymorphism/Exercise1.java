/**
 * 
 */
package polymorphism;

/**
 * @author orecto
 * 
 */
public class Exercise1 {
	public static void main(String[] args) {
		Cycle c = new Cycle();
		Unicycle uc = new Unicycle();
		Bicycle bc = new Bicycle();
		Tricycle tc = new Tricycle();

		c.ride(c);
		c.ride(uc);
		c.ride(bc);
		c.ride(tc);
		System.out.println();

		uc.ride(c);
		uc.ride(uc);
		uc.ride(bc);
		uc.ride(tc);
	}
}

class Cycle {
	void ride(Cycle c) {
		System.out.println("Cycle -> ride: wheels -> " + c.wheels());
	}

	int wheels() {
		return 0;
	}

}

class Unicycle extends Cycle {
	void ride(Cycle c) {
		System.out.println("Unicycle -> ride: wheels -> " + c.wheels());
	}

	int wheels() {
		return 1;
	}

	void balance() {
		System.out.println("Unicycle.balance");
	}
}

class Bicycle extends Cycle {
	void ride(Cycle c) {
		System.out.println("Bicycle -> ride: wheels -> " + c.wheels());
	}

	int wheels() {
		return 2;
	}

	void balance() {
		System.out.println("Bicycle.balance");
	}
}

class Tricycle extends Cycle {
	void ride(Cycle c) {
		System.out.println("Tricycle -> ride: wheels -> " + c.wheels());
	}

	int wheels() {
		return 3;
	}
}

/*
 * Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
 * Demonstrate that an instance of each type can be upcast to Cycle via a ride(
 * ) method
 */