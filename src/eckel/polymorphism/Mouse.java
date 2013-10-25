package eckel.polymorphism;

public class Mouse extends Rodent {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;

    Mouse() {
	// System.out.println("Mouse.constructor");
    }

    Mouse(Shared shared) {
	System.out.println("Creating: " + this);
	this.shared = shared;
	this.shared.addRef();
    }

    public void dispose() {
	System.out.println("disposing: " + this);
	shared.dispose();
    }

    public String toString() {
	return "Mouse: " + id;
    }

    @Override
    protected void beBorn() {
	System.out.println("Mouse.beBorn()");
    }

    @Override
    protected void toDie() {
	System.out.println("Mouse.toDie()");
    }
}
