package eckel.errorhandling;

import javax.management.RuntimeErrorException;

/*/
 * ex 10 and 11
 */

class TenA extends Exception {
    TenA(String msg) {
	super(msg);
    }
}

class TenB extends Exception {
    TenB(String msg) {
	super(msg);
    }
}

public class Ten {
    static void g() throws TenA {
	throw new TenA("SPARTA from g()");
    }

    static void f() {
	// try {
	// try {
	// g();
	// } catch (TenA ta) {
	// ta.printStackTrace();
	// throw new TenB("SPARTA from f(),inner");
	// }
	// } catch (TenB tb) {
	// tb.printStackTrace();
	// }
	try {
	    g();
	} catch (TenA ta) {
	    ta.printStackTrace();
	    throw new RuntimeException(ta);
	}
    }

    public static void main(String[] args) {
	f();
    }

}
