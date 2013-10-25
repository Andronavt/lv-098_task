package eckel.innerclasses;

/*
 * ex 5
 */

class Outerr {
    class Inner {
	public Inner() {
	    System.out.println("inner");	   
	}
    }
}

public class Five {
    Outerr.Inner oi = new Outerr().new Inner();
}
