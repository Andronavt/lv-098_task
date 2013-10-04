/**
 * 
 */
package innerClasses;

/**
 * @author orecto
 * 
 */
/*
 * Modify the solution to Exercise 18 from the Interfaces chapter to use
 * anonymous inner classes
 */
public class Exercise16 {
	public static void rideCycle(CycleFactory factory) {
		Cycle c = factory.getCycle();
		c.ride(c);
	}

	public static void main(String[] args) {
		rideCycle(Unicycle.factory);
		rideCycle(Bicycle.factory);
		rideCycle(Tricycle.factory);
	}
}

interface Cycle {
	void ride(Cycle c);
}

interface CycleFactory {
	Cycle getCycle();
}

class Unicycle implements Cycle {
	public void ride(Cycle c) {
		System.out.println(c.getClass().getName());
	}

	public static CycleFactory factory = new CycleFactory() {
		public Cycle getCycle() {
			return new Unicycle();
		}
	};
}

class Bicycle implements Cycle {
	public void ride(Cycle c) {
		System.out.println(c.getClass().getName());
	}

	public static CycleFactory factory = new CycleFactory() {
		public Cycle getCycle() {
			return new Bicycle();
		}
	};
}

class Tricycle implements Cycle {
	public void ride(Cycle c) {
		System.out.println(c.getClass().getName());
	}

	public static CycleFactory factory = new CycleFactory() {
		public Cycle getCycle() {
			return new Tricycle();
		}
	};
}