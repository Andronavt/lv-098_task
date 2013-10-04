/**
 * 
 */
package Polymorphism_7;

/**
 * @author Богдан
 * 
 */
public class Exercise13 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Shared shared = new Shared();
	new Composing(shared);
	System.runFinalizersOnExit(true);

    }

}

class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared() {
	System.out.println("Creating " + this);
    }

    public void addRef() {
	refcount++;
    }

    protected void dispose() {
	if (--refcount == 0)
	    System.out.println("Disposing " + this);

    }

    public String toString() {
	return "Shared " + id;
    }

    protected void finalize() {
	if (--refcount == 0)
	    System.out.println("Finalize");
    }

}

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;

    public Composing(Shared shared) {
	System.out.println("Creating " + this);
	this.shared = shared;
	this.shared.addRef();
    }

    protected void dispose() {
	System.out.println("disposing " + this);
	shared.dispose();
    }

    public String toString() {
	return "Composing " + id;
    }

    protected void finalize() {
	shared.finalize();
    }

}
