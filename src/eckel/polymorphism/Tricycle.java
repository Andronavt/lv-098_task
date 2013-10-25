package eckel.polymorphism;

public class Tricycle extends Cycle {
    @Override
    public void ride() {
	System.out.println("Tricycle.ride()");
	super.ride();
    }

}
