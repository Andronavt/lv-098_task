package eckel.polymorphism;

public class Bicycle extends Cycle {
    @Override
    public void ride() {
	System.out.println("Bicycle.ride()");
	super.ride();
    }

    public void balance() {
	System.out.println("Bicycle.balance()");
    }

}
