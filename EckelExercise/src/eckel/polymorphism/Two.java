package eckel.polymorphism;

public class Two {
    public static void call(Cycle c) {
	c.ride();
    }

    public static void main(String[] args) {
	Unicycle unicycle = new Unicycle();
	Bicycle bicycle = new Bicycle();
	Tricycle tricycle = new Tricycle();
	call(unicycle);
	call(bicycle);
	call(tricycle);
    }

}
