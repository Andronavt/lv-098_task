package eckel.polymorphism;

public class Seventy {
    public static void main(String[] args) {
	Unicycle unicycle = new Unicycle();
	Tricycle tricycle = new Tricycle();
	Bicycle bicycle = new Bicycle();
	Cycle[] cycle = { unicycle, tricycle, bicycle };
	for (Cycle c : cycle) {
	    // c.balance();
	}

	unicycle = (Unicycle) new Cycle();
	tricycle = (Tricycle) new Cycle();
	bicycle = (Bicycle) new Cycle();
	// unicycle.balance();
	// tricycle.balance();
	// bicycle.balance();

    }

}
