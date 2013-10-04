class Cycle2 {
	private String name = "Cycle2";
	public void wheels() {

	}

	public static void riding(Cycle2 c) {
		System.out.println("Cycle2 is riding " + c);
	}

	public String toString() {
		return this.name;
	}
}

class Unicycle2 extends Cycle2 {
	private String name = "Unicycle2";

	public String toString() {
		return this.name;
	}
	public void balance() {
		System.out.println("Balance Unicycle");
	}
	public void wheels() {
		System.out.println("ONE");
	}
}

class Bicycle2 extends Cycle2 {
	private String name = "Bicycle2";

	public String toString() {
		return this.name;
	}
	public void balance() {
		System.out.println("Balance Bicycle2");
	}
	public void wheels() {
		System.out.println("TWO");
	}
}

class Tricycle2 extends Cycle2 {
	private String name = "Tricycle2";

	public String toString() {
		return this.name;
	}
	public void wheels() {
		System.out.println("THREE");
	}
}

public class Example17 {
	public static void ride(Cycle2 c) {
		c.riding(c);
		c.wheels();

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Cycle2[] ride = {new Unicycle2(), new Bicycle2(), new Tricycle2(),};
for(Cycle2 a:ride){
//	a.balance();
}
	}

}
