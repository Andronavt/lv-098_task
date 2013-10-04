/**
 * 
 */
package initializationCleanup;

import static StaticPack.StaticPrint.*;

/**
 * @author orecto
 * 
 */
public class Exercise13 {
	public static void main(String[] args) {
		print("Inside main()");
		Cups.cup1.f(99); // (1)
	}
	// static Cups cups1 = new Cups(); // (2)
	// static Cups cups2 = new Cups(); // (2)
}

class Cup {
	Cup(int marker) {
		print("Cup(" + marker + ")");
	}

	void f(int marker) {
		print("f(" + marker + ")");
	}
}
asdfgh
class Cups {
	static Cup cup1;
	static Cup cup2;
	static {
		cup1 = new Cup(1);
		cup2 = new Cup(2);
	}

	Cups() {
		print("Cups()");
	}
}
/*
 * Output: Inside main() Cup(1) Cup(2) f(99)
 */
/* Verify the statements in the previous paragraph. */