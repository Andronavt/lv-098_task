package eckel.polymorphism;

public class Unicycle extends Cycle {
    @Override
    public void ride() {
	System.out.println("Unicycle.ride()");
	super.ride();
    }

    public void balance() {
	System.out.println("Unicycle.balance()");
    }
}
