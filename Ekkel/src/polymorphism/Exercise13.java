/**
 * 
 */
package polymorphism;

/**
 * @author orecto
 * 
 */

import static staticPack.StaticPrint.print;

class Shared {
	private int refcount = 0;
	private static long counter = 0;
	private final long id = counter++;

	public Shared() {
		print("Creating " + this);
	}

	public void addRef() {
		refcount++;
	}

	protected void dispose() {
		if (--refcount == 0)
			print("Disposing " + this);
	}

	protected void finalise() {
		print("Finalise " + this);
	}

	public String toString() {
		return "Shared " + id;
	}
}

class Composing {
	private Shared shared;
	private static long counter = 0;
	private final long id = counter++;

	public Composing(Shared shared) {
		print("Creating " + this);
		this.shared = shared;
		this.shared.addRef();
	}

	protected void dispose() {
		print("disposing " + this);
		shared.dispose();
		try {
			this.finalize();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.gc();
	}

	protected void finalize() throws Throwable {
		print("Finalise " + this);
	}

	public String toString() {
		return "Composing " + id;
	}
}

public class Exercise13 {
	public static void main(String[] args) {
		Shared shared = new Shared();
		Composing[] composing = new Composing[15];
		for (int i = 0; i < composing.length; i++) {
			composing[i] = new Composing(shared);
		}

		for (Composing c : composing) {
			c.dispose();
		}
	}
}
/*
 * Add a finalize( ) method to ReferenceCounting.java to verify the termination
 * condition (see the Initialization & Cleanup chapter)
 */