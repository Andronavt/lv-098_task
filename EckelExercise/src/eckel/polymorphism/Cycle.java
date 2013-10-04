package eckel.polymorphism;

public class Cycle {
    protected void ride() {
	System.out.println("cycle.ride()");
	System.out.println(wheels(2));
    }

    protected int wheels(int k) {
	return k;
    }

}
