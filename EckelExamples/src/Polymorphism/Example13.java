/**
 * 
 */
package Polymorphism;

/**
 * @author Oleg
 * 
 */
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
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("Finalizing Shared");

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
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("Finalizing Composing");

	}
}

public class Example13 {

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("Finalizing Main");

	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("sadasd");
		Shared shared = new Shared();
		Composing[] composing = {new Composing(shared), new Composing(shared),
				new Composing(shared), new Composing(shared),
				new Composing(shared)};
		for (Composing c : composing)
			c.dispose();
		System.runFinalizersOnExit(true);
	}

}
