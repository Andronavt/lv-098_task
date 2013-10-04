/**
 * 
 */
package reusingClasses;

/**
 * @author Andrew
 * 
 */
class OverridingPrivate {
    public final void f() {
	System.out.println("OverridingPrivate.f()");
    }

    public void g() {
	System.out.println("OverridingPrivate.g()");
    }
}

class OverridingPrivate2 extends OverridingPrivate {
    /*
     * public final void f() { System.out.println("OverridingPrivate2.f()"); } -
     * not working
     */
    @Override
    public void g() {
	System.out.println("OverridingPrivate2.g()");
    }
}

public class Exercise20 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	OverridingPrivate2 k = new OverridingPrivate2();
	k.f();

    }

}
