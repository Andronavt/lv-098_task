package eckel.errorhandling;

/*
 * 
 */

class NineA extends Exception {
    NineA(String msg) {
	super(msg);
    }
}

class NineB extends Exception {
    NineB(String msg) {
	super(msg);
    }
}

class NineC extends Exception {
    NineC(String msg) {
	super(msg);
    }
}

public class Nine {
    static void foo(int a) throws NineA, NineB, NineC {
	if (a < 0)
	    throw new NineA("SPARTA from NineA");
	if (a == 0)
	    throw new NineB("SPARTA from NineB");
	if (a > 0)
	    throw new NineC("SPARTA from NineC");

    }

    public static void main(String[] args) {
	try {
	    foo(-1);
	    foo(0);
	    foo(1);
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
}
